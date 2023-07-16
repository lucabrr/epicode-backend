package com.epicode.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.epicode.Util.JpaUtil;
import com.epicode.controller.MainProject;
import com.epicode.model.Libro;
import com.epicode.model.Prestito;

public class PrestitoDAO {
	private static EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
	
	public static void save(Prestito p) {
		try {
			em.getTransaction().begin();
			em.persist(p);
			em.getTransaction().commit();
			MainProject.logger.info("prestito creato");
		} catch (Exception e) {
			em.getTransaction().rollback();
			MainProject.logger.error("error to save Prestito" + e.getMessage());
		}finally {
			em.close();
		}
	}
	
	
	public static Prestito prestitoById(Long id) {
		Prestito prestito = new Prestito();
		try {
			em.getTransaction().begin();
			 prestito = em.find(Prestito.class, id);
			MainProject.logger.info(prestito.toString());
			return prestito;
		} catch (Exception e) {
			em.getTransaction().rollback();
			MainProject.logger.error("Error find Prestito with id:"+id);
		}finally {
				em.close();
				
		}return prestito;
	}
	
	public static List<Prestito> getListByTesseraUtente(int tessera) {
		List<Prestito> lista = null;
		String query = "SELECT p FROM Prestito p WHERE p.utente.numeroTessera = :tessera";
		try {
			Query q =em.createQuery(query);
			q.setParameter("tessera", tessera);
			lista = q.getResultList();
			for (Prestito prestito : lista) {
				MainProject.logger.info(prestito.toString());
			}
			return lista;
			
			
		} catch (Exception e) {
			MainProject.logger.error(e.getMessage());
		}return lista;
	}
	
	
	
	public static List<Prestito> getPrestitoScaduto() {
		List<Prestito> lista = null;
		String query = "SELECT p FROM Prestito p WHERE p.restituzionePrevista < CURRENT_DATE AND p.dataRestituzioneEffettiva IS NULL";
		try {
			Query q =em.createQuery(query);
			
			lista = q.getResultList();
			for (Prestito prestito : lista) {
				MainProject.logger.info(prestito.toString());
			}
			return lista;
			
			
		} catch (Exception e) {
			MainProject.logger.error(e.getMessage());
		}return lista;
	}
	
	
}
