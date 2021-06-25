package com.cinema.cinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cinema.cinema.model.FilaSilla;
import com.cinema.cinema.service.FilaSillaService;



@RestController
@RequestMapping("/fila-silla")
@CrossOrigin(origins = "https://pruebasbw.tk")
public class FilaSillaController {
	
	@Autowired
	private FilaSillaService filaSillaService;
	
	@PostMapping
	public ResponseEntity<FilaSilla> insertar(@RequestBody FilaSilla filaSilla){
		System.out.println("datos que ingresan "+ filaSilla.toString());
		
		if (filaSilla.getFila()==null) 
			return new ResponseEntity<FilaSilla>(HttpStatus.BAD_REQUEST);
		FilaSilla salaTemp= filaSillaService.save(filaSilla);
		if(salaTemp!=null)	
		return new ResponseEntity<FilaSilla>(salaTemp, HttpStatus.CREATED);
		else return new ResponseEntity<FilaSilla>(HttpStatus.BAD_REQUEST);
	}
	

}
