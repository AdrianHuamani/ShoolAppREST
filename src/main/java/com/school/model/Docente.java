package com.school.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="docente",schema="public")
public class Docente {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Size(min=8,max=11,message="Ingrese un RUC o DNI valido")
	@Column(name="dni_ruc", nullable=false,length=250,unique=true)
	private String dni_ruc;
	
	@Size(min=9,max=9,message="Ingrese un numero de licencia valido")
	@Column(name="numero_licencia",nullable=false,length=250,unique=true)
	private String numero_licencia;
	
	@Size(min=3,max=255,message="{nombres.size}")
	@Column(name="nombres",nullable=false,length=250)
	private String nombres;
	
	@Size(min=3,max=255,message="{apellidos.size}")
	@Column(name="apellidos",nullable=false,length=250)
	private String apellidos;
	
	@Size(min=3,max=3,message="Ingrese categoria valida")
	@Column(name="categoria",nullable=false,length=3)
	private String categoria_licencia;
	
	
	@Column(name="fecha_emision",nullable=false)
	private LocalDate fecha_emision;
	
	@Column(name="fecha_expiracion", nullable=false)
	private LocalDate fecha_expiracion;
	
	@Column(name="fecha_contratacion",nullable=false)
	private LocalDate fecha_contratacion;
	
	@OneToMany(mappedBy="id_docente",cascade= {CascadeType.ALL},orphanRemoval=false)//orphan removal falso para que no se borre una asistencia solita
	List<Asistencia>asistencias;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDni_ruc() {
		return dni_ruc;
	}

	public void setDni_ruc(String dni_ruc) {
		this.dni_ruc = dni_ruc;
	}

	public String getNumero_licencia() {
		return numero_licencia;
	}

	public void setNumero_licencia(String numero_licencia) {
		this.numero_licencia = numero_licencia;
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

	public String getCategoria_licencia() {
		return categoria_licencia;
	}

	public void setCategoria_licencia(String categoria_licencia) {
		this.categoria_licencia = categoria_licencia;
	}

	public LocalDate getFecha_emision() {
		return fecha_emision;
	}

	public void setFecha_emision(LocalDate fecha_emision) {
		this.fecha_emision = fecha_emision;
	}

	public LocalDate getFecha_expiracion() {
		return fecha_expiracion;
	}

	public void setFecha_expiracion(LocalDate fecha_expiracion) {
		this.fecha_expiracion = fecha_expiracion;
	}

	public LocalDate getFecha_contratacion() {
		return fecha_contratacion;
	}

	public void setFecha_contratacion(LocalDate fecha_contratacion) {
		this.fecha_contratacion = fecha_contratacion;
	}

	public List<Asistencia> getAsistencias() {
		return asistencias;
	}

	public void setAsistencias(List<Asistencia> asistencias) {
		this.asistencias = asistencias;
	}
	
	
	
}
