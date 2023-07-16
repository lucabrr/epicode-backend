package com.epicode.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.epicode.model.Evento;

public class EventoDAO {
	
	private static EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
	private static EntityManager em = emf.createEntityManager();
	private static	Logger log = LoggerFactory.getLogger(EventoDAO.class);
	
		static void saveEvent(Evento e) {
			em.getTransaction().begin();
			em.persist(e);
			em.getTransaction().commit();
			System.out.println(e.getTitolo()+" creato");
		}
		
		static Evento trovaEvento(Long id) {
			em.getTransaction().begin();
		Evento e = em.find(Evento.class, id);
			em.getTransaction().commit();
			
			 log.info(e.toString()); 
			return e;
			
		}
		static void eliminaEvento(Long id) {
			em.getTransaction().begin();
			Evento e = em.find(Evento.class, id);
			em.remove(e);
			em.getTransaction().commit();
			
			log.info("l' evento: " +e.getTitolo() + " è stato eliminato");
		}
		
		 static void refresh(Evento e) {
	   
	        try {
	        em.refresh(e);
	        }catch (Exception ex) {
	            System.out.println(ex.getMessage());
	        }finally {
	            em.close();
	        }
	    }
		
}
