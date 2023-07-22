package com.epicode.model.DAO;

import com.epicode.controller.MainProject;
import com.epicode.model.Utente;

public class UtenteDAO {
	
	public static void save(Utente u) {
		try {
			MainProject.em.getTransaction().begin();
			MainProject.em.persist(u);
			MainProject.em.getTransaction().commit();
			MainProject.log.info("utente: " +u.getNome() + " "+ u.getCognome()+ " è stato creato");
		} catch (Exception e) {
			MainProject.log.error(e.getMessage());
		}
	}
	
	public static Utente getById(Long id) {
		Utente u = new Utente();
		try {
			MainProject.em.getTransaction().begin();
			u= MainProject.em.find(Utente.class, id);
			MainProject.em.getTransaction().commit();
		} catch (Exception e) {
			MainProject.log.error(e.getMessage());
		}return u;
	}
}
