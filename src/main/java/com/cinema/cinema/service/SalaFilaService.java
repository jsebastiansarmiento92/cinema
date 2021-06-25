package com.cinema.cinema.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinema.cinema.model.SalaFila;
import com.cinema.cinema.repository.ISalaFilaRepository;

@Service
@Transactional
public class SalaFilaService {

	@Autowired
	private ISalaFilaRepository iSalaFilaRepository;
	
	public List<SalaFila> findAll(){
		
		return iSalaFilaRepository.findAll();
	}
	
	public SalaFila save(SalaFila salaFila) {
		return iSalaFilaRepository.save(salaFila);
	}
}
