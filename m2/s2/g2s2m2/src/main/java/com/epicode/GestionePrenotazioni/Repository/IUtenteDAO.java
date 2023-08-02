package com.epicode.GestionePrenotazioni.Repository;

import org.springframework.data.repository.CrudRepository;

import com.epicode.GestionePrenotazioni.Classes.Utente;

public interface IUtenteDAO  extends CrudRepository<Utente,Long>{

}
