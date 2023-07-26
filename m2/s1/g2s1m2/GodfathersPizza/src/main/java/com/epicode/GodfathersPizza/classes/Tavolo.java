package com.epicode.GodfathersPizza.classes;


public class Tavolo {

	int numero;
	int coperto; 
	Stato stato;
	
	public Tavolo(int numero, int coperto, Stato stato) {
		super();
		this.numero = numero;
		this.coperto = coperto;
		this.stato = stato;
	}

	@Override
	public String toString() {
		return "Tavolo [numero=" + numero + ", coperto=" + coperto + ", stato=" + stato + "]";
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCoperto() {
		return coperto;
	}

	public void setCoperto(int coperto) {
		this.coperto = coperto;
	}

	public Stato getStato() {
		return stato;
	}

	public void setStato(Stato stato) {
		this.stato = stato;
	}
	
	
	
}

