package com.cinema.cinema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cinema.cinema.model.Silla;
import com.cinema.cinema.service.SillaService;

@RestController
@RequestMapping("/silla")
@CrossOrigin(origins = "https://pruebasbw.tk")
public class SillaController {
	
	@Autowired
	private SillaService sillaService;
	
	@GetMapping("/list")
    public ResponseEntity<List<Silla>> lista(){

        List<Silla> sillas = sillaService.findAll();
        return new ResponseEntity<List<Silla>>(sillas,HttpStatus.OK);
    }
	

}
