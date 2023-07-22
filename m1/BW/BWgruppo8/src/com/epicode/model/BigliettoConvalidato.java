package com.epicode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class BigliettoConvalidato {
	@Id
	@GeneratedValue
	protected Long id;
	
	@OneToOne
	private Biglietto biglietto;
	@ManyToOne
	private MezziTrasporto mezzo;
	
	
	
	public BigliettoConvalidato(MezziTrasporto mezzo,Biglietto biglietto) {
		super();
		this.biglietto = biglietto;
		this.mezzo = mezzo;
		if (mezzo.stato != Stato.SERVIZIO) {
            throw new Error("Il mezzo non è attualmente in servizio.");
        }
		
	}



	public BigliettoConvalidato(Long id, Biglietto biglietto, MezziTrasporto mezzo) {
		super();
		this.id = id;
		this.biglietto = biglietto;
		this.mezzo = mezzo;
		if (mezzo.stato != Stato.SERVIZIO) {
            throw new Error("Il mezzo non è attualmente in servizio.");
        }
	}



	public BigliettoConvalidato() {
		super();
	}



	public Biglietto getBiglietto() {
		return biglietto;
	}



	public void setBiglietto(Biglietto biglietto) {
		this.biglietto = biglietto;
	}



	public MezziTrasporto getMezzo() {
		return mezzo;
	}



	public void setMezzo(MezziTrasporto mezzo) {
		this.mezzo = mezzo;
	}



	public Long getId() {
		return id;
	}



	@Override
	public String toString() {
		return "BigliettoConvalidato [id=" + id + ", biglietto=" + biglietto + ", mezzo=" + mezzo + "]";
	}
	
	

}
