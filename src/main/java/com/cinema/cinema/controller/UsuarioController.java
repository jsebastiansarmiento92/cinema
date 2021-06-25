package com.cinema.cinema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cinema.cinema.model.Usuario;
import com.cinema.cinema.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "https://pruebasbw.tk")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/list")
    public ResponseEntity<List<Usuario>> listaTorres(){

        List<Usuario> sucursal = usuarioService.findAll();
        return new ResponseEntity<List<Usuario>>(sucursal,HttpStatus.OK);
    }

}
