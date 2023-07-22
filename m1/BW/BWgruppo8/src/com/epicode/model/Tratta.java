package com.epicode.model;

import java.time.Duration;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import java.time.Duration;

@Entity
public class Tratta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	@Column(nullable = false)
	protected String partenza;
	@Column(nullable = false)
	protected String capolinea;
	@Column(nullable = false)
	String codiceTratta;
	@ManyToOne
	protected MezziTrasporto mezzo;
	@Column(nullable = false)
	protected Duration tempoMedio;
	@Column(nullable = false)
	protected Duration tempoEffettivo;
	
	
	
	
	
	
	public Tratta(String partenza, String capolinea, String codiceTratta, MezziTrasporto mezzo, Duration tempoMedio,
			Duration tempoEffettivo) {
		super();
		this.partenza = partenza;
		this.capolinea = capolinea;
		this.codiceTratta = codiceTratta;
		this.mezzo = mezzo;
		this.tempoMedio = tempoMedio;
		this.tempoEffettivo = tempoEffettivo;
	}



	public Tratta(Long id, String partenza, String capolinea, String codiceTratta,MezziTrasporto mezzo,
			Duration tempoMedio, Duration tempoEffettivo) {
		super();
		this.id = id;
		this.partenza = partenza;
		this.capolinea = capolinea;
		this.codiceTratta = codiceTratta;
		this.mezzo = mezzo;
		this.tempoMedio = tempoMedio;
		this.tempoEffettivo = tempoEffettivo;
		
	}

	public Tratta() {
		super();	
	}
	public String getCodiceTratta() {
		return codiceTratta;
	}
	public void setCodiceTratta(String codiceTratta) {
		this.codiceTratta = codiceTratta;
	}
	
	public Duration getTempoMedio() {
		return tempoMedio;
	}
	public void setTempoMedio(Duration tempoMedio) {
		this.tempoMedio = tempoMedio;
	}
	
	public String getPartenza() {
		return partenza;
	}



	public void setPartenza(String partenza) {
		this.partenza = partenza;
	}



	public String getCapolinea() {
		return capolinea;
	}



	public void setCapolinea(String capolinea) {
		this.capolinea = capolinea;
	}



	public Duration getTempoEffettivo() {
		return tempoEffettivo;
	}
	public void setTempoEffettivo(Duration tempoEffettivo) {
		this.tempoEffettivo = tempoEffettivo;
	}



	@Override
	public String toString() {
		return "Tratta [id=" + id + ", partenza=" + partenza + ", capolinea=" + capolinea + ", codiceTratta="
				+ codiceTratta + ", tempoMedio=" + tempoMedio + ", tempoEffettivo="
				+ tempoEffettivo + "]";
	}



	public MezziTrasporto getMezzo() {
		return mezzo;
	}



	
	
	
	
	
}


