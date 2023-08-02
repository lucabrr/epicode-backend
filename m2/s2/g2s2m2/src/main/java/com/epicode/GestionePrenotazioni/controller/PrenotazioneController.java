package com.epicode.GestionePrenotazioni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epicode.GestionePrenotazioni.Classes.Prenotazione;
import com.epicode.GestionePrenotazioni.Services.PrenotazioneServices;

@RestController
@RequestMapping("/api/prenotazioni")
public class PrenotazioneController {
	@Autowired PrenotazioneServices ps;
	
	
	@GetMapping
	public ResponseEntity<?> getAll(){
		try {
			List<Prenotazione> lista = ps.getAll();
			return new ResponseEntity<List<Prenotazione>>(lista,HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.OK);
		}
		
	}
}
