package com.cinema.cinema.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "agenda")
public class Agenda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAgenda;
	
	@ManyToOne //importante en versiones anteriores es recomendable colocar (fetch = FetchType.LAZY)
	@JoinColumn(name="pelicula")
	private Pelicula pelicula;
	
	@ManyToOne //importante en versiones anteriores es recomendable colocar (fetch = FetchType.LAZY)
	@JoinColumn(name="sala")
	private Sala sala;
	
	@Column
	private LocalDate fechaPresentacion;
	
	@Column 
	private LocalTime horaInicio;
	
	@Column 
	private LocalTime horaFin;

	public int getIdAgenda() {
		return idAgenda;
	}

	public void setIdAgenda(int idAgenda) {
		this.idAgenda = idAgenda;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public LocalDate getFechaPresentacion() {
		return fechaPresentacion;
	}

	public void setFechaPresentacion(LocalDate fechaPresentacion) {
		this.fechaPresentacion = fechaPresentacion;
	}

	public LocalTime getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}

	public LocalTime getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(LocalTime horaFin) {
		this.horaFin = horaFin;
	}

	public Agenda(int idAgenda, Pelicula pelicula, Sala sala, LocalDate fechaPresentacion, LocalTime horaInicio,
			LocalTime horaFin) {
		super();
		this.idAgenda = idAgenda;
		this.pelicula = pelicula;
		this.sala = sala;
		this.fechaPresentacion = fechaPresentacion;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
	}

	public Agenda() {
		super();
	}
	
	
	
}
