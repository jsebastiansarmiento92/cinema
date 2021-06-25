package com.cinema.cinema.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinema.cinema.model.Lugar;

@Repository
public interface ILugarRepository extends JpaRepository<Lugar, Integer>{
	
	List<Lugar> findAll();

}
