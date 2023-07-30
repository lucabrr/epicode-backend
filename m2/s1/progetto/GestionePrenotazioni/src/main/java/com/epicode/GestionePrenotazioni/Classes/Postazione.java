package com.epicode.GestionePrenotazioni.Classes;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Builder
public class Postazione {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "codice_postazione" , nullable = false, unique = true)
	private String codicePostazione;
	@Column(nullable = false)
	private String descrizione;
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Tipo tipo;
	@Column(name = "max_persone" , nullable = false)
	private int maxPax;
	@ManyToOne
	Edificio edificio;
	
	
	
	public Postazione(String codicePostazione, String descrizione, Tipo tipo, int maxPax, Edificio edificio) {
		super();
		this.codicePostazione = codicePostazione;
		this.descrizione = descrizione;
		this.tipo = tipo;
		this.maxPax = maxPax;
		this.edificio = edificio;
	}
	
	
	
}
