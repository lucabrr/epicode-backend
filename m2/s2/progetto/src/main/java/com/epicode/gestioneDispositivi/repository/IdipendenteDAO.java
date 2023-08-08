package com.epicode.gestioneDispositivi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicode.gestioneDispositivi.classes.Dipendente;

@Repository
public interface IdipendenteDAO  extends CrudRepository<Dipendente, Long>{

}
