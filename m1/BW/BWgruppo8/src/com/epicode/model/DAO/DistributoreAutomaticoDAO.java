package com.epicode.model.DAO;

import javax.persistence.Query;

import com.epicode.controller.MainProject;
import com.epicode.model.DistributoreAutomatico;
import com.epicode.model.RivenditoreAutorizzato;

public class DistributoreAutomaticoDAO {

	
	public static void save(DistributoreAutomatico d) {
		try {
			MainProject.em.getTransaction().begin();
			MainProject.em.persist(d);
			MainProject.em.getTransaction().commit();
			MainProject.log.info("Distributore: "+ d.getCodice() +" creato");
			
			
		} catch (Exception e) {
			MainProject.em.getTransaction().rollback();
			MainProject.log.error(e.getMessage());
			
		}
	}
	
	
	public static DistributoreAutomatico getByCode(String codice) {
		DistributoreAutomatico d = new DistributoreAutomatico();
		try {
			String query = "SELECT d FROM DistributoreAutomatico d WHERE d.codice = :codice";
			Query q = MainProject.em.createQuery(query);
			q.setParameter("codice",codice);
			d = (DistributoreAutomatico) q.getSingleResult();
			
		} catch (Exception e) {
			e.printStackTrace();
			MainProject.log.error(e.getMessage());
		} return d;
		
	}
	
}
