package com.epicode.GestionePrenotazioni.Runner;

import java.time.LocalDate;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.epicode.GestionePrenotazioni.Classes.Edificio;
import com.epicode.GestionePrenotazioni.Classes.Postazione;
import com.epicode.GestionePrenotazioni.Classes.Prenotazione;
import com.epicode.GestionePrenotazioni.Classes.Tipo;
import com.epicode.GestionePrenotazioni.Classes.Utente;
import com.epicode.GestionePrenotazioni.Services.EdificioServices;
import com.epicode.GestionePrenotazioni.Services.PostazioneServices;
import com.epicode.GestionePrenotazioni.Services.PrenotazioneServices;
import com.epicode.GestionePrenotazioni.Services.UtenteServices;
@Component
public class GestionePrenotazioneRunner  implements CommandLineRunner{
	@Autowired EdificioServices es;
	@Autowired UtenteServices us;
	@Autowired PostazioneServices ps;
	@Autowired PrenotazioneServices preS;
	Logger log = LoggerFactory.getLogger(GestionePrenotazioneRunner.class);
	public void run(String... args) throws Exception {
		System.out.print("running..");
//		
////		Edificio e1 = es.createEdificio("Cortez", "Via bellini 13", "Roma");
////		Edificio e2 = es.createEdificio("Madama", "Via della crusca 3", "Milano");
////		Utente u1 = us.createUtente("mitico89", "Ciccio Caputo", "test@example.com");
////		Utente u2 = us.createUtente("banana33", "Checco Zalone", "provaprova@example.com");
////		Postazione p1 = ps.createPostazione("ps123", "posto singolo", Tipo.PRIVATO, 1, e1);
////		Postazione p2 = ps.createPostazione("ps124", "posto bellissimo", Tipo.OPENSPACE, 5, e1);
////		Postazione p3 = ps.createPostazione("ps125", "ideale per riunioni", Tipo.SALA, 10, e1);
////		Postazione p4 = ps.createPostazione("ps126", "descrizione vuota", Tipo.OPENSPACE, 4, e2);
////		Postazione p5 = ps.createPostazione("ps127", "tanta roba", Tipo.OPENSPACE, 3, e2);
////		Postazione p6 = ps.createPostazione("ps128", "posto singolo", Tipo.PRIVATO, 1, e2);
////		
//		
//		// pre1 salvo prima prenotazione
//		Prenotazione pre1 = preS.createPrenotazione(u1, p2, LocalDate.of(2023, 7, 10));
//		//pre2 un altro utente prova a prenotare la postazione gia prenotata sopra(errore)
//		Prenotazione pre2 = preS.createPrenotazione(u2, p2, LocalDate.of(2023, 7, 10));
//		Prenotazione pre3 = preS.createPrenotazione(u2, p1, LocalDate.of(2023, 9, 10));
//		//pre4 un utente prova a prenotare piu di una postazione nella stessa data (errore)
//		Prenotazione pre4 = preS.createPrenotazione(u2, p4, LocalDate.of(2023, 9, 10));
//		//ricerca postazioni tramite citta e tipo
//		List<Postazione> lista = ps.cercaPostazioni("Ragusa", Tipo.OPENSPACE);
//		lista.forEach(e -> log.info(e.toString()));
//		
//		
//		
//		
	}

}
