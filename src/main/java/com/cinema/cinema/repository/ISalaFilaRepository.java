package com.cinema.cinema.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinema.cinema.model.SalaFila;

@Repository
public interface ISalaFilaRepository extends JpaRepository<SalaFila, Integer>{

	List<SalaFila> findAll();
}
