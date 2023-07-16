package com.epicode.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;




@Entity
public class Libro extends Catalogo{
	@Column ( nullable = false)
	private String autore;
	@Column ( nullable = false)
	private String genere;
	
	
	public Libro() {
		super();
	}


	public Libro(String codiceISBM, String titolo, LocalDate annoPubblicazione, int numeroPagine, String autore,
			String genere) {
		super(codiceISBM, titolo, annoPubblicazione, numeroPagine);
		this.autore = autore;
		this.genere = genere;
	}


	public String getAutore() {
		return autore;
	}


	public void setAutore(String autore) {
		this.autore = autore;
	}


	public String getGenere() {
		return genere;
	}


	public void setGenere(String genere) {
		this.genere = genere;
	}


	


	


	@Override
	public String toString() {
		return "Libro [autore=" + autore + ", genere=" + genere + ", getCodiceISBM()=" + getCodiceISBM() + ", getId()="
				+ getId() + ", getTitolo()=" + getTitolo() + ", getAnnoPubblicazione()=" + getAnnoPubblicazione()
				+ ", getNumeroPagine()=" + getNumeroPagine() + "]";
	}


	public Libro(Long id, String codiceISBM, String titolo, LocalDate annoPubblicazione, int numeroPagine,
			String autore, String genere) {
		super(id, codiceISBM, titolo, annoPubblicazione, numeroPagine);
		this.autore = autore;
		this.genere = genere;
	}


	

	


	
	

	

	


	
}

