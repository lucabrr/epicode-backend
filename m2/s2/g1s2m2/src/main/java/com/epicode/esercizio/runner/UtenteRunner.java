package com.epicode.esercizio.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.epicode.esercizio.classes.Utente;
import com.epicode.esercizio.services.UtenteServices;

@Component
public class UtenteRunner implements CommandLineRunner {
	@Autowired UtenteServices us;
	@Override
	public void run(String... args) throws Exception {
		Utente u1 = us.createUtente("luca", "brancato", 27);
		
	}

}
