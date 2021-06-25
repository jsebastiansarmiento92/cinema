package com.cinema.cinema.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "sala_fila")
public class SalaFila {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSalaFila;
	
	@ManyToOne //importante en versiones anteriores es recomendable colocar (fetch = FetchType.LAZY)
	@JoinColumn(name="sala")
	private Sala sala;
	
	@ManyToOne //importante en versiones anteriores es recomendable colocar (fetch = FetchType.LAZY)
	@JoinColumn(name="fila")
	private Fila fila;

	public int getIdSalaFila() {
		return idSalaFila;
	}

	public void setIdSalaFila(int idSalaFila) {
		this.idSalaFila = idSalaFila;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public Fila getFila() {
		return fila;
	}

	public void setFila(Fila fila) {
		this.fila = fila;
	}

	public SalaFila(int idSalaFila, Sala sala, Fila fila) {
		super();
		this.idSalaFila = idSalaFila;
		this.sala = sala;
		this.fila = fila;
	}

	public SalaFila() {
		super();
	}
	
	
}
