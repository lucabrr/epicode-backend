package com.epicode.model;

import javax.persistence.Query;

import com.epicode.controller.MainProject;

public class AutobusDAO {
public static void save(Autobus a) {
	try {
		MainProject.em.getTransaction().begin();
		MainProject.em.persist(a);
		MainProject.em.getTransaction().commit();
		MainProject.log.info("Autobus: "+ a.getImmatricolazione() +" creato");
		
	}catch (Exception e) {
		MainProject.em.getTransaction().rollback();
		MainProject.log.error(e.getMessage());
		
		}
	
	}

public static Autobus getByCode(String codice) {
	Autobus t = new Autobus();
	try {
		String query = "SELECT d FROM Autobus d WHERE d.immatricolazione = :codice";
		Query q = MainProject.em.createQuery(query);
		q.setParameter("codice",codice);
		  t =  (Autobus) q.getSingleResult();	
		  return t;
	} catch (Exception e) {
		e.printStackTrace();
		MainProject.log.error(e.getMessage());
	} return t;
	
}



}


