package com.epicode.gestioneDispositivi.runner;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.epicode.gestioneDispositivi.classes.Dipendente;
import com.epicode.gestioneDispositivi.classes.Dispositivo;
import com.epicode.gestioneDispositivi.classes.EStatus;
import com.epicode.gestioneDispositivi.classes.ETipo;
import com.epicode.gestioneDispositivi.service.DipendenteService;
import com.epicode.gestioneDispositivi.service.DispositivoService;

@Component
public class DispositivoRunner implements CommandLineRunner {
	@Autowired DispositivoService ds;
	@Autowired DipendenteService dipententeService;
	@Override
	public void run(String... args) throws Exception {
	Dispositivo d1 = ds.createDispositivo(ETipo.LAPTOP, "AU5612");
	Dispositivo d2 = ds.createDispositivo(ETipo.SMARTPHONE, "SM0016");
	d2.setStatus( EStatus.IN_MANUTENZIONE);
	ds.saveDispositivoOnDB(d2);
		//System.out.println(d1.toString());
		Dipendente dip1 = dipententeService.creaDipendente("luca", "brancato", "email@example.com", 327544345, LocalDate.of(1995, 12, 13));
		//ds.assegnaDipositivoADipendente(d1, dip1);
	}

}
