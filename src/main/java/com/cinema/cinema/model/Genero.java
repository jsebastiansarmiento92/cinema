package com.cinema.cinema.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "genero")
public class Genero {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idGenero;
	
	@Column
	private String nombreGenero;
	
	@Column
	private String subGeneros;

	public int getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(int idGenero) {
		this.idGenero = idGenero;
	}

	public String getNombreGenero() {
		return nombreGenero;
	}

	public void setNombreGenero(String nombreGenero) {
		this.nombreGenero = nombreGenero;
	}

	public String getSubGeneros() {
		return subGeneros;
	}

	public void setSubGeneros(String subGeneros) {
		this.subGeneros = subGeneros;
	}

	public Genero(int idGenero, String nombreGenero, String subGeneros) {
		super();
		this.idGenero = idGenero;
		this.nombreGenero = nombreGenero;
		this.subGeneros = subGeneros;
	}

	public Genero() {
		super();
	}
	
}
