package com.epicode.esercizio.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.esercizio.classes.Utente;

@Configuration
public class UtenteConfig {

	@Bean
	@Scope("prototype")
	public Utente utente() {
		return new Utente();
	}
}
