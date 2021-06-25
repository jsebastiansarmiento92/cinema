package com.cinema.cinema.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinema.cinema.model.Usuario;
import com.cinema.cinema.repository.IUsuarioRepository;

@Service
@Transactional
public class UsuarioService {

	@Autowired
	private IUsuarioRepository iUsuarioRepository;
	
	
	public List<Usuario> findAll(){

		return iUsuarioRepository.findAll();
	}
	 
}
