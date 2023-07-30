package com.epicode.GestionePrenotazioni.Classes;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Builder
public class Prenotazione {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@ManyToOne
	private Utente utente;
	@ManyToOne
	private Postazione postazione;
	@Column(nullable = false , name= "data_prenotazione")
	private LocalDate dataPrenotazione;
	
	
	public Prenotazione(Utente utente, Postazione postazione, LocalDate dataPrenotazione) {
		super();
		this.utente = utente;
		this.postazione = postazione;
		this.dataPrenotazione = dataPrenotazione;
	}
	
	
}
