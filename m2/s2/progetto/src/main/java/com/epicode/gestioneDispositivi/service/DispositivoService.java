package com.epicode.gestioneDispositivi.service;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;

import com.epicode.gestioneDispositivi.classes.Dispositivo;
import com.epicode.gestioneDispositivi.repository.IdispositivoDAO;

public class DispositivoService {

		@Autowired IdispositivoDAO dispositivoDAO ;
		@Autowired ObjectProvider<Dispositivo> dispositivoProvider;
}
