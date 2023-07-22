package com.epicode.model.DAO;

import javax.persistence.Query;

import com.epicode.controller.MainProject;
import com.epicode.model.DistributoreAutomatico;
import com.epicode.model.Tram;

public class TramDAO {
	public static void save(Tram a) {
		try {
			MainProject.em.getTransaction().begin();
			MainProject.em.persist(a);
			MainProject.em.getTransaction().commit();
			MainProject.log.info("Tram: "+ a.getImmatricolazione() +" creato");
			
		}catch (Exception e) {
			MainProject.em.getTransaction().rollback();
			MainProject.log.error(e.getMessage());
			
		}
		
	}
	
	public static Tram getByCode(String codice) {
		Tram t = new Tram();
		try {
			String query = "SELECT d FROM Tram d WHERE d.immatricolazione = :codice";
			Query q = MainProject.em.createQuery(query);
			q.setParameter("codice",codice);
			  t =  (Tram) q.getSingleResult();	
			  return t;
		} catch (Exception e) {
			e.printStackTrace();
			MainProject.log.error(e.getMessage());
		} return t;
		
	}

}
