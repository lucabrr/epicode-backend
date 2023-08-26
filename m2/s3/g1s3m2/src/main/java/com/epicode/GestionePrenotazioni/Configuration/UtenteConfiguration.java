package com.epicode.GestionePrenotazioni.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.GestionePrenotazioni.Classes.Utente;

@Configuration
public class UtenteConfiguration {
	@Bean
	@Scope("prototype")
	public Utente utente() {
		return new Utente();
	}

}
