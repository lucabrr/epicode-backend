package com.epicode.model.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.epicode.Util.JpaUtil;
import com.epicode.controller.MainProject;
import com.epicode.model.Libro;

public class LibroDAO {
	
	static	EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
	
	public static void save(Libro libro) {
		try {
			em.getTransaction().begin();
			em.persist(libro);
			em.getTransaction().commit();
		MainProject.logger.info(libro.getTitolo() +" è stato creato");
		}catch (Exception e) {
			em.getTransaction().rollback();
			MainProject.logger.error("Error saving object: " + libro.getClass().getSimpleName(), e);
		}finally {
			em.close();
		}
	}
	
	
	public static Libro trovaLibroById(Long id) {
			Libro libro = new Libro();
		try {
			em.getTransaction().begin();
			 libro = em.find(Libro.class, id);
			MainProject.logger.info(libro.toString());
			return libro;
		} catch (Exception e) {
			em.getTransaction().rollback();
			MainProject.logger.error("Error find Libro with id:"+id);
		}finally {
				em.close();
				
		}return libro;
	}
	public static void cancellaLibro(Long id) {
		try {
			Libro libro = trovaLibroById(id);
			em.getTransaction().begin();
			em.remove(libro);
			em.getTransaction().commit();
		}catch (Exception e) {
			em.getTransaction().rollback();
			MainProject.logger.error("Error deleting Libro with id:"+id);
		}finally {
			em.close();
		}
	}
	
	public static Libro getByISMB(String isbm) {
		String query = "SELECT l FROM Libro l WHERE l.codiceISBM LIKE :isbm";
		Query q = em.createQuery(query);
		q.setParameter("isbm",isbm);
		Libro libro = new Libro();
		try {
			 libro = (Libro) q.getSingleResult();
			MainProject.logger.info(libro.toString());
			return libro;
		} catch (Exception e) {
			MainProject.logger.error(e.getMessage());
			
			}return libro;
		}
		public static List<Libro> getByYear(int year) {
			String query = "SELECT l FROM Libro l WHERE EXTRACT(YEAR FROM l.annoPubblicazione) = :year";
			Query q = em.createQuery(query);
			q.setParameter("year",year);
			List<Libro>lista = null;
			try {
				
				lista =  q.getResultList();
				for (Libro libro : lista) {
					MainProject.logger.info(libro.toString());
				}
				return lista;
			} catch (Exception e) {
				MainProject.logger.error(e.getMessage());
				return lista;
			}		
	}
		public static List<Libro> getByAutore(String autore) {
			String query = "SELECT l FROM Libro l WHERE l.autore LIKE :autore";
			Query q = em.createQuery(query);
			q.setParameter("autore",autore);
			List<Libro> lista = null;
			try {
				lista =  q.getResultList();
				for (Libro libro : lista) {
					MainProject.logger.info(libro.toString());
				}
				return lista;
			} catch (Exception e) {
				MainProject.logger.error(e.getMessage());
				return lista;
			}
			}
		public static List<Libro> getByPartial(String str) {
			String query = "SELECT l FROM Libro l WHERE lower(l.titolo) LIKE :titolo";
			Query q = em.createQuery(query);
			q.setParameter("titolo","%"+str+"%");
			List<Libro> lista = null;
			try {
				
				lista =  q.getResultList();
				for (Libro libro : lista) {
					MainProject.logger.info(libro.toString());
				}
				return lista;
			} catch (Exception e) {
				MainProject.logger.error(e.getMessage());
				return lista;
			}
			}
		
}
