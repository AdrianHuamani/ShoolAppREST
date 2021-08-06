package com.school.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="propietario",schema="public")
public class Propietario {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_propietario;
	
	@Size(min=8,max=11,message="Ingrese un dni o ruc valido")
	@Column(name="dni_ruc",nullable=false,length=250,unique=true)
	private String dni_ruc;
	
	@Size(min=3,max=255,message="Ingrese nombre valido")
	@Column(name="nombres",nullable=false,length=250)
	private String nombres;
	
	@Size(min=3,max=255,message="Ingrese apellido valido")
	@Column(name="apellidos",nullable=false,length=250)
	private String apellidos;
	
	@Size(min=9,max=9,message="Ingrese telefono valido")
	@Column(name="telefono",nullable=false,length=9)
	private String telefono;
	
	@Size(min=3,max=255,message="Ingrese direccion valido")
	@Column(name="direccion",nullable=false,length=250)
	private String direccion;

	public int getId_propietario() {
		return id_propietario;
	}

	public void setId_propietario(int id_propietario) {
		this.id_propietario = id_propietario;
	}

	public String getDni_ruc() {
		return dni_ruc;
	}

	public void setDni_ruc(String dni_ruc) {
		this.dni_ruc = dni_ruc;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_propietario;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Propietario other = (Propietario) obj;
		if (id_propietario != other.id_propietario)
			return false;
		return true;
	}
	
	
	
}
