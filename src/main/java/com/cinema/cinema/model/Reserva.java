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
@Table(name = "reserva")
public class Reserva {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idReserva;
	
	@ManyToOne //importante en versiones anteriores es recomendable colocar (fetch = FetchType.LAZY)
	@JoinColumn(name="lugar")
	private Lugar lugar;
	
	@ManyToOne //importante en versiones anteriores es recomendable colocar (fetch = FetchType.LAZY)
	@JoinColumn(name="sucursal")
	private Sucursal sucursal;
	
	@ManyToOne //importante en versiones anteriores es recomendable colocar (fetch = FetchType.LAZY)
	@JoinColumn(name="pelicula")
	private Pelicula pelicula;
	
	@Column
	private LocalDate fechaFuncion;
	
	@Column
	private LocalTime horaFuncion;
	
	@Column 
	private int cantidadSillas;
	
	@Column
	private boolean confirmarReserva;

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public Lugar getLugar() {
		return lugar;
	}

	public void setLugar(Lugar lugar) {
		this.lugar = lugar;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public LocalDate getFechaFuncion() {
		return fechaFuncion;
	}

	public void setFechaFuncion(LocalDate fechaFuncion) {
		this.fechaFuncion = fechaFuncion;
	}

	public LocalTime getHoraFuncion() {
		return horaFuncion;
	}

	public void setHoraFuncion(LocalTime horaFuncion) {
		this.horaFuncion = horaFuncion;
	}

	public int getCantidadSillas() {
		return cantidadSillas;
	}

	public void setCantidadSillas(int cantidadSillas) {
		this.cantidadSillas = cantidadSillas;
	}

	public boolean isConfirmarReserva() {
		return confirmarReserva;
	}

	public void setConfirmarReserva(boolean confirmarReserva) {
		this.confirmarReserva = confirmarReserva;
	}

	public Reserva(int idReserva, Lugar lugar, Sucursal sucursal, Pelicula pelicula, LocalDate fechaFuncion,
			LocalTime horaFuncion, int cantidadSillas, boolean confirmarReserva) {
		super();
		this.idReserva = idReserva;
		this.lugar = lugar;
		this.sucursal = sucursal;
		this.pelicula = pelicula;
		this.fechaFuncion = fechaFuncion;
		this.horaFuncion = horaFuncion;
		this.cantidadSillas = cantidadSillas;
		this.confirmarReserva = confirmarReserva;
	}

	public Reserva() {
		super();
	}
	
	
}
