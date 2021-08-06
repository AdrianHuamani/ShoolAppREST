package com.school.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class VehiculoPropietarioFK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name="id_vehiculo", nullable=false)
	private Vehiculo id_vehiculo;
	
	@ManyToOne
	@JoinColumn(name="id_propietario",nullable=false)
	private Propietario id_propietario;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_propietario == null) ? 0 : id_propietario.hashCode());
		result = prime * result + ((id_vehiculo == null) ? 0 : id_vehiculo.hashCode());
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
		VehiculoPropietarioFK other = (VehiculoPropietarioFK) obj;
		if (id_propietario == null) {
			if (other.id_propietario != null)
				return false;
		} else if (!id_propietario.equals(other.id_propietario))
			return false;
		if (id_vehiculo == null) {
			if (other.id_vehiculo != null)
				return false;
		} else if (!id_vehiculo.equals(other.id_vehiculo))
			return false;
		return true;
	}

	
	
	
	
}
