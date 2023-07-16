package com.epicode.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Catalogo {
	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable = false, unique = true)
	private String codiceISBM;
	@Column(nullable = false)
	private String titolo;
	@Column(nullable = false)
	private LocalDate annoPubblicazione;
	@Column(nullable = false)
	private int numeroPagine;
	
	
	

	public Catalogo(Long id, String codiceISBM, String titolo, LocalDate annoPubblicazione, int numeroPagine) {
		super();
		this.id = id;
		this.codiceISBM = codiceISBM;
		this.titolo = titolo;
		this.annoPubblicazione = annoPubblicazione;
		this.numeroPagine = numeroPagine;
	}


	public Catalogo(String codiceISBM, String titolo, LocalDate annoPubblicazione, int numeroPagine) {
		super();
		this.codiceISBM = codiceISBM;
		this.titolo = titolo;
		this.annoPubblicazione = annoPubblicazione;
		this.numeroPagine = numeroPagine;
	}


	public Catalogo() {
		super();
	}


	public String getCodiceISBM() {
		return codiceISBM;
	}

	

	public Long getId() {
		return id;
	}


	


	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public LocalDate getAnnoPubblicazione() {
		return annoPubblicazione;
	}

	public void setAnnoPubblicazione(LocalDate annoPubblicazione) {
		this.annoPubblicazione = annoPubblicazione;
	}

	public int getNumeroPagine() {
		return numeroPagine;
	}

	public void setNumeroPagine(int numeroPagine) {
		this.numeroPagine = numeroPagine;
	}

	@Override
	public String toString() {
		return "[tipo=Catalogo, codiceISBM=" + codiceISBM + ", titolo=" + titolo + ", annoPubblicazione=" + annoPubblicazione
				+ ", numeroPagine=" + numeroPagine + "]";
	}
	
}

