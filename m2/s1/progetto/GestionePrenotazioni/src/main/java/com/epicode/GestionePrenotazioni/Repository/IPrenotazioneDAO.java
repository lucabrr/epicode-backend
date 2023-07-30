package com.epicode.GestionePrenotazioni.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.epicode.GestionePrenotazioni.Classes.Prenotazione;

public interface IPrenotazioneDAO  extends CrudRepository<Prenotazione,Long>{
	
	@Query("SELECT p FROM Prenotazione p WHERE p.postazione.codicePostazione = :code AND p.dataPrenotazione = :date")
	public Prenotazione getBycodeNdate(String code, LocalDate date);
	@Query("SELECT p FROM Prenotazione p WHERE p.utente.id = :id AND p.dataPrenotazione = :date")
	public List<Prenotazione> getByIdNdate(long id , LocalDate date );
	
}
