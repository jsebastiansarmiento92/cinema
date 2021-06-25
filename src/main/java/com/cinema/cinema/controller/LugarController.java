package com.cinema.cinema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cinema.cinema.model.Lugar;
import com.cinema.cinema.service.LugarService;


@RestController
@RequestMapping("/lugar")
@CrossOrigin(origins = "https://pruebasbw.tk")
public class LugarController {

	@Autowired
	private LugarService lugarService;
	

	@GetMapping("/list")
    public ResponseEntity<List<Lugar>> lista(){

        List<Lugar> lugares = lugarService.findAll();
        System.err.println(lugares.get(0));
        return new ResponseEntity<List<Lugar>>(lugares,HttpStatus.OK);
    }
	
	
}
