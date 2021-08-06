package com.school.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description="Tabla circuito")
@Entity
@Table(name="circuito",schema="public")
public class Circuito {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_circuito;
	
	@Size(min=3,max=255,message="Ingrese denominacion valida")
	@Column(name="denominacion", nullable=false,length=250)
	private String denominacion;
	
	@Size(min=3,max=255,message="Ingrese direccion valido")
	@Column(name="direccion",nullable=true,length=250)
	private String direccion;
	
	@Size(min=3,max=255,message="Ingrese distrito valido")
	@Column(name="distrito",nullable=true,length=250)
	private String distrito;
	
	private String url;

	public int getId_circuito() {
		return id_circuito;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setId_circuito(int id_circuito) {
		this.id_circuito = id_circuito;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	
	
}
