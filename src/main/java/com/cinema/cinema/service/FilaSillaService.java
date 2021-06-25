package com.cinema.cinema.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinema.cinema.model.FilaSilla;
import com.cinema.cinema.repository.IFilaSillaRepository;

@Service
@Transactional
public class FilaSillaService {

	 @Autowired
	 private IFilaSillaRepository iFilaSillaRepository;
	 
	 public FilaSilla save(FilaSilla filaSilla) {
		 return iFilaSillaRepository.save(filaSilla);
	 }
}
