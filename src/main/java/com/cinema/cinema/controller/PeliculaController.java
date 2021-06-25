package com.cinema.cinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cinema.cinema.model.Pelicula;
import com.cinema.cinema.service.PeliculaService;

@RestController
@RequestMapping("/pelicula")
@CrossOrigin(origins = "https://pruebasbw.tk")
public class PeliculaController {
	@Autowired
	private PeliculaService peliculaService;
	
	
	@PostMapping
	public ResponseEntity<Pelicula> insertar(@RequestBody Pelicula pelicula){
		System.out.println("datos que ingresan "+ pelicula.toString());
		
		if (pelicula.getNombreOriginal()==null) 
			return new ResponseEntity<Pelicula>(HttpStatus.BAD_REQUEST);
		Pelicula peliculatemp= peliculaService.save(pelicula);
		if(peliculatemp!=null)	
		return new ResponseEntity<Pelicula>(peliculatemp, HttpStatus.CREATED);
		else return new ResponseEntity<Pelicula>(HttpStatus.BAD_REQUEST);
	}
	
}
