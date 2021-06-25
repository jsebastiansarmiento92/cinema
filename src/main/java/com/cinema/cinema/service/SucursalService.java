package com.cinema.cinema.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinema.cinema.model.Sucursal;
import com.cinema.cinema.repository.ISucursalRepository;

@Service
@Transactional
public class SucursalService {
	@Autowired
	ISucursalRepository iSucursalRepository;
	
	public List<Sucursal> findAll(){
		
		return iSucursalRepository.findAll();
	}
	public	boolean save(Sucursal sucursal){
		
		try {
			System.err.println(iSucursalRepository.save(sucursal));
			return true;
		}catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}
}
