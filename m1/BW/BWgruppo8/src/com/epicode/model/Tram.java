package com.epicode.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Tram extends MezziTrasporto{
	@Column (nullable = false)
	private int vagoni;
	




	public Tram(int posti, String immatricolazione, Stato stato, int vagoni) {
		super(posti, immatricolazione, stato);
		this.vagoni = vagoni;
	}




	public Tram() {
	        
	    }




	public int getVagoni() {
		return vagoni;
	}




	public void setVagoni(int vagoni) {
		this.vagoni = vagoni;
	}



	 @Override
	    public String toString() {
	        return "Tram{" +
	                "id=" + id +
	                ", posti=" + posti +
	                ", immatricolazione='" + immatricolazione + '\'' +
	                ", stato=" + stato +
	                ", vagoni=" + vagoni +
	                '}';
	    }

	
	 
}
	
	

