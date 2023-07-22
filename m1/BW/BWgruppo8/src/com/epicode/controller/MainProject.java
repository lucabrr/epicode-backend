package com.epicode.controller;

import java.time.Duration;
import java.time.LocalDate;
import com.epicode.model.Tram;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.epicode.model.Abbonamento;
import com.epicode.model.Biglietto;
import com.epicode.model.Autobus;
import com.epicode.model.Tratta;

import com.epicode.model.DistributoreAutomatico;
import com.epicode.model.DocumentoVendita;
import com.epicode.model.Periodicita;
import com.epicode.model.RivenditoreAutorizzato;
import com.epicode.model.Stato;
import com.epicode.model.StoricoMezzo;
import com.epicode.model. BigliettoConvalidato;
import com.epicode.model.Status;
import com.epicode.model.Tessera;
import com.epicode.model.Utente;
import com.epicode.model.DAO.AbbonamentoDAO;
import com.epicode.model.DAO.BigliettoConvalidatoDAO;
import com.epicode.model.DAO.BigliettoDAO;
import com.epicode.model.DAO.DistributoreAutomaticoDAO;
import com.epicode.model.DAO.DocumentoVenditaDAO;
import com.epicode.model.DAO.RivenditoreAutorizzatoDAO;
import com.epicode.model.DAO.StoricoMezzoDAO;
import com.epicode.model.DAO.TesseraDAO;
import com.epicode.model.DAO.TramDAO;
import com.epicode.model.DAO.TrattaDAO;
import com.epicode.model.DAO.UtenteDAO;
import com.epicode.util.JpaUtil;

public class MainProject {
	public static EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
	 public static final Logger log = LoggerFactory.getLogger(MainProject.class);
	public static void main(String[] args) {
		
		 
		//RivenditoreAutorizzato r2 = new RivenditoreAutorizzato("Roma", "settore01", "Marco", "TRU8977");
		//RivenditoreAutorizzatoDAO.save(r2);
		
		
		 
		//RivenditoreAutorizzato r2 = new RivenditoreAutorizzato("Napoli", "settore15", "Marco", "cse986");
		//RivenditoreAutorizzatoDAO.save(r2);
		
		
		//Biglietto b1 = new Biglietto("big1231", LocalDate.of(2022, 8, 5), RivenditoreAutorizzatoDAO.getByCode("TRU8977"));
		//BigliettoDAO.save(b1);
		
		//RivenditoreAutorizzato r6 = RivenditoreAutorizzatoDAO.getById(17l);
		//r6.getDocumentiDiVenditaEmessi().forEach(d -> log.info(d.toString()) );
		
		//DistributoreAutomatico d1 = new DistributoreAutomatico("Vicenza", "settore0", Status.ATTIVO,"db9823");
		//DistributoreAutomaticoDAO.save(d1);
		//Biglietto b2 = new Biglietto("bnb312", LocalDate.of(2023, 7, 9), RivenditoreAutorizzatoDAO.getByCode("TRU8977"), null);
		//BigliettoDAO.save(b2);
		//DistributoreAutomatico d1 = DistributoreAutomaticoDAO.getByCode(" gfd123");
		//d1.getDocumentiDiVenditaEmessi().forEach(e -> log.info(e.toString()));
		
		//Utente u1 = new Utente("Mario", "Rossi");
		//Utente u2 = new Utente("Giovanna", "Arco");
		
		//UtenteDAO.save(u2);
		// Tessera t1 = new Tessera("tes2222", LocalDate.of(2022, 5, 10), LocalDate.of(2022, 5, 10), UtenteDAO.getById(1l));
		//Tessera t2 = new Tessera("tes1212", LocalDate.of(2023, 6, 10), LocalDate.of(2024, 6, 9), UtenteDAO.getById(2l));
		 //TesseraDAO.save(t2);
		
		//Abbonamento a1 = new Abbonamento("abb2213", LocalDate.of(2022, 6, 20), RivenditoreAutorizzatoDAO.getByCode("TRU8977"), LocalDate.of(2022, 7, 19), Periodicita.MENSILE, TesseraDAO.getByCode("tes2222"));
		//Abbonamento a2 = new Abbonamento("abb9999", LocalDate.of(2023, 8, 11), RivenditoreAutorizzatoDAO.getByCode("TRU8977"), LocalDate.of(2023, 9, 10), Periodicita.MENSILE, TesseraDAO.getByCode("tes1212"));
		//AbbonamentoDAO.save(a2);
		//System.out.println(DocumentoVenditaDAO.getAllDocumentiEmessi(LocalDate.of(2022, 6, 10),LocalDate.of(2024, 10, 10),DistributoreAutomaticoDAO.getByCode("db9823")));
		//DocumentoVenditaDAO.controlloAbbonamento("tes1212");
		//provaprova
		
		//Tram t1 = new Tram(30, "AB123CV",Stato.SERVIZIO,4);
		//Tram t2 = new Tram(40,"CS988CV",Stato.SERVIZIO,5);
		//Tram t3 = new Tram(25,"GH857KL",Stato.MANUTENZIONE,2);
		//TramDAO.save(t3);
		
		 //Autobus a1 = new Autobus (60,"VS962BN",Stato.SERVIZIO,"Manuale");
		 //Autobus a2 = new Autobus (45,"CV128GH",Stato.SERVIZIO,"Automatico");
		 //AutobusDAO.save(a2);
		
		 //Tratta r1 = new Tratta("Roma", "Milano","rm2565", TramDAO.getByCode("AB123CV"),Duration.ofMinutes(90), Duration.ofMinutes(100));
		 //Tratta r2 = new Tratta("Roma", "Milano","rm2565", TramDAO.getByCode("GH857KL"),Duration.ofMinutes(90), Duration.ofMinutes(100));
		//TrattaDAO.save(r1);
		//TrattaDAO.countTratteByCodiceTrattaAndMezzo("rm2565", TramDAO.getByCode("AB123CV"));
		//TrattaDAO.getNtratta("rm2565", TramDAO.getByCode("AB123CV"));
		
		
		
		//String name ="GH857KL";
		//StoricoMezzo m1 = new StoricoMezzo(Stato.SERVIZIO,TramDAO.getByCode(name),LocalDate.of(2021,4, 6), LocalDate.of(2022,4, 5));
		//StoricoMezzo m2 = new StoricoMezzo(StoricoMezzoDAO.getByStato(name),AutobusDAO.getByCode(name) ,LocalDate.of(2022, 11, 17), LocalDate.of(2023, 1, 15));
		//StoricoMezzoDAO.save(m1);
		
		
		//StoricoMezzoDAO.inServizio(name);
		//StoricoMezzoDAO.inManutenzione(name);
		
		
		
		 //BigliettoDAO.getCode("big1231");
		//BigliettoConvalidatoDAO.convalida(BigliettoDAO.getCode("bnb312"), TramDAO.getByCode("AB123CV"));
		//String codiceDaConvalidare = "big1231";
		//Biglietto bigliettoConvalidato = BigliettoConvalidatoDAO.convalida(codiceDaConvalidare);

		
		//StoricoMezzoDAO.bigliettiVidimati("AB123CV");
		//StoricoMezzoDAO.numeroBiglietti("AB123CV");
	}
}