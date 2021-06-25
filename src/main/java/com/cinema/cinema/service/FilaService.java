package com.cinema.cinema.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinema.cinema.model.Fila;
import com.cinema.cinema.repository.IFilaRepository;

@Service
@Transactional
public class FilaService {
	
	@Autowired
	private IFilaRepository filaRepository;
	
	public List<Fila> findAll(){
		return this.filaRepository.findAll();
	}
}
