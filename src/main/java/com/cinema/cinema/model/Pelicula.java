package com.cinema.cinema.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;


@Entity
@Table(name = "pelicula")
public class Pelicula {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPelicula;
	
	@Column
	private String nombreOriginal;
	
	@Column
	private String nombreTraducido;
	
	@Column
	private LocalDate fechaEstreno;
	
	@Column
	private String rutaImagen;
	
	@Column
	private LocalDate fechaBajaPelicula;
	
	@Column
	private LocalDate fechaFinPelicula;
	
	@Column
	private String sinopsis;
	
	@Column
	private LocalTime duracion;
	
	@ManyToOne 
	@JoinColumn(name="genero")
	private Genero genero;
	
	@ManyToOne 
	@JoinColumn(name="tipo_sala")
	private TipoSala tipoSala;
	
	@NotNull
    @ManyToMany
    private Set<Sucursal> sucursales = new HashSet<>();

	public int getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}

	public String getNombreOriginal() {
		return nombreOriginal;
	}

	public void setNombreOriginal(String nombreOriginal) {
		this.nombreOriginal = nombreOriginal;
	}

	public String getNombreTraducido() {
		return nombreTraducido;
	}

	public void setNombreTraducido(String nombreTraducido) {
		this.nombreTraducido = nombreTraducido;
	}

	public LocalDate getFechaEstreno() {
		return fechaEstreno;
	}

	public void setFechaEstreno(LocalDate fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}

	public String getRutaImagen() {
		return rutaImagen;
	}

	public void setRutaImagen(String rutaImagen) {
		this.rutaImagen = rutaImagen;
	}

	public LocalDate getFechaBajaPelicula() {
		return fechaBajaPelicula;
	}

	public void setFechaBajaPelicula(LocalDate fechaBajaPelicula) {
		this.fechaBajaPelicula = fechaBajaPelicula;
	}

	public LocalDate getFechaFinPelicula() {
		return fechaFinPelicula;
	}

	public void setFechaFinPelicula(LocalDate fechaFinPelicula) {
		this.fechaFinPelicula = fechaFinPelicula;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public LocalTime getDuracion() {
		return duracion;
	}

	public void setDuracion(LocalTime duracion) {
		this.duracion = duracion;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public TipoSala getTipoSala() {
		return tipoSala;
	}

	public void setTipoSala(TipoSala tipoSala) {
		this.tipoSala = tipoSala;
	}

	public Set<Sucursal> getSucursales() {
		return sucursales;
	}

	public void setSucursales(Set<Sucursal> sucursales) {
		this.sucursales = sucursales;
	}

	public Pelicula(int idPelicula, String nombreOriginal, String nombreTraducido, LocalDate fechaEstreno,
			String rutaImagen, LocalDate fechaBajaPelicula, LocalDate fechaFinPelicula, String sinopsis,
			LocalTime duracion, Genero genero, TipoSala tipoSala, Set<Sucursal> sucursales) {
		super();
		this.idPelicula = idPelicula;
		this.nombreOriginal = nombreOriginal;
		this.nombreTraducido = nombreTraducido;
		this.fechaEstreno = fechaEstreno;
		this.rutaImagen = rutaImagen;
		this.fechaBajaPelicula = fechaBajaPelicula;
		this.fechaFinPelicula = fechaFinPelicula;
		this.sinopsis = sinopsis;
		this.duracion = duracion;
		this.genero = genero;
		this.tipoSala = tipoSala;
		this.sucursales = sucursales;
	}

	public Pelicula() {
		super();
	}
	

}
