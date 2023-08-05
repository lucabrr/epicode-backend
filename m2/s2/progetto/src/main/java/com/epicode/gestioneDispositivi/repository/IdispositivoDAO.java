package com.epicode.gestioneDispositivi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicode.gestioneDispositivi.classes.Dispositivo;
@Repository
public interface IdispositivoDAO extends CrudRepository<Dispositivo, Long>{

}
