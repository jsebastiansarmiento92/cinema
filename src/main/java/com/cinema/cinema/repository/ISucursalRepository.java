package com.cinema.cinema.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinema.cinema.model.Sucursal;

@Repository
public interface ISucursalRepository extends JpaRepository<Sucursal, Integer>{

	List<Sucursal> findAll();
}
