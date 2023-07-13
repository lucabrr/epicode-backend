package com.epicode.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "eventi")
public class Evento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column ( nullable = false)
	private String titolo ;
	@Column (name= "dataevento", nullable = false)
	private LocalDate dataEvento ;
	@Column ( nullable = false)
	private String descrizione;
	@Column (name= "tipoevento", nullable = false)
	private TipoEvento tipoEvento;
	@Column (name= "nmaxpartecipanti", nullable = false)
	private int numeroMaxPartecipanti;
	
	
	public Evento() {
		super();
	}


	public Evento(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento,
			int numeroMaxPartecipanti) {
		super();
		this.titolo = titolo;
		this.dataEvento = dataEvento;
		this.descrizione = descrizione;
		this.tipoEvento = tipoEvento;
		this.numeroMaxPartecipanti = numeroMaxPartecipanti;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitolo() {
		return titolo;
	}


	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}


	public LocalDate getDataEvento() {
		return dataEvento;
	}


	public void setDataEvento(LocalDate dataEvento) {
		this.dataEvento = dataEvento;
	}


	public String getDescrizione() {
		return descrizione;
	}


	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}


	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}


	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}


	public int getNumeroMaxPartecipanti() {
		return numeroMaxPartecipanti;
	}


	public void setNumeroMaxPartecipanti(int numeroMaxPartecipanti) {
		this.numeroMaxPartecipanti = numeroMaxPartecipanti;
	}
	
	

}
