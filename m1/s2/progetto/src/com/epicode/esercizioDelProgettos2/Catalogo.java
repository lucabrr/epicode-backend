package com.epicode.esercizioDelProgettos2;

public abstract class Catalogo {
	String codiceISBM;
	String titolo;
	int annoPubblicazione;
	int numeroPagine;
	
	public Catalogo(String codiceISBM, String titolo, int annoPubblicazione, int numeroPagine) {
		
		this.codiceISBM = codiceISBM;
		this.titolo = titolo;
		this.annoPubblicazione = annoPubblicazione;
		this.numeroPagine = numeroPagine;
	}

	public String getCodiceISBM() {
		return codiceISBM;
	}

	public void setCodiceISBM(String codiceISBM) {
		this.codiceISBM = codiceISBM;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getAnnoPubblicazione() {
		return annoPubblicazione;
	}

	public void setAnnoPubblicazione(int annoPubblicazione) {
		this.annoPubblicazione = annoPubblicazione;
	}

	public int getNumeroPagine() {
		return numeroPagine;
	}

	public void setNumeroPagine(int numeroPagine) {
		this.numeroPagine = numeroPagine;
	}

	@Override
	public String toString() {
		return "Catalogo [codiceISBM=" + codiceISBM + ", titolo=" + titolo + ", annoPubblicazione=" + annoPubblicazione
				+ ", numeroPagine=" + numeroPagine + "]";
	}
	
}
