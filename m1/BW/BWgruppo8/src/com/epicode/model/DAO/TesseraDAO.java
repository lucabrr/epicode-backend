package com.epicode.model.DAO;

import javax.persistence.Query;

import com.epicode.controller.MainProject;
import com.epicode.model.Tessera;

public class TesseraDAO {
	
	public static void save(Tessera t) {
			try {
				MainProject.em.getTransaction().begin();
				MainProject.em.persist(t);
				MainProject.em.getTransaction().commit();
				MainProject.log.info("tessera: " + t.getCodiceTessera()+"creata!");
			} catch (Exception e) {
				MainProject.log.error(e.getMessage());
			}
	}
	
	public static Tessera getByCode (String codice) {
		Tessera t = new Tessera();
		String query = "SELECT t FROM Tessera t WHERE t.codiceTessera = :codice"; 
		try {
			Query q = MainProject.em.createQuery(query);
			q.setParameter("codice",codice);
			t = (Tessera) q.getSingleResult();
		} catch (Exception e) {
			MainProject.log.error(e.getMessage());
		}return t;
	};
}
