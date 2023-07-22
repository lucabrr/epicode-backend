package com.epicode.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class MezziTrasporto {
	@Id
    @GeneratedValue
    protected Long id;
    @Column (nullable = false)
    protected int posti;
    @Column (nullable = false, unique = true)
    String immatricolazione;
    @Column (nullable = false)
    @Enumerated(EnumType.STRING)
    Stato stato ;
    @OneToMany
    protected List<StoricoMezzo>storico;
    @OneToMany
    protected List<BigliettoConvalidato>bigliettoConvalidato;
    @OneToMany
    protected List<Tratta> tratta;
    
    
	public MezziTrasporto(int posti, String immatricolazione, Stato stato) {
		super();
		this.posti = posti;
		this.immatricolazione = immatricolazione;
		this.stato = stato;
	}




	public MezziTrasporto(Long id, int posti, String immatricolazione, List<StoricoMezzo> storico,
			List<BigliettoConvalidato> bigliettoConvalidato, List<Tratta> tratta) {
		super();
		this.id = id;
		this.posti = posti;
		this.immatricolazione = immatricolazione;
		this.storico = storico;
		this.bigliettoConvalidato = bigliettoConvalidato;
		this.tratta = tratta;
	}



	public MezziTrasporto() {
		super();
	}



	public int getPosti() {
		return posti;
	}



	public void setPosti(int posti) {
		this.posti = posti;
	}



	public String getImmatricolazione() {
		return immatricolazione;
	}



	public void setImmatricolazione(String immatricolazione) {
		this.immatricolazione = immatricolazione;
	}



	public List<StoricoMezzo> getStorico() {
		return storico;
	}

	public void setStorico(List<StoricoMezzo> storico) {
		this.storico = storico;
	}



	public List<BigliettoConvalidato> getBigliettoConvalidato() {
		return bigliettoConvalidato;
	}



	public void setBigliettoConvalidato(List<BigliettoConvalidato> bigliettoConvalidato) {
		this.bigliettoConvalidato = bigliettoConvalidato;
	}



	public List<Tratta> getTratta() {
		return tratta;
	}



	public void setTratta(List<Tratta> tratta) {
		this.tratta = tratta;
	}



	public Long getId() {
		return id;
	}




	public Stato getStato() {
		return stato;
	}








	
	
	
	
	
	

}
