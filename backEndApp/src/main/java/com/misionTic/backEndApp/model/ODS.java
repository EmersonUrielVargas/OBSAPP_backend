package com.misionTic.backEndApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ODS {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ods_id;
	private String logoPath;
	private String descripcion;
	
	
	public ODS() {
		
	}


	public String getLogoPath() {
		return logoPath;
	}


	public void setLogoPath(String logoPath) {
		this.logoPath = logoPath;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public int getOds_id() {
		return ods_id;
	}
	
}
