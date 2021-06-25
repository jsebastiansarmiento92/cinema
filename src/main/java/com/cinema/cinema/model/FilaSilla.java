package com.cinema.cinema.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "fila_silla")
public class FilaSilla {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne //importante en versiones anteriores es recomendable colocar (fetch = FetchType.LAZY)
	@JoinColumn(name="fila")
	private Fila fila;
	
	@ManyToOne //importante en versiones anteriores es recomendable colocar (fetch = FetchType.LAZY)
	@JoinColumn(name="silla")
	private Silla silla;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Fila getFila() {
		return fila;
	}

	public void setFila(Fila fila) {
		this.fila = fila;
	}

	public Silla getSilla() {
		return silla;
	}

	public void setSilla(Silla silla) {
		this.silla = silla;
	}

	public FilaSilla(int id, Fila fila, Silla silla) {
		super();
		this.id = id;
		this.fila = fila;
		this.silla = silla;
	}

	public FilaSilla() {
		super();
	}
	

}
