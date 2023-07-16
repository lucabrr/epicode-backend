package com.epicode.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;



@Entity
public class Rivista  extends Catalogo  {
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Periodicita periodicita;

	
	

	public Rivista(Long id, String codiceISBM, String titolo, LocalDate annoPubblicazione, int numeroPagine,
			Periodicita periodicita) {
		super(id, codiceISBM, titolo, annoPubblicazione, numeroPagine);
		this.periodicita = periodicita;
	}


	public Rivista(String codiceISBM, String titolo, LocalDate annoPubblicazione, int numeroPagine,
			Periodicita periodicita) {
		super(codiceISBM, titolo, annoPubblicazione, numeroPagine);
		this.periodicita = periodicita;
	}


	public Rivista() {
		super();
	}


	public Periodicita getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}


	@Override
	public String toString() {
		return "Rivista [periodicita=" + periodicita + ", CodiceISBM=" + getCodiceISBM() + ", Titolo="
				+ getTitolo() + ", AnnoPubblicazione=" + getAnnoPubblicazione() + ", NumeroPagine="
				+ getNumeroPagine() + "]";
	}

	

	

	
	
	
	



}
