package com.school.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
@Entity
@Table(name="VehiculoPropietario",schema="public")
@IdClass(VehiculoPropietarioFK.class)
public class VehiculoPropietario {

	@Id
	private Vehiculo id_vehiculo;
	
	@Id
	private Propietario id_propietario;

	public Vehiculo getId_vehiculo() {
		return id_vehiculo;
	}

	public void setId_vehiculo(Vehiculo id_vehiculo) {
		this.id_vehiculo = id_vehiculo;
	}

	public Propietario getId_propietario() {
		return id_propietario;
	}

	public void setId_propietario(Propietario id_propietario) {
		this.id_propietario = id_propietario;
	}
	
	
	
}
