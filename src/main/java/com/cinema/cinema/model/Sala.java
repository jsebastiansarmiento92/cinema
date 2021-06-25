package com.cinema.cinema.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "sala")
public class Sala {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSala;
	
	@ManyToOne //importante en versiones anteriores es recomendable colocar (fetch = FetchType.LAZY)
	@JoinColumn(name="tipo_sala")
	private TipoSala tipoSala;
	
	@ManyToOne //importante en versiones anteriores es recomendable colocar (fetch = FetchType.LAZY)
	@JoinColumn(name="sucursal")
	private Sucursal sucursal;

	public int getIdSala() {
		return idSala;
	}

	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}

	public TipoSala getTipoSala() {
		return tipoSala;
	}

	public void setTipoSala(TipoSala tipoSala) {
		this.tipoSala = tipoSala;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public Sala(int idSala, TipoSala tipoSala, Sucursal sucursal) {
		super();
		this.idSala = idSala;
		this.tipoSala = tipoSala;
		this.sucursal = sucursal;
	}

	public Sala() {
		super();
	}
	
	
}
