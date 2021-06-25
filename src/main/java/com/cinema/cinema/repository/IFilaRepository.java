package com.cinema.cinema.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinema.cinema.model.Fila;


public interface IFilaRepository extends JpaRepository<Fila, Integer> {
	
	List<Fila>findAll();
}
