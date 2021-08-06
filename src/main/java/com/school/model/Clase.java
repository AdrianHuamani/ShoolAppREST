package com.school.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="clase",schema="public")
public class Clase {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_clase;
	
	@ManyToOne
	@JoinColumn(name="id_matricula",foreignKey=@ForeignKey(name="relacion_clase_matricula"))
	private Matricula id_matricula;
	
	@Column(name="fecha",nullable=false)
	private LocalDate fecha;
	
	@Column(name="hora_inicio",nullable=false)
	private LocalDateTime hora_inicio;
	
	@Column(name="hora_fin",nullable=false)
	private LocalDateTime hora_fin;
	
	@ManyToOne
	@JoinColumn(name="id_vehiculo",foreignKey=@ForeignKey(name="relacion_clase_vehiculo"))
	private Vehiculo id_vehiculo;
	
	@ManyToOne
	@JoinColumn(name="id_docente",foreignKey=@ForeignKey(name="relacion_clase_docente"))
	private Docente id_docente;
	
	@ManyToOne
	@JoinColumn(name="id_circuito",foreignKey=@ForeignKey(name="relacion_clase_circuito"))
	private Circuito id_circuito;
	
	@Column(name="numero_horas_academicas",nullable=false)
	private int numero_horas_academicas;
	
	@Column(name="observacion",nullable=false)
	private String obervacion;

	public int getId_clase() {
		return id_clase;
	}

	public void setId_clase(int id_clase) {
		this.id_clase = id_clase;
	}

	public Matricula getId_matricula() {
		return id_matricula;
	}

	public void setId_matricula(Matricula id_matricula) {
		this.id_matricula = id_matricula;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalDateTime getHora_inicio() {
		return hora_inicio;
	}

	public void setHora_inicio(LocalDateTime hora_inicio) {
		this.hora_inicio = hora_inicio;
	}

	public LocalDateTime getHora_fin() {
		return hora_fin;
	}

	public void setHora_fin(LocalDateTime hora_fin) {
		this.hora_fin = hora_fin;
	}

	public Vehiculo getId_vehiculo() {
		return id_vehiculo;
	}

	public void setId_vehiculo(Vehiculo id_vehiculo) {
		this.id_vehiculo = id_vehiculo;
	}

	public Docente getId_docente() {
		return id_docente;
	}

	public void setId_docente(Docente id_docente) {
		this.id_docente = id_docente;
	}

	public Circuito getId_circuito() {
		return id_circuito;
	}

	public void setId_circuito(Circuito id_circuito) {
		this.id_circuito = id_circuito;
	}

	public int getNumero_horas_academicas() {
		return numero_horas_academicas;
	}

	public void setNumero_horas_academicas(int numero_horas_academicas) {
		this.numero_horas_academicas = numero_horas_academicas;
	}

	public String getObervacion() {
		return obervacion;
	}

	public void setObervacion(String obervacion) {
		this.obervacion = obervacion;
	}
	
}
