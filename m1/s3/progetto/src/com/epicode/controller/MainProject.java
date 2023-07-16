package com.epicode.controller;

import java.time.LocalDate;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.epicode.model.Libro;
import com.epicode.model.Periodicita;
import com.epicode.model.Prestito;
import com.epicode.model.Rivista;
import com.epicode.model.Utente;
import com.epicode.model.dao.LibroDAO;
import com.epicode.model.dao.PrestitoDAO;
import com.epicode.model.dao.RivistaDAO;
import com.epicode.model.dao.UtenteDAO;

public class MainProject {
	public static final Logger logger = LoggerFactory.getLogger(MainProject.class);
	public static void main(String[] args) {
		Libro l1 = new Libro("123456789", "Il signore degli anelli", LocalDate.of(1954, 7, 29), 1178, "J.R.R. Tolkien", "Fantasy");
		Libro l2 = new Libro("test1233", "1984", LocalDate.of(1949, 6, 8), 328, "George Orwell", "Distopia");
		Libro l3 = new Libro("test3212", "Il nome della rosa", LocalDate.of(1980, 1, 1), 500, "Umberto Eco", "Mistero");
		Libro l4 = new Libro("test3155", "Harry Potter e la pietra filosofale", LocalDate.of(1997, 6, 26), 320, "J.K. Rowling", "Fantasy");
		
		
		//LibroDAO.save(l3);
		//LibroDAO.getByISMB("123456789");
		//LibroDAO.getByPartial("il");
		//LibroDAO.trovaLibroById(9l);
		//LibroDAO.getByYear(1997);
		
		Rivista r1 = new Rivista("try1234", "National Geographic", LocalDate.of(2021, 10, 1), 100, Periodicita.SEMESTRALE);
		Rivista r2 = new Rivista("try5432", "Time", LocalDate.of(2021, 9, 15), 80, Periodicita.SETTIMANALE);
		Rivista r3 = new Rivista("red5644", "Scientific American", LocalDate.of(2021, 8, 5), 64, Periodicita.MENSILE);
		
		//RivistaDAO.save(r3);
		//RivistaDAO.getByISMB("try1234");
		//RivistaDAO.getRivistaById(15l);
		//RivistaDAO.getByYear(2021);
		//RivistaDAO.getByPartial("can");
		
		Utente u1 = new Utente("Luca", "Rossi", LocalDate.of(1990, 1, 1), 1234);
		Utente u2 = new Utente("Mario", "Bianchi", LocalDate.of(1991, 2, 2), 2453);
		Utente u3 = new Utente("Giovanna", "Verdi", LocalDate.of(1992, 3, 3), 3422);
		Utente u4 = new Utente("Francesca", "Ballak", LocalDate.of(2000, 3, 3), 4421);
		
		//UtenteDAO.save(u4);
		//UtenteDAO.getById(1l);
		
		
		
	//Prestito p1 = new Prestito(UtenteDAO.getById(1l),LibroDAO.trovaLibroById(10l),LocalDate.of(2022, 5, 12),LocalDate.of(2022, 5, 12),null);
	//Prestito p2 = new Prestito(UtenteDAO.getById(2l),LibroDAO.trovaLibroById(11l),LocalDate.of(2022, 5, 12),LocalDate.of(2022, 5, 12),LocalDate.of(2022, 5, 22));
	Prestito p3 = new Prestito(UtenteDAO.getById(4l),RivistaDAO.getRivistaById(15l),LocalDate.of(2019, 5, 22),LocalDate.of(2019, 5, 22),LocalDate.of(2019, 7, 22));
		PrestitoDAO.save(p3);
		 // PrestitoDAO.getListByTesseraUtente(3422);
		//PrestitoDAO.getPrestitoScaduto();
		
	}
	
}
