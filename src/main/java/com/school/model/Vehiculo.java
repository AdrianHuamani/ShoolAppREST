package com.school.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vehiculo",schema="public")
public class Vehiculo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_vehiculo;
	
	@Column(name="placa",nullable=false,length=255)
	private String placa;
	
	@Column(name="color",nullable=false,length=255)
	private String color;
	
	@Column(name="marca",nullable=false,length=255)
	private String marca;
	
	@Column(name="modelo",nullable=false,length=255)
	private String modelo;
	
	@Column(name="estado")
	private Boolean estado;
	
	@Column(name="anotaciones",nullable=false,length=255)
	private String anotaciones;
	
	@Column(name="sede",nullable=false,length=255)
	private String sede;
	
	@Column(name="anio",nullable=false)
	private int anio;

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getId_vehiculo() {
		return id_vehiculo;
	}

	public void setId_vehiculo(int id_vehiculo) {
		this.id_vehiculo = id_vehiculo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public String getAnotaciones() {
		return anotaciones;
	}

	public void setAnotaciones(String anotaciones) {
		this.anotaciones = anotaciones;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_vehiculo;
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
		Vehiculo other = (Vehiculo) obj;
		if (id_vehiculo != other.id_vehiculo)
			return false;
		return true;
	}
	
	
	
}
