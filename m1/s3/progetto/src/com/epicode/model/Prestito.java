package com.epicode.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "prestiti")
public class Prestito {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Utente utente;
	@OneToOne(fetch = FetchType.EAGER)
	private Catalogo elementoBiblioteca;
	@Column(nullable = false)
	private LocalDate inizioPrestito;
	@Column(nullable = false)
	private LocalDate restituzionePrevista;
	@Column(nullable = true)
	private LocalDate dataRestituzioneEffettiva;
	
	
	public Prestito(Long id, Utente utente, Catalogo elementoBiblioteca, LocalDate inizioPrestito,
			LocalDate restituzionePrevista, LocalDate dataRestituzioneEffettiva) {
		super();
		this.id = id;
		this.utente = utente;
		this.elementoBiblioteca = elementoBiblioteca;
		this.inizioPrestito = inizioPrestito;
		this.restituzionePrevista = restituzionePrevista;
		this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
	}


	public Prestito(Utente utente, Catalogo elementoBiblioteca, LocalDate inizioPrestito,
			LocalDate restituzionePrevista, LocalDate dataRestituzioneEffettiva) {
		super();
		this.utente = utente;
		this.elementoBiblioteca = elementoBiblioteca;
		this.inizioPrestito = inizioPrestito;
		this.restituzionePrevista = restituzionePrevista.plusDays(30);
		this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
	}
	

	public Prestito(Utente utente, Catalogo elementoBiblioteca, LocalDate inizioPrestito,
			LocalDate restituzionePrevista) {
		super();
		this.utente = utente;
		this.elementoBiblioteca = elementoBiblioteca;
		this.inizioPrestito = inizioPrestito;
		this.restituzionePrevista = restituzionePrevista.plusDays(30);
	}


	public Prestito() {
		super();
	}

	public Long getId() {
		return id;
	}

	

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public Catalogo getElementoBiblioteca() {
		return elementoBiblioteca;
	}

	public void setElementoBiblioteca(Catalogo elementoBiblioteca) {
		this.elementoBiblioteca = elementoBiblioteca;
	}

	public LocalDate getInizioPrestito() {
		return inizioPrestito;
	}

	public void setInizioPrestito(LocalDate inizioPrestito) {
		this.inizioPrestito = inizioPrestito;
	}

	public LocalDate getRestituzionePrevista() {
		return inizioPrestito.plusDays(30);
	}

	public void setRestituzionePrevista(LocalDate restituzionePrevista) {
		this.restituzionePrevista = restituzionePrevista;
	}

	public LocalDate getDataRestituzioneEffettiva() {
		return dataRestituzioneEffettiva;
	}

	public void setDataRestituzioneEffettiva(LocalDate dataRestituzioneEffettiva) {
		this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
	}

	@Override
	public String toString() {
		return "Prestito [utente=" + utente + ", elementoBiblioteca=" + elementoBiblioteca + ", inizioPrestito="
				+ inizioPrestito + ", restituzionePrevista=" + restituzionePrevista + ", dataRestituzioneEffettiva="
				+ dataRestituzioneEffettiva + "]";
	}
	
	
}
