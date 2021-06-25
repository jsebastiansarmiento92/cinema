package com.cinema.cinema.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinema.cinema.model.Silla;
import com.cinema.cinema.repository.ISillaRepository;

@Service
@Transactional
public class SillaService {

	@Autowired
	private ISillaRepository iSillaRepository;
	
	public List<Silla> findAll(){
		return iSillaRepository.findAll();
	}
}
