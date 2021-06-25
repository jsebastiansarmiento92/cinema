package com.cinema.cinema.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "silla")
public class Silla {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_silla;
	
	@Column
	private String nombre;
	
	@Column
	private boolean estado;

	public int getId_silla() {
		return id_silla;
	}

	public void setId_silla(int id_silla) {
		this.id_silla = id_silla;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Silla(int id_silla, String nombre, boolean estado) {
		super();
		this.id_silla = id_silla;
		this.nombre = nombre;
		this.estado = estado;
	}

	public Silla() {
		super();
	}
	
	

}
