package com.epicode.model.DAO;

import java.time.LocalDate;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.jboss.jandex.Main;

import com.epicode.controller.MainProject;
import com.epicode.model.Abbonamento;
import com.epicode.model.PuntoVendita;

public class DocumentoVenditaDAO {

	public static long getAllDocumentiEmessi(LocalDate inizio ,LocalDate fine) {
	    String query = "SELECT COUNT(d) FROM DocumentoVendita d WHERE d.dataEmissione BETWEEN :dataInizio AND :dataFine";
	    long n = 0; // Valore di default nel caso in cui si verifichi un'eccezione

	    try {
	        Query q = MainProject.em.createQuery(query);
	        q.setParameter("dataInizio", inizio);
	        q.setParameter("dataFine", fine);
	        n = (long) q.getSingleResult();
	    } catch (Exception e) {
	        // Gestisci l'eccezione come desideri
	        e.printStackTrace();
	    }

	    return n;
	}
	
	public static long getAllDocumentiEmessi(LocalDate inizio ,LocalDate fine,PuntoVendita punt) {
	    String query = "SELECT COUNT(d) FROM DocumentoVendita d WHERE d.puntoVendita = :punt AND d.dataEmissione BETWEEN :dataInizio AND :dataFine";
	    long n = 0; // Valore di default nel caso in cui si verifichi un'eccezione

	    try {
	        Query q = MainProject.em.createQuery(query);
	        q.setParameter("dataInizio", inizio);
	        q.setParameter("dataFine", fine);
	        q.setParameter("punt", punt);
	        n = (long) q.getSingleResult();
	    } catch (Exception e) {
	        // Gestisci l'eccezione come desideri
	        e.printStackTrace();
	    }

	    return n;
	}
	public static void controlloAbbonamento(String codiceTessera) {
		String query = "SELECT a FROM Abbonamento a WHERE a.dataScadenza > NOW() AND a.tessera.codiceTessera = :codiceTessera";
		try {
			Query q = MainProject.em.createQuery(query);
			q.setParameter("codiceTessera", codiceTessera);
			Abbonamento a = (Abbonamento) q.getSingleResult();
			MainProject.log.info("Data scadenza abbonamento : "+ a.getDataScadenza());
			
		}
		
		
		catch (NoResultException e) {
	        MainProject.log.info("nessun abbonamento valido trovato per il codice tessera: " + codiceTessera);
	    }
		
	}

}
