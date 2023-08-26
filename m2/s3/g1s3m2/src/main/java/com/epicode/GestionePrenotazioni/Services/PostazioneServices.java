package com.epicode.GestionePrenotazioni.Services;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epicode.GestionePrenotazioni.Classes.Edificio;
import com.epicode.GestionePrenotazioni.Classes.Postazione;
import com.epicode.GestionePrenotazioni.Classes.Tipo;
import com.epicode.GestionePrenotazioni.Repository.IPostazioneDAO;
@Service
public class PostazioneServices {
	@Autowired private ObjectProvider<Postazione> postazioneProvider;
	@Autowired private IPostazioneDAO postazioneDAO;
	
	public Postazione createPostazione(String _codicePostazione, String _descrizione, Tipo _tipo, int _maxPax, Edificio _edificio ) {
		Postazione p = postazioneProvider.getObject();
									p = p.builder()
									.codicePostazione(_codicePostazione)
									.descrizione(_descrizione)
									.tipo(_tipo)
									.maxPax(_maxPax)
									.edificio(_edificio)
									.build();
			postazioneDAO.save(p);
			System.out.println("postazione: " + p.getCodicePostazione() + " salvata nel db");	
			return p;
	}
	
	public List<Postazione> cercaPostazioni(String citta, Tipo tipo){
	 List<Postazione> lista = postazioneDAO.getByCittaNtipo(citta, tipo);
	 if(lista.size() == 0 ) {System.out.println("non è stata trovata nessuna postazione");}
	 return lista;
	}
	
	
	

}
