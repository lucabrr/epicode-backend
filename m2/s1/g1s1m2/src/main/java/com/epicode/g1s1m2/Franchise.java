package com.epicode.g1s1m2;

public class Franchise {
	String nome;
	double prezzo;
	
	public Franchise(String nome, double prezzo) {
		super();
		this.nome = nome;
		this.prezzo = prezzo;
	}

	public Franchise() {
		super();
	}

	@Override
	public String toString() {
		return "Franchise [nome=" + nome + ", prezzo=" + prezzo + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	
}
