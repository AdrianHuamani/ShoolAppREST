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
import com.school.model.Asistencia;
import com.school.service.IAsistenciaService;

@RestController
@RequestMapping("/asistencias")
public class AsistenciaController {

	@Autowired
	private IAsistenciaService service;
	
	@GetMapping
	public ResponseEntity<List<Asistencia>> listar() throws Exception{
		return new ResponseEntity<>(service.listar(),HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Asistencia> listarPorId(@PathVariable("id") int id)throws Exception{
		Asistencia obj=service.listarPorId(id);
		if (obj==null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO "+id);
		}
		return new ResponseEntity<>(obj,HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Asistencia> registrar(@Valid @RequestBody Asistencia asistencia) throws Exception{
		return new ResponseEntity<>(service.registrar(asistencia),HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Asistencia> modificar(@Valid @RequestBody Asistencia asistencia)throws Exception{
		return new ResponseEntity<>(service.modificar(asistencia),HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable("id") int id)throws Exception{
		service.eliminar(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
}
