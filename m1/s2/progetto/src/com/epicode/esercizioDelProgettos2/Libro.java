package com.epicode.esercizioDelProgettos2;

public class Libro extends Catalogo{
	String Autore;
	String Genere;
	
	public Libro(String codiceISBM, String titolo, int annoPubblicazione, int numeroPagine, String autore,
			String genere) {
		super(codiceISBM, titolo, annoPubblicazione, numeroPagine);
		Autore = autore;
		Genere = genere;
	}

	public String getAutore() {
		return Autore;
	}

	public void setAutore(String autore) {
		Autore = autore;
	}

	public String getGenere() {
		return Genere;
	}

	public void setGenere(String genere) {
		Genere = genere;
	}

	@Override
	public String toString() {
		return "Libro [Autore=" + Autore + ", Genere=" + Genere + ", codiceISBM=" + codiceISBM + ", titolo=" + titolo
				+ ", annoPubblicazione=" + annoPubblicazione + ", numeroPagine=" + numeroPagine + "]";
	}

	

	
	
	
	
	
	

}
	
