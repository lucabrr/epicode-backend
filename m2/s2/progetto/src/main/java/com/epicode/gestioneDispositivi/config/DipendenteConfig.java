package com.epicode.gestioneDispositivi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.gestioneDispositivi.classes.Dipendente;

@Configuration
public class DipendenteConfig {
@Bean
@Scope("prototype")
Dipendente dipendente() {
	return new Dipendente();
}
}
