package com.epicode.GestionePrenotazioni.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.GestionePrenotazioni.Classes.Utente;
import com.epicode.GestionePrenotazioni.Repository.IUtenteDAO;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UtenteServices {
	
	@Autowired  private ObjectProvider<Utente> utenteProvider;
	@Autowired IUtenteDAO utenteDAO;
	public Utente createUtente(String _username, String _nomeCompleto, String _email
			,String _secretCode) {
		Utente u =  utenteProvider.getObject();
						u=	u.builder()
							.username(_username)
							.nomeCompleto(_nomeCompleto)
							.email(_email)
							.secretCode(_secretCode)
							.build();
		utenteDAO.save(u);
		System.out.println("utente " + u.getNomeCompleto() + " salvato nel db");
		return u;
	}
	public List<Utente> getAll(){
		List<Utente> lista = (List<Utente>) utenteDAO.findAll();
		return lista;
	}
	public Utente getById(long id) {
		Optional<Utente> u = utenteDAO.findById(id);
		if(!utenteDAO.existsById(id)) {throw new EntityNotFoundException("utente non trovato");}
		return u.get();
	}
	public void saveUtente(Utente u) {
		utenteDAO.save(u);
	}
}
