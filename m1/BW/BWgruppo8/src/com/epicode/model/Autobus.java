package com.epicode.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Autobus extends MezziTrasporto {
	
	@Column (nullable = false)

	private String cambio;

	

	public Autobus(int posti, String immatricolazione, Stato stato, String cambio) {
		super(posti, immatricolazione, stato);
		this.cambio = cambio;
	}



	public Autobus() {
		super();
	}



	public String getCambio() {
		return cambio;
	}



	public void setCambio(String cambio) {
		this.cambio = cambio;
	}



	 @Override
	    public String toString() {
	        return "Autobus{" +
	                "id=" + id +
	                ", posti=" + posti +
	                ", immatricolazione='" + immatricolazione + '\'' +
	                ", stato=" + stato +
	                ", cambioi=" + cambio +
	                '}';
	    }



	



}
