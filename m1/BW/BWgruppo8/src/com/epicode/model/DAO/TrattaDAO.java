package com.epicode.model.DAO;

import java.time.Duration;
import java.util.List;

import javax.persistence.Query;

import com.epicode.controller.MainProject;
import com.epicode.model.MezziTrasporto;
import com.epicode.model.Stato;
import com.epicode.model.Tratta;

public class TrattaDAO {

	
	public static void save (Tratta t) {
		if(t.getMezzo().getStato()!= Stato.SERVIZIO) {
			MainProject.log.info("il mezzo "+ t.getMezzo().getImmatricolazione() + " è in manutenzione, non può essere associato a una tratta" );
			
			return;
		}
		try {
			MainProject.em.getTransaction().begin();
			MainProject.em.persist(t);
			MainProject.em.getTransaction().commit();
			MainProject.log.info("Tratta con codice "+ t.getCodiceTratta()+ " creata" );
		} catch (Exception e) {
			MainProject.log.error(e.getMessage());
		}
	}
	public static void countTratteByCodiceTrattaAndMezzo(String codiceTratta, MezziTrasporto mezzo) {
	    String query = "SELECT COUNT(t) " +
	                   "FROM Tratta t " +
	                   "WHERE t.codiceTratta = :codiceTratta " +
	                   "AND t.mezzo = :mezzo";
	    Query  q = MainProject.em.createQuery(query, Long.class);
	    q.setParameter("codiceTratta", codiceTratta);
	    q.setParameter("mezzo", mezzo);
	    Long count = (Long) q.getSingleResult();

	    System.out.println("il mezzo "+ mezzo.getImmatricolazione() +" ha fatto la tratta "+ codiceTratta + " : " + count + " volte");
	    
	}
	
	
	
	
	public static void getNtratta(String codiceTratta, MezziTrasporto mezzo) {
	    String query = "SELECT t.codiceTratta, t.mezzo, t.tempoEffettivo " +
	                   "FROM Tratta t " +
	                   "WHERE t.codiceTratta = :codiceTratta " +
	                   "AND t.mezzo = :mezzo";
	    Query q = MainProject.em.createQuery(query, Object[].class);
	    q.setParameter("codiceTratta", codiceTratta);
	    q.setParameter("mezzo", mezzo);
	    List<Object[]> results = q.getResultList();

	    if (results.isEmpty()) {
	        System.out.println("Nessuna tratta trovata con il codice " + codiceTratta +
	                " e il mezzo con immatricolazione " + mezzo.getImmatricolazione());
	        return;
	    }
	    countTratteByCodiceTrattaAndMezzo(codiceTratta,mezzo);
	    for (Object[] result : results) {
	        Duration tempoEffettivo = (Duration) result[2];
	   	    System.out.println("Tempo effettivo per la tratta: " + tempoEffettivo);
	    }
	    System.out.println("-----------------------------------");
	}	
}
