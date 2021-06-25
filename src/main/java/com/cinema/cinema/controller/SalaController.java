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

import com.cinema.cinema.model.Fila;
import com.cinema.cinema.model.Sala;
import com.cinema.cinema.model.TipoSala;
import com.cinema.cinema.service.FilaService;
import com.cinema.cinema.service.SalaService;
import com.cinema.cinema.service.TipoSalaService;

@RestController
@RequestMapping("/sala")
@CrossOrigin(origins = "https://pruebasbw.tk")
public class SalaController {
	
	@Autowired
	private SalaService salaService;
	@Autowired
	private TipoSalaService tipoSalaService;
	
	@Autowired
	private FilaService filaService;
	
	@GetMapping("/list")
    public ResponseEntity<List<Sala>> listar(){
        List<Sala> salas = salaService.findAll();
        return new ResponseEntity<List<Sala>>(salas,HttpStatus.OK);
    }
	
	@GetMapping("/list-tipo")
    public ResponseEntity<List<TipoSala>> listaTipo(){
        List<TipoSala> tipoSala = tipoSalaService.findAll();
        return new ResponseEntity<List<TipoSala>>(tipoSala,HttpStatus.OK);
    }
	
	@GetMapping("/list-filas")
    public ResponseEntity<List<Fila>> listaFilas(){
        List<Fila> tipoSala = filaService.findAll();
        return new ResponseEntity<List<Fila>>(tipoSala,HttpStatus.OK);
    }
	
	
	@PostMapping
	public ResponseEntity<Sala> insertar(@RequestBody Sala sala){
		System.out.println("datos que ingresan "+ sala.toString());
		
		if (sala.getSucursal()==null) 
			return new ResponseEntity<Sala>(HttpStatus.BAD_REQUEST);
		Sala salaTemp= salaService.save(sala);
		if(salaTemp!=null)	
		return new ResponseEntity<Sala>(salaTemp, HttpStatus.CREATED);
		else return new ResponseEntity<Sala>(HttpStatus.BAD_REQUEST);
	}
	
	

}
