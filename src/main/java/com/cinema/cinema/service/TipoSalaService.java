package com.cinema.cinema.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinema.cinema.model.TipoSala;
import com.cinema.cinema.repository.ITipoSalaRepository;

@Service
@Transactional
public class TipoSalaService {

	@Autowired
	ITipoSalaRepository iTipoSalaRepository;
	
	public List<TipoSala> findAll(){

		return iTipoSalaRepository.findAll();
	}
}
