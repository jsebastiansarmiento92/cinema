package com.cinema.cinema.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "fila")
public class Fila {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFila;
	
	@Column
	private String nombre;
	
	@Column
	private boolean	estado;

	public int getIdFila() {
		return idFila;
	}

	public void setIdFila(int idFila) {
		this.idFila = idFila;
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

	public Fila(int idFila, String nombre, boolean estado) {
		super();
		this.idFila = idFila;
		this.nombre = nombre;
		this.estado = estado;
	}

	public Fila() {
		super();
	}

	
}
