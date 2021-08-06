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
import com.school.model.Circuito;
import com.school.service.ICircuitoService;

@RestController
@RequestMapping("/circuitos")
public class CircuitoController {

	@Autowired
	ICircuitoService service;
	
	@GetMapping()
	ResponseEntity<List<Circuito>>listar()throws Exception{
		return new ResponseEntity<>(service.listar(),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	ResponseEntity<Circuito> listarPorId(@PathVariable("id") int id)throws Exception{
		Circuito obj=service.listarPorId(id);
		if (obj==null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO "+id);
		}
		return new ResponseEntity<>(obj,HttpStatus.OK);
	}
	
	@PostMapping
	ResponseEntity<Circuito> registrar(@Valid @RequestBody Circuito circuito)throws Exception{
		return new ResponseEntity<>(service.registrar(circuito),HttpStatus.CREATED);
	}
	
	@PutMapping
	ResponseEntity<Circuito> modificar(@Valid @RequestBody Circuito circuito)throws Exception{
		return new ResponseEntity<>(service.modificar(circuito),HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	ResponseEntity<Void> eliminar(@PathVariable("id") int id)throws Exception{
		service.eliminar(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
