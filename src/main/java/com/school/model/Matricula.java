package com.school.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="matricula",schema="public")
public class Matricula {

	public int getId_matricula() {
		return id_matricula;
	}

	public void setId_matricula(int id_matricula) {
		this.id_matricula = id_matricula;
	}

	public Estudiante getId_estudiante() {
		return id_estudiante;
	}

	public void setId_estudiante(Estudiante id_estudiante) {
		this.id_estudiante = id_estudiante;
	}

	public Curso getId_curso() {
		return id_curso;
	}

	public void setId_curso(Curso id_curso) {
		this.id_curso = id_curso;
	}

	public LocalDate getFecha_matricula() {
		return fecha_matricula;
	}

	public void setFecha_matricula(LocalDate fecha_matricula) {
		this.fecha_matricula = fecha_matricula;
	}

	public LocalDate getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(LocalDate fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public Double getDescuento() {
		return descuento;
	}

	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}

	public Double getMonto_total() {
		return monto_total;
	}

	public void setMonto_total(Double monto_total) {
		this.monto_total = monto_total;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public int getHoras_acedemicas_cursadas() {
		return horas_acedemicas_cursadas;
	}

	public void setHoras_acedemicas_cursadas(int horas_acedemicas_cursadas) {
		this.horas_acedemicas_cursadas = horas_acedemicas_cursadas;
	}

	public List<Clase> getClases() {
		return clases;
	}

	public void setClases(List<Clase> clases) {
		this.clases = clases;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_matricula;
	
	@ManyToOne
	@JoinColumn(name="id_estudiante",foreignKey=@ForeignKey(name="matricula_estudiante"))
	private Estudiante id_estudiante;
	
	@ManyToOne
	@JoinColumn(name="id_curso",foreignKey=@ForeignKey(name="id_curso"))
	private Curso id_curso;
	
	@Column(name="fecha_matricula",nullable=false)
	private LocalDate fecha_matricula;
	
	@Column(name="fecha_fin",nullable=false)
	private LocalDate fecha_fin;
	
	@Column(name="descuento",nullable=false)
	private Double descuento;
	
	@Column(name="monto_total",nullable=false)
	private Double monto_total;
	
	@Column(name="estado",nullable=false)
	private Boolean estado;
	
	@Column(name="horas_acedemicas_cursadas",nullable=false)
	private int horas_acedemicas_cursadas;
	
	@OneToMany(mappedBy="id_matricula",cascade= {CascadeType.ALL},orphanRemoval=true)
	List<Clase>clases;
	
}
