package com.epicode.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

@Entity
public class Abbonamento extends DocumentoVendita {
	
	@Column(nullable = false)
	private LocalDate dataScadenza;
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Periodicita periodicita;
	@OneToOne
	private Tessera tessera;
	

	public Abbonamento(Long id, String codice, LocalDate dataEmissione, PuntoVendita puntoVendita,
			LocalDate dataScadenza, Periodicita periodicita, Tessera tessera) {
		super(id, codice, dataEmissione, puntoVendita);
		this.dataScadenza = dataScadenza.plusMonths(1);
		this.periodicita = periodicita;
		this.tessera = tessera;
	}

	public Abbonamento(String codice, LocalDate dataEmissione, PuntoVendita puntoVendita, LocalDate dataScadenza,
			Periodicita periodicita, Tessera tessera) {
		super(codice, dataEmissione, puntoVendita);
		this.dataScadenza = dataScadenza;
		this.periodicita = periodicita;
		this.tessera = tessera;
	}

	public Abbonamento() {
		super();
		
	}

	public LocalDate getDataScadenza() {
		return dataScadenza;
	}

	public void setDataScadenza(LocalDate dataScadenza) {
		this.dataScadenza = dataScadenza;
	}

	public Periodicita getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}

	public Tessera getTessera() {
		return tessera;
	}

	public void setTessera(Tessera tessera) {
		this.tessera = tessera;
	}

	@Override
	public String toString() {
		return "Abbonamento [dataScadenza=" + dataScadenza + ", periodicita=" + periodicita + ", tessera=" + tessera
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
}
