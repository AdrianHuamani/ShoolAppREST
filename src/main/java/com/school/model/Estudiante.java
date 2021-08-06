package com.school.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="estudiante",schema="public")
public class Estudiante {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id_estudiante;
	
	@Size(min=8 ,max=8 ,message="Ingrese dni correcto")
	@Column(name="dni",nullable=false, length=8)
	private String dni;
	
	@Size(min=3,message="Minimo caracter 3")
	@Column(name="nombres",nullable=false,length=250)
	private String nombres;
	
	@Size(min=3,message="Minimo caracteres 3")
	@Column(name="apellidos",nullable=false,length=250)
	private String apellidos;
	
	@Size(min=3,max=9,message="Ingrese numero valido")
	@Column(name="telefono",nullable=true,length=9)
	private String telefono;
	
	@Size(min=3,max=255,message="Ingrese direccion valida")
	@Column(name="direccion",nullable=true,length=250)
	private String direccion;

	public int getId_estudiante() {
		return id_estudiante;
	}

	public void setId_estudiante(int id_estudiante) {
		this.id_estudiante = id_estudiante;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
