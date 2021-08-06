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
@Table(name="asistencia",schema="public")
public class Asistencia {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_asistencia;
	
	@Column(name="hora_llegada_programada",nullable=false)
	private LocalDateTime hora_llegada_programada;
	
	@Column(name="hora_salida_programada",nullable=false)
	private LocalDateTime hora_salida_programada;
	
	@Column(name="hora_llegada",nullable=false)
	private LocalDateTime hora_llegada;
	
	@Column(name="hora_salida",nullable=false)
	private LocalDateTime hora_salida;
	
	@Column(name="estado_llegada", nullable=false,length=255)
	private String estado_llegada;
	
	@Column(name="fecha",nullable=false)
	private LocalDate fecha;
	
	@ManyToOne
	@JoinColumn(name="id_docente",nullable=false,foreignKey=@ForeignKey(name="foreign_asistencia_docente"))
	private Docente id_docente;
	

	public int getId_asistencia() {
		return id_asistencia;
	}

	public void setId_asistencia(int id_asistencia) {
		this.id_asistencia = id_asistencia;
	}

	public LocalDateTime getHora_llegada_programada() {
		return hora_llegada_programada;
	}

	public void setHora_llegada_programada(LocalDateTime hora_llegada_programada) {
		this.hora_llegada_programada = hora_llegada_programada;
	}

	public LocalDateTime getHora_salida_programada() {
		return hora_salida_programada;
	}

	public void setHora_salida_programada(LocalDateTime hora_salida_programada) {
		this.hora_salida_programada = hora_salida_programada;
	}

	public LocalDateTime getHora_llegada() {
		return hora_llegada;
	}

	public void setHora_llegada(LocalDateTime hora_llegada) {
		this.hora_llegada = hora_llegada;
	}

	public LocalDateTime getHora_salida() {
		return hora_salida;
	}

	public void setHora_salida(LocalDateTime hora_salida) {
		this.hora_salida = hora_salida;
	}

	public String getEstado_llegada() {
		return estado_llegada;
	}

	public void setEstado_llegada(String estado_llegada) {
		this.estado_llegada = estado_llegada;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Docente getId_docente() {
		return id_docente;
	}

	public void setId_docente(Docente id_docente) {
		this.id_docente = id_docente;
	}
	
	
}
