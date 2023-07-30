package com.epicode.GestionePrenotazioni.Services;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.GestionePrenotazioni.Classes.Edificio;
import com.epicode.GestionePrenotazioni.Repository.IEdificioDAO;

@Service
public class EdificioServices {
	
	
	@Autowired @Qualifier("edificio") private ObjectProvider<Edificio> edificioProvider;
	@Autowired IEdificioDAO edificioDAO;
	
	public Edificio createEdificio(String _name , String _indirizzo, String _citta) {
		Edificio e = edificioProvider.getObject();
							e=	e.builder()
								.nome(_name)
								.indirizzo(_indirizzo)
								.citta(_citta)
								.build();
		edificioDAO.save(e);
		System.out.println("edificio " + e.getNome()+ " salvato nel DB");
		return e;
							
	}
	
	public void removeEdificio(Edificio e) {
		edificioDAO.delete(e);
		System.out.println("edificio: "+ e.getNome() + " eliminato dal DB");
	}
	public Edificio getById(long id) {
		return edificioDAO.findById(id).get();
		
	}
}
