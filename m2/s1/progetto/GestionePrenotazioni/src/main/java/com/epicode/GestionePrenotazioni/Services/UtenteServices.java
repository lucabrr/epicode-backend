package com.epicode.GestionePrenotazioni.Services;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.GestionePrenotazioni.Classes.Utente;
import com.epicode.GestionePrenotazioni.Repository.IUtenteDAO;

@Service
public class UtenteServices {
	
	@Autowired  private ObjectProvider<Utente> utenteProvider;
	@Autowired IUtenteDAO utenteDAO;
	public Utente createUtente(String _username, String _nomeCompleto, String _email) {
		Utente u =  utenteProvider.getObject();
						u=	u.builder()
							.username(_username)
							.nomeCompleto(_nomeCompleto)
							.email(_email)
							.build();
		utenteDAO.save(u);
		System.out.println("utente " + u.getNomeCompleto() + " salvato nel db");
		return u;
	}
	
	
}
