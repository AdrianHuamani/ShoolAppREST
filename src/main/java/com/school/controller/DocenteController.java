package com.school.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.school.exception.ModeloNotFoundException;
import com.school.model.Docente;
import com.school.service.IDocenteService;

@RestController
@RequestMapping("/docentes")

public class DocenteController {

	@Autowired
	private IDocenteService service;
	
	@GetMapping
	ResponseEntity<List<Docente>>listar()throws Exception{
		return new ResponseEntity<>(service.listar(),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	ResponseEntity<Docente> listarPorId(@PathVariable("id") int id)throws Exception{
		Docente obj=service.listarPorId(id);
		if (obj==null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO "+id);
		}
		return new ResponseEntity<>(obj,HttpStatus.OK);
	}
	
	@PostMapping
	ResponseEntity<Docente> registrar(@Valid @RequestBody Docente docente)throws Exception{
		 
		Docente obj = service.registrar(docente);
		//localhost:8080/pacientes/1
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(location).build();
		
	}
	
	@PutMapping
	ResponseEntity<Docente> modificar(@Valid @RequestBody Docente docente) throws Exception{
		return new ResponseEntity<>(service.modificar(docente),HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	ResponseEntity<Void> eliminar(@PathVariable("id") int id)throws Exception{
		service.eliminar(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
