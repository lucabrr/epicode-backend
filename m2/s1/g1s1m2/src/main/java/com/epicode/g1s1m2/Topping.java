package com.epicode.g1s1m2;

public class Topping {
String nome;
int calorie;
double prezzo;

@Override
public String toString() {
	return "Topping [nome=" + nome + ", calorie=" + calorie + ", prezzo=" + prezzo + "]";
}

public Topping(String nome, int calorie, double prezzo) {
	super();
	this.nome = nome;
	this.calorie = calorie;
	this.prezzo = prezzo;
}

public Topping() {
	super();
}





}
