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

import com.cinema.cinema.dto.Mensaje;
import com.cinema.cinema.model.Sucursal;
import com.cinema.cinema.service.SucursalService;

@RestController
@RequestMapping("/sucursal")
@CrossOrigin(origins = "https://pruebasbw.tk")
public class SucursalController {
	
	@Autowired
	private SucursalService service;
	
	@GetMapping("/list")
    public ResponseEntity<List<Sucursal>> list(){

        List<Sucursal> sucursal = service.findAll();
        return new ResponseEntity<List<Sucursal>>(sucursal,HttpStatus.OK);
    }
	
	
	@PostMapping
	public ResponseEntity<?> insertar(@RequestBody Sucursal sucursal){
		System.out.println("datos que ingresan "+ sucursal.toString());
		
		if (sucursal.getDireccion()==""||sucursal.getNombre()==null) 
			return new ResponseEntity<Object>(new Mensaje("por favor ingresar nombre de categoria"), HttpStatus.BAD_REQUEST);
		else if(service.save(sucursal))	
		return new ResponseEntity<Object>(new Mensaje("Sucursal guardada"), HttpStatus.CREATED);
		else return new ResponseEntity<Object>(new Mensaje("inconvenietes con la insercion"), HttpStatus.BAD_REQUEST);
	}
}
