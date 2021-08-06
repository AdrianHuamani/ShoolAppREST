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
import com.school.model.Curso;
import com.school.service.ICursoService;

@RestController
@RequestMapping("/cursos")
public class CursoController {

	@Autowired
	private ICursoService service;
	
	@GetMapping
	public ResponseEntity<List<Curso>> listar() throws Exception{
		return new ResponseEntity<>(service.listar(),HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Curso> listarPorId(@PathVariable("id") int id)throws Exception{
		Curso obj=service.listarPorId(id);
		if (obj==null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO "+id);
		}
		return new ResponseEntity<>(obj,HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Curso> registrar(@Valid @RequestBody Curso curso) throws Exception{
		return new ResponseEntity<>(service.registrar(curso),HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Curso> modificar(@Valid @RequestBody Curso curso)throws Exception{
		return new ResponseEntity<>(service.modificar(curso),HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable("id") int id)throws Exception{
		service.eliminar(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
}
