package com.cinema.cinema.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tipo_sala")
public class TipoSala {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTipoSala;
	
	@Column
	private String nombre;
	
	@Column
	private String descripcion;

	public int getIdTipoSala() {
		return idTipoSala;
	}

	public void setIdTipoSala(int idTipoSala) {
		this.idTipoSala = idTipoSala;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public TipoSala(int idTipoSala, String nombre, String descripcion) {
		super();
		this.idTipoSala = idTipoSala;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public TipoSala() {
		super();
	}

	
}
