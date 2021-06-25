package com.cinema.cinema.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinema.cinema.model.Pelicula;
import com.cinema.cinema.repository.IPeliculaRepository;

@Service
@Transactional
public class PeliculaService {
	@Autowired
	private IPeliculaRepository iPeliculaRepository;
	
	public Pelicula save(Pelicula pelicula) {
		return iPeliculaRepository.save(pelicula);
	}
	
}
