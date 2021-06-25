package com.cinema.cinema.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinema.cinema.model.TipoSala;

public interface ITipoSalaRepository extends JpaRepository<TipoSala, Integer> {
	
	List<TipoSala> findAll();
}
