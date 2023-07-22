package com.epicode.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Biglietto extends DocumentoVendita {
	
	private LocalDate dataConvalida;
	@Column(name = "convalidato")
	private Boolean convalidato = false;

	



	public Biglietto(Long id, String codice, LocalDate dataEmissione, PuntoVendita puntoVendita
			) {
		super(id, codice, dataEmissione, puntoVendita);
		this.dataConvalida = null;
		
		
	}

	public Biglietto(String codice, LocalDate dataEmissione,PuntoVendita puntoVendita) {
		super(codice, dataEmissione, puntoVendita);
		this.dataConvalida = null;
		
		
	}

	public Biglietto() {
		super();
	}

	

	public Boolean getConvalidato() {
		return convalidato;
	}

	public void setConvalidato(Boolean convalidato) {
		this.convalidato = convalidato;
	}

	public LocalDate getDataConvalida() {
		return dataConvalida;
	}

	public void setDataConvalida(LocalDate dataConvalida) {
		this.dataConvalida = dataConvalida;
	}

	

	

	@Override
	public String toString() {
		return "Biglietto [dataConvalida=" + dataConvalida + ", convalidato=" + convalidato + ", getCodice()="
				+ getCodice() + ", getDataEmissione()=" + getDataEmissione() + "]";
	}

	public MezziTrasporto getMezzo() {
		// TODO Auto-generated method stub
		return null;
	}

}
