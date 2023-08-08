package com.epicode.gestioneDispositivi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.gestioneDispositivi.classes.Dispositivo;
import com.epicode.gestioneDispositivi.classes.EStatus;

@Configuration
public class DispositivoConfig {
	@Bean
	@Scope("prototype")
	Dispositivo dispositivo() {
		Dispositivo d = new Dispositivo();
		return d;
	}
	

}
