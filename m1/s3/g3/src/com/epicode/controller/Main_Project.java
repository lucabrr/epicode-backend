package com.epicode.controller;


import java.time.LocalDate;


import com.epicode.model.Evento;
import com.epicode.model.TipoEvento;



public class Main_Project {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Evento e1 = new Evento("tizianoFerro", LocalDate.of(2023, 8, 12),
				"concerto molto noioso", TipoEvento.PUBBLICO, 400);
		
		Evento e2 = new Evento("dios", LocalDate.of(2020, 8, 12),
				"concerto molto dioso", TipoEvento.PRIVATO, 400);
		
		EventoDAO.trovaEvento(1l);
		
	}
		
		

}
