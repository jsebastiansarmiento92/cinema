package com.cinema.cinema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cinema.cinema.model.SalaFila;
import com.cinema.cinema.service.SalaFilaService;

@RestController
@RequestMapping("/sala-fila")
@CrossOrigin(origins = "https://pruebasbw.tk")
public class SalaFilaController {

	@Autowired
	private SalaFilaService salaFilaService;
	
	@GetMapping("/list")
    public ResponseEntity<List<SalaFila>> listar(){
        List<SalaFila> salaFila = salaFilaService.findAll();
        return new ResponseEntity<List<SalaFila>>(salaFila,HttpStatus.OK);
    }
	
	@PostMapping
	public ResponseEntity<SalaFila> insertar(@RequestBody SalaFila salaFila){
		System.out.println("datos que ingresan "+ salaFila.toString());
		
		if (salaFila.getFila()==null) 
			return new ResponseEntity<SalaFila>(HttpStatus.BAD_REQUEST);
		SalaFila salaFilaTemp= salaFilaService.save(salaFila);
		if(salaFilaTemp!=null)	
		return new ResponseEntity<SalaFila>(salaFilaTemp, HttpStatus.CREATED);
		else return new ResponseEntity<SalaFila>(HttpStatus.BAD_REQUEST);
	}
}
