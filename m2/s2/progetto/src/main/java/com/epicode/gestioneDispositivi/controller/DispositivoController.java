package com.epicode.gestioneDispositivi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.epicode.gestioneDispositivi.classes.Dipendente;
import com.epicode.gestioneDispositivi.classes.Dispositivo;

import com.epicode.gestioneDispositivi.repository.IdispositivoDAO;
import com.epicode.gestioneDispositivi.service.DipendenteService;
import com.epicode.gestioneDispositivi.service.DispositivoService;

@RestController
@RequestMapping("/api/dispositivo")
public class DispositivoController {
	@Autowired DispositivoService ds;
	@Autowired DipendenteService dipendenteSerivice;
	@Autowired IdispositivoDAO dispositivoDAO;
	
	@GetMapping
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<?> getAllDispositivi(){
		try {
			List<Dispositivo> lista = ds.getAllDispositivo();
			return new ResponseEntity<List<Dispositivo>>(lista,HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		
	}
	@PatchMapping("/assegna")
	@PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<?> assegnaDispositivo(@RequestParam long dispositivoID,@RequestParam long dipendenteID) {
        try {
        	Dispositivo dispositivo = ds.getById(dispositivoID);
        	Dipendente dipendente =  dipendenteSerivice.getById(dipendenteID);
            Dispositivo d = ds.assegnaDipositivoADipendente(dispositivo,dipendente );
            return new ResponseEntity<Dispositivo>(d, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
	@PostMapping("/save")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<Dispositivo> createDispositivo(@RequestBody Dispositivo dispositivo){
		Dispositivo d = ds.createDispositivo(dispositivo.getTipo(), dispositivo.getModello());
		return new ResponseEntity<Dispositivo>(d,HttpStatus.OK);
		
	}
	@PutMapping
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<?> modificaDispositivo(@RequestBody Dispositivo d){
		try {
			return new ResponseEntity<Dispositivo>(ds.saveDispositivoOnDB(d),HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping("/cancella")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<String> deleteDispositivo(@RequestParam long id){
		String mex = ds.cancellaDispositivo(id);
		return new ResponseEntity<String>(mex,HttpStatus.OK);
	}
	
}
