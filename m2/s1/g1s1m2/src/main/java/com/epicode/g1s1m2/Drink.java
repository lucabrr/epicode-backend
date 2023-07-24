package com.epicode.g1s1m2;

public class Drink {
	String nome;
	int calorie;
	double prezzo;
	double litri;
	
	
	public Drink(String nome, int calorie, double prezzo, double litri) {
		super();
		this.nome = nome;
		this.calorie = calorie;
		this.prezzo = prezzo;
		this.litri = litri;
	}


	public Drink() {
		super();
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getCalorie() {
		return calorie;
	}


	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}


	public double getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}


	public double getLitri() {
		return litri;
	}


	public void setLitri(double litri) {
		this.litri = litri;
	}


	@Override
	public String toString() {
		return "Drink [nome=" + nome + ", calorie=" + calorie + ", prezzo=" + prezzo + ", litri=" + litri + "]";
	}
	
	
	
}
