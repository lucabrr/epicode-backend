package com.epicode.model.dao;

import javax.persistence.EntityManager;

import com.epicode.Util.JpaUtil;
import com.epicode.controller.MainProject;
import com.epicode.model.Utente;

public class UtenteDAO {
	static EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
	
	public static void save(Utente u) {
	try {
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
		
		MainProject.logger.info(u.getClass()+" "+ u.getNome()+"-"+u.getCognome() +" è stato creato");
		
	} catch (Exception e) {
		em.getTransaction().rollback();
		MainProject.logger.error("Error saving object: " + u.getClass().getSimpleName(), e);}
	}
	public static Utente getById(Long id) {
		Utente utente = new Utente();
		try {
			em.getTransaction().begin();
		 utente = em.find(Utente.class, id);
			em.getTransaction().commit();
			
			MainProject.logger.info(utente.toString());
			return utente;

		} catch (Exception e) {
			em.getTransaction().rollback();
			MainProject.logger.error("Error finding utente "+ e);}
		return utente;
	}
}
