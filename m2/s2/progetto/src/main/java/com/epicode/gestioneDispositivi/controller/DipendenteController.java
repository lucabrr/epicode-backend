package com.epicode.gestioneDispositivi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epicode.gestioneDispositivi.classes.Dipendente;
import com.epicode.gestioneDispositivi.service.DipendenteService;

@RestController
@RequestMapping("/api/dipendente")
public class DipendenteController {
	@Autowired  DipendenteService ds;
 
	@PostMapping
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<?> creaDipendente(@RequestBody Dipendente dipendente){
		try {
			return new ResponseEntity<Dipendente>(ds.saveDipendente(dipendente),HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.OK);
		}
		
	}
}
