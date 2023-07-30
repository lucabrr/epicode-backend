package com.epicode.GodfathersPizza.repository;

import org.springframework.data.repository.CrudRepository;

import com.epicode.GodfathersPizza.classes.Ordine;

public interface IOrdineDAO extends CrudRepository<Ordine, Long> {

}
