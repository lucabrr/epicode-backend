package com.epicode.GestionePrenotazioni.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.GestionePrenotazioni.Classes.Prenotazione;

@Configuration
public class PrenotazioneConfiguration {
	@Bean
	@Scope("prototype")
	public Prenotazione prenotazione() {
		return new Prenotazione();
	}

}
