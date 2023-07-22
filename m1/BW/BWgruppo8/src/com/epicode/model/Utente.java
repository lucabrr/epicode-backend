package com.epicode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Utente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private	String nome;
	@Column(nullable = false)
	private	String cognome;
	
	
	public Utente( String nome, String cognome) {
		super();
		
		this.nome = nome;
		this.cognome = cognome;
		
	}
	
	public Utente(Long id, String nome, String cognome ) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		
	}
	public Utente() {
		super();
	}
	public Long getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	@Override
	public String toString() {
		return "Utente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + "]";
	}

	 
}
