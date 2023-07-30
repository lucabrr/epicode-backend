package com.epicode.GestionePrenotazioni.Services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epicode.GestionePrenotazioni.Classes.Postazione;
import com.epicode.GestionePrenotazioni.Classes.Prenotazione;
import com.epicode.GestionePrenotazioni.Classes.Utente;
import com.epicode.GestionePrenotazioni.Repository.IPostazioneDAO;
import com.epicode.GestionePrenotazioni.Repository.IPrenotazioneDAO;

@Service
public class PrenotazioneServices {
	@Autowired private ObjectProvider<Prenotazione> prenotazioneProvider;
	@Autowired private IPrenotazioneDAO prenotazioneDAO;
	
	public Prenotazione createPrenotazione(Utente _utente, Postazione _postazione , LocalDate _data) {
		Prenotazione check = getByCodeAndDate(_postazione.getCodicePostazione(), _data);
		List<Prenotazione> listaPerIlControllo = getByIdNdate(_utente.getId(), _data);
		
		if(listaPerIlControllo.size() >= 1) {
			System.out.println
			("l'utente "+ _utente.getNomeCompleto() + " ha già fatto una prenotazione in questa data.");
			return null;
			}
		
		if(check == null) {
		Prenotazione p = prenotazioneProvider.getObject();
		
				p = p.builder()
				.utente(_utente)
				.postazione(_postazione)
				.dataPrenotazione(_data)
				.build();
				prenotazioneDAO.save(p);
				System.out.println("utente "+ _utente.getNomeCompleto()+ " ha prenotato la postazione" + _postazione.getCodicePostazione() + " in data:" + _data);
				return p;
		}else {System.out.println
			("la postazione " + _postazione.getCodicePostazione()+ " è occupata in questa data");
			 return null;
			 }
	}
	
	private Prenotazione getByCodeAndDate(String _code, LocalDate _date) {
		Prenotazione p = prenotazioneDAO.getBycodeNdate(_code, _date);
		return p;
	}
	
	private List<Prenotazione> getByIdNdate(long id , LocalDate date ){
		List<Prenotazione> lista = prenotazioneDAO.getByIdNdate(id, date);
		return lista;
	}
	

}
