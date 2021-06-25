package com.cinema.cinema.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinema.cinema.model.Lugar;
import com.cinema.cinema.repository.ILugarRepository;

@Service
@Transactional
public class LugarService {

	@Autowired
	ILugarRepository iLugarRepository;

	public List<Lugar> findAll(){

		return iLugarRepository.findAll();
	}

}
