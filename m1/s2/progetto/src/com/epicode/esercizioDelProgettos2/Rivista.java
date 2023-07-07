package com.epicode.esercizioDelProgettos2;

public class Rivista  extends Catalogo  {
	Periodicita periodicita;

	public Rivista(String codiceISBM, String titolo, int annoPubblicazione, int numeroPagine, Periodicita periodicita) {
		super(codiceISBM, titolo, annoPubblicazione, numeroPagine);
		this.periodicita = periodicita;
	}

	public Periodicita getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}

	@Override
	public String toString() {
		return "Rivista [periodicita=" + periodicita + ", codiceISBM=" + codiceISBM + ", titolo=" + titolo
				+ ", annoPubblicazione=" + annoPubblicazione + ", numeroPagine=" + numeroPagine + "]";
	}

	

	
	
	
	



}
