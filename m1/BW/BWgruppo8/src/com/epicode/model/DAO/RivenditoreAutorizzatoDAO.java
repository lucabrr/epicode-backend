package com.epicode.model.DAO;

import javax.persistence.Query;

import com.epicode.controller.MainProject;
import com.epicode.model.RivenditoreAutorizzato;

public class RivenditoreAutorizzatoDAO {
	
	public static void save(RivenditoreAutorizzato r) {
		try {
			MainProject.em.getTransaction().begin();
			MainProject.em.persist(r);
			MainProject.em.getTransaction().commit();
			MainProject.log.info("rivenditore:"+ r.getNome()+" è stato creato");
			
			
		} catch (Exception e) {
			MainProject.em.getTransaction().rollback();
			MainProject.log.error(e.getMessage());
			
		}
	}
	
	public static RivenditoreAutorizzato getById(Long id) {
		RivenditoreAutorizzato r = new RivenditoreAutorizzato();
		try {
			MainProject.em.getTransaction().begin();
			  r = MainProject.em.find(RivenditoreAutorizzato.class, id);
			MainProject.em.getTransaction().commit();
			
			
			
			
		} catch (Exception e) {
			MainProject.em.getTransaction().rollback();
			MainProject.log.error(e.getMessage());
			
		} return r;
	}
	
	public static RivenditoreAutorizzato getByCode(String codice) {
		RivenditoreAutorizzato r = new RivenditoreAutorizzato();
		try {
			String query = "SELECT r FROM RivenditoreAutorizzato r WHERE r.codiceRivenditore = :codice";
			Query q = MainProject.em.createQuery(query);
			q.setParameter("codice",codice);
			r = (RivenditoreAutorizzato) q.getSingleResult();
		} catch (Exception e) {
			MainProject.log.error(e.getMessage());
		} return r;
		
	}
}
