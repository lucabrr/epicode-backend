package com.epicode.GestionePrenotazioni.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.epicode.GestionePrenotazioni.Classes.Postazione;
import com.epicode.GestionePrenotazioni.Classes.Tipo;

public interface IPostazioneDAO extends CrudRepository<Postazione,Long> {

	@Query("SELECT p FROM Postazione p WHERE p.edificio.citta = :citta AND p.tipo = :tipo")
	public List<Postazione>getByCittaNtipo(String citta, Tipo tipo);
}
