package com.epicode.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Tessera {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private	Long id;
	@Column(nullable = false)
	private String codiceTessera;
	@Column(nullable = false)
	private	LocalDate dataEmissione;
	@Column(nullable = false)
	private	LocalDate dataScadenza;
	@OneToOne
	private Utente utente;

	
	

	public Tessera( String codiceTessera, LocalDate dataEmissione, LocalDate dataScadenza,
			 Utente utente) {
		super();
		
		this.codiceTessera = codiceTessera;
		this.dataEmissione = dataEmissione;
		this.dataScadenza = dataScadenza.plusYears(1);
		this.utente = utente;
	}



	public Tessera(Long id, String codiceTessera, LocalDate dataEmissione, LocalDate dataScadenza) {
		super();
		this.id = id;
		this.codiceTessera = codiceTessera;
		this.dataEmissione = dataEmissione;
		this.dataScadenza = dataScadenza.plusYears(1);
	}



	public Tessera() {
		super();
	}



	public Long getId() {
		return id;
	}


	public String getCodiceTessera() {
		return codiceTessera;
	}



	public void setCodiceTessera(String codiceTessera) {
		this.codiceTessera = codiceTessera;
	}



	public LocalDate getDataEmissione() {
		return dataEmissione;
	}



	public void setDataEmissione(LocalDate dataEmissione) {
		this.dataEmissione = dataEmissione;
	}



	public LocalDate getDataScadenza() {
		return dataScadenza;
	}



	public void setDataScadenza(LocalDate dataScadenza) {
		this.dataScadenza = dataScadenza;
	}






	public Utente getUtente() {
		return utente;
	}



	public void setUtente(Utente utente) {
		this.utente = utente;
	}



	@Override
	public String toString() {
		return "Tessera [id=" + id + ", codiceTessera=" + codiceTessera + ", dataEmissione=" + dataEmissione
				+ ", dataScadenza=" + dataScadenza + ", utente=" + utente + "]";
	}

	
	
	
}
