package com.epicode.model.DAO;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import com.epicode.controller.MainProject;
import com.epicode.model.Biglietto;
import com.epicode.model.BigliettoConvalidato;
import com.epicode.model.MezziTrasporto;
import com.epicode.model.Stato;
import com.epicode.model.StoricoMezzo;
import com.epicode.model.Tram;

public class BigliettoConvalidatoDAO {
	public static void save(BigliettoConvalidato a) {
		try {
			MainProject.em.getTransaction().begin();
			MainProject.em.persist(a);
			MainProject.em.getTransaction().commit();
			MainProject.log.info("Biglietto: "+ a.getBiglietto().getCodice() +" convalidato");
			
		}catch (Exception e) {
			MainProject.em.getTransaction().rollback();
			MainProject.log.error(e.getMessage());
			
		}
	}
	
	
	public static Biglietto convalida(Biglietto bi, MezziTrasporto mezzo) {
	    Biglietto t = null;
	    
	    try {
	        String query = "SELECT m FROM Biglietto m WHERE m.codice = :codice";
	        Query q = MainProject.em.createQuery(query);
	        q.setParameter("codice", bi.getCodice());
	        t = (Biglietto) q.getSingleResult();
	        if (t.getConvalidato().equals(false)) {
	            t.setDataConvalida(LocalDate.now());
	            t.setConvalidato(true);
	            MainProject.em.merge(t);
	            BigliettoConvalidato b = new BigliettoConvalidato(mezzo,bi);
	            BigliettoConvalidatoDAO.save(b);
	        } else {
	            MainProject.log.error("Il biglietto è stato già vidimato e non può essere riutilizzato");
	            return null;
	        }
	        
	    } catch (NoResultException ex) {
	        MainProject.log.error("Biglietto non trovato per il codice: " + bi.getCodice());
	    } catch (Exception e) {
	        e.printStackTrace();
	        MainProject.log.error(e.getMessage());
	    }
	    return t;
	}

	public static MezziTrasporto getMezzo(String codice) {
	    MezziTrasporto y = null;

	    try {
	        String query2 = "SELECT m FROM MezziTrasporto m WHERE m.immatricolazione = :codice";
	        Query q2 = MainProject.em.createQuery(query2);
	        q2.setParameter("codice", codice);
	        y = (MezziTrasporto) q2.getSingleResult();
	    } catch (NoResultException ex) {
	        MainProject.log.error("Mezzo non trovato per il codice: " + codice);
	    } catch (Exception e) {
	        e.printStackTrace();
	        MainProject.log.error(e.getMessage());
	    }
	    return y;
	}

	


}