package com.school.exception;

import java.time.LocalDateTime;

public class ExceptionResponse {

	private LocalDateTime fecha;
	private String mensage;
	private String detalles;
	
	public ExceptionResponse() {
		
	}
	
	public ExceptionResponse(LocalDateTime fecha, String mensage, String detalles) {
		super();
		this.fecha = fecha;
		this.mensage = mensage;
		this.detalles = detalles;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getMensage() {
		return mensage;
	}

	public void setMensage(String mensage) {
		this.mensage = mensage;
	}

	public String getDetalles() {
		return detalles;
	}

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}
	
	
	
	
	
}
