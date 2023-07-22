package com.epicode.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class DocumentoVendita {
	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable = false, unique = true)
	private String codice;
	@Column(nullable = false)
	private LocalDate dataEmissione;
	@ManyToOne
	PuntoVendita puntoVendita;
	
	
	
	
	
	



	public DocumentoVendita(String codice, LocalDate dataEmissione, PuntoVendita puntoVendita) {
		super();
		this.codice = codice;
		this.dataEmissione = dataEmissione;
		this.puntoVendita = puntoVendita;
	}



	public DocumentoVendita(Long id, String codice, LocalDate dataEmissione, PuntoVendita puntoVendita) {
		super();
		this.id = id;
		this.codice = codice;
		this.dataEmissione = dataEmissione;
		this.puntoVendita = puntoVendita;
	}



	public DocumentoVendita() {
		super();
	}



	public Long getId() {
		return id;
	}



	



	public String getCodice() {
		return codice;
	}



	public void setCodice(String codice) {
		this.codice = codice;
	}



	public LocalDate getDataEmissione() {
		return dataEmissione;
	}



	public void setDataEmissione(LocalDate dataEmissione) {
		this.dataEmissione = dataEmissione;
	}



	@Override
	public String toString() {
		return "DocumentoVendita [id=" + id + ", codice=" + codice + ", dataEmissione=" + dataEmissione
				+ ", puntoVendita=" + puntoVendita + "]";
	}
	
	
	
}
