package com.epicode.gestioneDispositivi.service;

import java.time.LocalDate;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epicode.gestioneDispositivi.classes.Dipendente;
import com.epicode.gestioneDispositivi.classes.Dispositivo;
import com.epicode.gestioneDispositivi.repository.IdipendenteDAO;

import jakarta.persistence.EntityNotFoundException;

@Service
public class DipendenteService {
	@Autowired ObjectProvider<Dipendente> dipendenteProvider;
	@Autowired IdipendenteDAO dipendenteDAO;
	
	public Dipendente saveDipendente(Dipendente d) {
		return dipendenteDAO.save(d);
	}
	public Dipendente creaDipendente(String _nome, String _cognome, String _email, int _numero, LocalDate _dataNascita) {
		Dipendente d = dipendenteProvider.getObject();
		d = d.builder()
				.nome(_nome)
				.cognome(_cognome)
				.email(_email)
				.numeroTelefono(_numero)
				.dataNascita(_dataNascita)
				.build();
		saveDipendente(d);
		return d;
	}
	public Dipendente getById(long id) {
		if(!dipendenteDAO.existsById(id)) {
			throw new EntityNotFoundException("dipendente non trovato");
		}return dipendenteDAO.findById(id).get();
	}
}
