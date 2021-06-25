package com.cinema.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinema.cinema.model.FilaSilla;


@Repository
public interface IFilaSillaRepository extends JpaRepository<FilaSilla, Integer> {
	
	
}
