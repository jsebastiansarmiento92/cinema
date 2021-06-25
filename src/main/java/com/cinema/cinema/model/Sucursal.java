package com.cinema.cinema.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "sucursal")
public class Sucursal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSucursal;
	
	@Column(name = "nombre")
    private String nombre;
	
	@Column(name = "direccion")
    private String direccion;
	
	@ManyToOne //importante en versiones anteriores es recomendable colocar (fetch = FetchType.LAZY)
	@JoinColumn(name="usuario")
	private Usuario usuario;
	
	@ManyToOne //importante en versiones anteriores es recomendable colocar (fetch = FetchType.LAZY)
	@JoinColumn(name="lugar")
	private Lugar lugar;

	public Long getIdSucursal() {
		return idSucursal;
	}

	public void setIdSucursal(Long idSucursal) {
		this.idSucursal = idSucursal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Lugar getLugar() {
		return lugar;
	}

	public void setLugar(Lugar lugar) {
		this.lugar = lugar;
	}

	public Sucursal(Long idSucursal, String nombre, String direccion, Usuario usuario, Lugar lugar) {
		super();
		this.idSucursal = idSucursal;
		this.nombre = nombre;
		this.direccion = direccion;
		this.usuario = usuario;
		this.lugar = lugar;
	}

	public Sucursal() {
		super();
	}
	
	
}
