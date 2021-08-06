package com.school.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="curso",schema="public")
public class Curso {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_curso;
	
	@Column(name="denominacion",nullable=false,length=255,unique=true)
	private String denominacion;
	
	@Column(name="numero_clases",nullable=false)
	private int numero_horas_academicas;
	
	@Column(name="precio",nullable=false)
	private double precio;
	
	@Column(name="descripcion",nullable=false,length=250)
	private String descripcion;
	
	@Column(name="categoria_licencia",nullable=false,length=4)
	private String categoria_licencia;

	public int getId_curso() {
		return id_curso;
	}

	public void setId_curso(int id_curso) {
		this.id_curso = id_curso;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public int getNumero_clases() {
		return numero_horas_academicas;
	}

	public void setNumero_clases(int numero_clases) {
		this.numero_horas_academicas = numero_clases;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCategoria_licencia() {
		return categoria_licencia;
	}

	public void setCategoria_licencia(String categoria_licencia) {
		this.categoria_licencia = categoria_licencia;
	}
	
	public int getNumero_horas_academicas() {
		return numero_horas_academicas;
	}

	public void setNumero_horas_academicas(int numero_horas_academicas) {
		this.numero_horas_academicas = numero_horas_academicas;
	}
	
}
