package com.school.controller;

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

import com.school.exception.ModeloNotFoundException;
import com.school.model.Propietario;
import com.school.service.IPropietarioService;

@RestController
@RequestMapping("/propietarios")
public class PropietarioController {

	@Autowired
	private IPropietarioService service;
	
	@GetMapping
	ResponseEntity<List<Propietario>> listar()throws Exception{
		return new ResponseEntity<>(service.listar(),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	ResponseEntity<Propietario> listarPorId(@PathVariable("id") int id)throws Exception{
		Propietario obj=service.listarPorId(id);
		if (obj==null) {
			throw new ModeloNotFoundException("EL ID NO SE HA ENCONTRADO "+id);
		}
		return new ResponseEntity<>(obj,HttpStatus.OK);
	}
	
	@PostMapping
	ResponseEntity<Propietario> registrar(@Valid @RequestBody Propietario propietario) throws Exception{
		return new ResponseEntity<>(service.registrar(propietario),HttpStatus.CREATED);
	}
	
	@PutMapping
	ResponseEntity<Propietario> modificar(@Valid @RequestBody Propietario propietario) throws Exception{
		return new ResponseEntity<>(service.modificar(propietario),HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	ResponseEntity<Void> eliminar(@PathVariable int id)throws Exception{
		service.eliminar(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	
}
