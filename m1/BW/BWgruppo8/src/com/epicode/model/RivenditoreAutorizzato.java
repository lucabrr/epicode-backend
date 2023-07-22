package com.epicode.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class RivenditoreAutorizzato  extends PuntoVendita{
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String codiceRivenditore;
	
	
	public RivenditoreAutorizzato(Long id, String citta, String settore,
			 String nome, String codiceRivenditore) {
		super(id, citta, settore);
		this.nome = nome;
		this.codiceRivenditore = codiceRivenditore;
	}


	public RivenditoreAutorizzato( String citta, String settore,
			 String nome, String codiceRivenditore) {
		super( citta, settore);
		this.nome = nome;
		this.codiceRivenditore = codiceRivenditore;
	}
	
	public RivenditoreAutorizzato() {
		super();
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCodiceRivenditore() {
		return codiceRivenditore;
	}


	public void setCodiceRivenditore(String codiceRivenditore) {
		this.codiceRivenditore = codiceRivenditore;
	}


	@Override
	public String toString() {
		return "RivenditoreAutorizzato [nome=" + nome + ", codiceRivenditore=" + codiceRivenditore + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
