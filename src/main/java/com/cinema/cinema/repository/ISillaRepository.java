package com.cinema.cinema.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinema.cinema.model.Silla;

@Repository
public interface ISillaRepository extends JpaRepository<Silla, Integer>{
	
	List<Silla> findAll();

}
