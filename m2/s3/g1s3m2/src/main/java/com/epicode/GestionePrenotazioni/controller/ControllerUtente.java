package com.epicode.GestionePrenotazioni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epicode.GestionePrenotazioni.Classes.Utente;
import com.epicode.GestionePrenotazioni.Services.UtenteServices;

@RestController
@RequestMapping("/api/utenti")
@CrossOrigin(origins = "*", maxAge = 3600)
public class ControllerUtente {
	@Autowired UtenteServices us;
	
	@GetMapping
	public ResponseEntity<List<Utente>> getAll() {
		List<Utente> lista = us.getAll();
		ResponseEntity<List<Utente>> res = new ResponseEntity<List<Utente>>(lista,HttpStatus.OK);
		return res;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getById(@PathVariable Long id) {
		try {
			Utente u = us.getById(id);
			return  new ResponseEntity<Utente>(u, HttpStatus.OK);
		} catch (Exception e) {
			return  new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping
	public ResponseEntity<?> postUtente (@RequestBody Utente utente){
		try {
			us.saveUtente(utente);
			return new ResponseEntity<Utente>(utente, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
}
