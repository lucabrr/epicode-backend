package com.epicode.model.DAO;

import java.util.List;

import javax.persistence.Query;

import com.epicode.controller.MainProject;
import com.epicode.model.BigliettoConvalidato;
import com.epicode.model.MezziTrasporto;
import com.epicode.model.Stato;
import com.epicode.model.StoricoMezzo;
import com.epicode.model.Tram;
import com.epicode.model.Biglietto;

public class StoricoMezzoDAO {
	public static void save(StoricoMezzo a) {
		try {
			MainProject.em.getTransaction().begin();
			MainProject.em.persist(a);
			MainProject.em.getTransaction().commit();
			MainProject.log.info("Storico del Mezzo: "+ a.getMezzoAssociato().getImmatricolazione() +" creato");
			
		}catch (Exception e) {
			MainProject.em.getTransaction().rollback();
			MainProject.log.error(e.getMessage());
			
		}
	}
	
	public static Stato getByStato(String codice) {
	    Stato stato = null;
	    try {
	        String query = "SELECT m.stato FROM MezziTrasporto m WHERE m.immatricolazione = :codice";

	        Query q = MainProject.em.createQuery(query);
	        q.setParameter("codice", codice);
	        Object statoObject = q.getSingleResult();
	        if (statoObject instanceof Stato) {
	            stato = (Stato) statoObject;
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	        MainProject.log.error(e.getMessage());
	    }
	    return stato;
	}

	
	public static List<StoricoMezzo>inServizio(String codice) {
	    List<StoricoMezzo> mezziInServizio = null;
	    try {
	        String query = "SELECT sm FROM StoricoMezzo sm WHERE sm.status = :SERVIZIO AND sm.mezzoAssociato.immatricolazione = :codice";
	        Query q = MainProject.em.createQuery(query, StoricoMezzo.class);
	        q.setParameter("SERVIZIO", Stato.SERVIZIO);
	        q.setParameter("codice", codice);
	        mezziInServizio = q.getResultList();
	        for (StoricoMezzo storicoMezzo : mezziInServizio) {
	            System.out.println("Data inizio servizio: "+storicoMezzo.getDataInizio() + " / " +"Data fine servizio: "+storicoMezzo.getDataFine());
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	        MainProject.log.error(e.getMessage());
	    }
	    return mezziInServizio;
	}
	
	
	public static List<StoricoMezzo>inManutenzione(String codice) {
	    List<StoricoMezzo> mezziInManutenzione = null;
	    try {
	        String query = "SELECT sm FROM StoricoMezzo sm WHERE sm.status = :MANUTENZIONE AND sm.mezzoAssociato.immatricolazione = :codice";
	        Query q = MainProject.em.createQuery(query, StoricoMezzo.class);
	        q.setParameter("MANUTENZIONE", Stato.MANUTENZIONE);
	        q.setParameter("codice", codice);
	        mezziInManutenzione = q.getResultList();
	        for (StoricoMezzo storicoMezzo : mezziInManutenzione) {
	        	System.out.println("Data inizio manutenzione: "+storicoMezzo.getDataInizio() + " / " +"Data fine manutenzione: "+storicoMezzo.getDataFine());
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	        MainProject.log.error(e.getMessage());
	    }
	    return mezziInManutenzione;
	}
	
	public static List<BigliettoConvalidato> bigliettiVidimati(String codiceMezzo) {
	    List<BigliettoConvalidato> totale = null;
	    try {
	        String query = "SELECT bc FROM BigliettoConvalidato bc WHERE bc.mezzo.immatricolazione = :codiceMezzo";
	        Query q = MainProject.em.createQuery(query, BigliettoConvalidato.class);
	        q.setParameter("codiceMezzo", codiceMezzo);
	        totale = q.getResultList();
	        
	        for (BigliettoConvalidato biglietto : totale) {
	            System.out.println(biglietto.toString());
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	        MainProject.log.error(e.getMessage());
	    }
	    return totale;
	}
	
	public static void numeroBiglietti(String codiceMezzo) {
		String query = "SELECT COUNT(b) FROM BigliettoConvalidato b WHERE b.mezzo.immatricolazione = :codiceMezzo";
		 Query q = MainProject.em.createQuery(query);
	        q.setParameter("codiceMezzo", codiceMezzo);
	        Long num = (Long) q.getSingleResult();
	        MainProject.log.info("il mezzo ha convalidato " + num + " Biglietti");
	}

}
