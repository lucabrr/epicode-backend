package com.epicode.gestioneDispositivi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.epicode.gestioneDispositivi.classes.Dipendente;
import com.epicode.gestioneDispositivi.classes.Dispositivo;
import com.epicode.gestioneDispositivi.classes.EStatus;
import com.epicode.gestioneDispositivi.classes.ETipo;
import com.epicode.gestioneDispositivi.exception.PersonalException.DispositivoNonDisponibileException;
import com.epicode.gestioneDispositivi.repository.IdipendenteDAO;
import com.epicode.gestioneDispositivi.repository.IdispositivoDAO;

import jakarta.persistence.EntityNotFoundException;
@Service
public class DispositivoService {

		@Autowired IdispositivoDAO dispositivoDAO ;
		@Autowired ObjectProvider<Dispositivo> dispositivoProvider;
		@Autowired DipendenteService dipService;
		
		public Dispositivo createDispositivo(ETipo _tipo, String _modello) {
			Dispositivo d = dispositivoProvider.getObject();
			d = d.builder()
					.tipo(_tipo)
					.modello(_modello)
					.status(EStatus.DISPONIBILE)
					.dipendenti(new ArrayList<Dipendente>()).build();
			saveDispositivoOnDB(d);
			return d;
			
		}
		public Dispositivo saveDispositivoOnDB(Dispositivo d) {
			return dispositivoDAO.save(d);
		}
		public Dispositivo assegnaDipositivoADipendente(Dispositivo dispositivo, Dipendente dipendente){
			dispositivo.getDipendenti().add(dipendente);
			dispositivo.setStatus(EStatus.ASSEGNATO);
			saveDispositivoOnDB(dispositivo);
			System.out.println("dispositivo assegnato");
			return dispositivo;
		}
		
		public List<Dispositivo> getAllDispositivo(){
			 List<Dispositivo> lista = (List<Dispositivo>) dispositivoDAO.findAll();
			 return lista;
		}
		public Dispositivo getById(long id) {
			if(!dispositivoDAO.existsById(id)) {
				throw new EntityNotFoundException("dispositivo non trovato");
			}
			if(dispositivoDAO.findById(id).get().getStatus() != EStatus.DISPONIBILE) {
				throw new DispositivoNonDisponibileException("il dispositivo non è disponibile");
			}
			return dispositivoDAO.findById(id).get();
			
		}
		public String cancellaDispositivo(long id) {
				if(!dispositivoDAO.existsById(id)) {
					throw new EntityNotFoundException("dispositivo non trovato");
				}
				Optional<Dispositivo>optionalD = dispositivoDAO.findById(id);
				Dispositivo d = optionalD.get();
				dispositivoDAO.delete(d);
				return "dispositivo cancellato";
		
		}
}
