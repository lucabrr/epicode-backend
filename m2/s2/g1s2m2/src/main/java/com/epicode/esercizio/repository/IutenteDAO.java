package com.epicode.esercizio.repository;

import org.springframework.data.repository.CrudRepository;

import com.epicode.esercizio.classes.Utente;

public interface IutenteDAO extends CrudRepository<Utente, Long> {

}
