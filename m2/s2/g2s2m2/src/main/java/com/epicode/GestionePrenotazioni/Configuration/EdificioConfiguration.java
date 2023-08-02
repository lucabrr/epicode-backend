package com.epicode.GestionePrenotazioni.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.GestionePrenotazioni.Classes.Edificio;

@Configuration
public class EdificioConfiguration {

	@Bean
	@Scope("prototype")
	public Edificio edificio() {
		return new Edificio();
	}
}
