package com.epicode.esercizio.services;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epicode.esercizio.classes.Utente;
import com.epicode.esercizio.repository.IutenteDAO;
@Service
public class UtenteServices {
	@Autowired private ObjectProvider<Utente> utenteProvider;
	@Autowired IutenteDAO utenteDAO;
	public Utente createUtente(String nome, String cognome, int anni){
		Utente u = utenteProvider.getObject();
		u= u.builder().nome(nome).cognome(cognome).anni(anni).build();
		utenteDAO.save(u);
		System.out.print(u.getNome()+ " " + u.getCognome() +"  salvato nel db");
		return u;
	}
}
