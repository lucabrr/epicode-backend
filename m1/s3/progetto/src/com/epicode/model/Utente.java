package com.epicode.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import 
javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="utenti")
public class Utente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String cognome;
	@Column(nullable = false)
	private LocalDate dataDiNascita;
	@Column(nullable = false ,unique = true)
	private int numeroTessera;
	
	
	public Utente(String nome, String cognome, LocalDate dataDiNascita, int numeroTessera) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
		this.numeroTessera = numeroTessera;
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
	public LocalDate getDataDiNascita() {
		return dataDiNascita;
	}
	public void setDataDiNascita(LocalDate dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}
	public int getNumeroTessera() {
		return numeroTessera;
	}
	public void setNumeroTessera(int numeroTessera) {
		this.numeroTessera = numeroTessera;
	}
	@Override
	public String toString() {
		return "Utente [nome=" + nome + ", cognome=" + cognome + ", dataDiNascita=" + dataDiNascita + ", numeroTessera="
				+ numeroTessera + "]";
	}
	
}
