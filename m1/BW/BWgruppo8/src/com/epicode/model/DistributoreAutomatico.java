package com.epicode.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class DistributoreAutomatico extends PuntoVendita {	
	@Enumerated(EnumType.STRING)	
	private Status status;
	@Column(nullable = false)
	private String codice;
	
	

	
	


	public DistributoreAutomatico( String citta, String settore, Status status, String codice) {
		super( citta, settore);
		this.status = status;
		this.codice = codice;
	}


	public DistributoreAutomatico(Long id, String citta, String settore, Status status, String codice) {
		super(id, citta, settore);
		this.status = status;
		this.codice = codice;
	}


	public DistributoreAutomatico() {
		super();
	}


	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}


	public String getCodice() {
		return codice;
	}


	public void setCodice(String codice) {
		this.codice = codice;
	}


	@Override
	public String toString() {
		return "DistributoreAutomatico [status=" + status + ", codice=" + codice + ", toString()=" + super.toString()
				+ "]";
	}


	
	
	
}
