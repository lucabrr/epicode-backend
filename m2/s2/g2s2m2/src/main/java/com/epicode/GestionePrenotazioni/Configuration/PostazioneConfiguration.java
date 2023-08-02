package com.epicode.GestionePrenotazioni.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.GestionePrenotazioni.Classes.Postazione;

@Configuration
public class PostazioneConfiguration {
	
	@Bean
	@Scope("prototype")
	public Postazione postazione() {
		return new Postazione();
	}

}
