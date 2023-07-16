package com.epicode.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.epicode.Util.JpaUtil;
import com.epicode.controller.MainProject;
import com.epicode.model.Libro;
import com.epicode.model.Rivista;

public class RivistaDAO {

	static EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
	
		public static void save(Rivista r) {
			try {
				em.getTransaction().begin();
				em.persist(r);
				em.getTransaction().commit();
				MainProject.logger.info("oggetto rivista salvato");
			} catch (Exception e) {
				em.getTransaction().rollback();
				em.close();
				MainProject.logger.error(e.getMessage());
			}
		}
		
		
		public static Rivista getRivistaById(Long id) {
			Rivista rivista = new Rivista();
		try {
			em.getTransaction().begin();
			 rivista = em.find(Rivista.class, id);
			MainProject.logger.info(rivista.toString());
			return rivista;
		} catch (Exception e) {
			em.getTransaction().rollback();
			MainProject.logger.error("Error find rivista with id:"+id);
		}finally {
				em.close();
				
		}return rivista;
	}
		
		
		
		
		public static void cancellaRivista(Long id) {
			try {
				Rivista rivista = getRivistaById(id);
				em.getTransaction().begin();
				em.remove(rivista);
				em.getTransaction().commit();
			}catch (Exception e) {
				em.getTransaction().rollback();
				MainProject.logger.error("Error deleting rivista with id:"+id);
			}finally {
				em.close();
			}
		}
		
		
		public static Rivista getByISMB(String isbm) {
			String query = "SELECT l FROM Rivista l WHERE l.codiceISBM LIKE :isbm";
			Query q = em.createQuery(query);
			q.setParameter("isbm",isbm);
			Rivista rivista = new Rivista();
			try {
				rivista = (Rivista) q.getSingleResult();
				MainProject.logger.info(rivista.toString());
				return rivista;
			} catch (Exception e) {
				MainProject.logger.error(e.getMessage());
				
				}return rivista;
			}
		
		
		public static List<Rivista> getByYear(int year) {
			String query = "SELECT l FROM Rivista l WHERE EXTRACT(YEAR FROM l.annoPubblicazione) = :year";
			Query q = em.createQuery(query);
			q.setParameter("year",year);
			List<Rivista>lista = null;
			try {
				
				lista =  q.getResultList();
				for (Rivista rivista : lista) {
					MainProject.logger.info(rivista.toString());
				}
				return lista;
			} catch (Exception e) {
				MainProject.logger.error(e.getMessage());
				return lista;
			}		
	}
		
		public static List<Rivista> getByPartial(String str) {
			String query = "SELECT l FROM Rivista l WHERE lower(l.titolo) LIKE :titolo";
			Query q = em.createQuery(query);
			q.setParameter("titolo","%"+str+"%");
			List<Rivista> lista = null;
			try {
				
				lista =  q.getResultList();
				for (Rivista rivista : lista) {
					MainProject.logger.info(rivista.toString());
				}
				return lista;
			} catch (Exception e) {
				MainProject.logger.error(e.getMessage());
				return lista;
			}
			}
		
		
}
