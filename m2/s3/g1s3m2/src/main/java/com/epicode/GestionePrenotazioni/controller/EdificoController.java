package com.epicode.GestionePrenotazioni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epicode.GestionePrenotazioni.Classes.Edificio;
import com.epicode.GestionePrenotazioni.Services.EdificioServices;

@RestController
@RequestMapping("/api/edifici")
public class EdificoController {
	@Autowired EdificioServices es;
	
	@GetMapping
	public ResponseEntity<List<Edificio>>getAllEdifici() {
		List<Edificio> lista = es.getAll();
		return new ResponseEntity<List<Edificio>>(lista , HttpStatus.OK);
	}
}
