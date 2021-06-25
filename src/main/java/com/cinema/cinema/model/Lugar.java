package com.cinema.cinema.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lugar")
public class Lugar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private int codigoDepartamento;
	
	@Column
	private int codigoMunicipio;
	
	@Column
	private String nombreMunicipio;
	
	@Column
	private String nombreDepartamento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCodigoDepartamento() {
		return codigoDepartamento;
	}

	public void setCodigoDepartamento(int codigoDepartamento) {
		this.codigoDepartamento = codigoDepartamento;
	}

	public int getCodigoMunicipio() {
		return codigoMunicipio;
	}

	public void setCodigoMunicipio(int codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	public String getNombreMunicipio() {
		return nombreMunicipio;
	}

	public void setNombreMunicipio(String nombreMunicipio) {
		this.nombreMunicipio = nombreMunicipio;
	}

	public String getNombreDepartamento() {
		return nombreDepartamento;
	}

	public void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}

	public Lugar(Long id, int codigoDepartamento, int codigoMunicipio, String nombreMunicipio,
			String nombreDepartamento) {
		super();
		this.id = id;
		this.codigoDepartamento = codigoDepartamento;
		this.codigoMunicipio = codigoMunicipio;
		this.nombreMunicipio = nombreMunicipio;
		this.nombreDepartamento = nombreDepartamento;
	}

	public Lugar() {
		super();
	}
	

}
