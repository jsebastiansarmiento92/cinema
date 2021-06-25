package com.cinema.cinema.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinema.cinema.model.Sala;
import com.cinema.cinema.repository.ISalaRepository;

@Service
@Transactional
public class SalaService {

	@Autowired
	private ISalaRepository iSalaRepository;
	
	public List<Sala> findAll(){

		return iSalaRepository.findAll();
	}
public	Sala save(Sala sala){
		
		try {
			
			return iSalaRepository.save(sala);
		}catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
	}
}
