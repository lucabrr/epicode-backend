package com.epicode.g1s1m2;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
String nome_pizza;
List<Topping> ingredienti = new ArrayList<Topping>();
int Calorie;
double prezzo;

public Pizza(String nome_pizza, List<Topping> ingredienti, int calorie, double prezzo) {
	super();
	this.nome_pizza = nome_pizza;
	this.ingredienti.add(new Topping("mozzarella", 100, 0.60));
	this.ingredienti.add( new Topping("pomodoro", 60, 0.60));
	if(ingredienti != null) {
		 ingredienti.forEach(ele -> {this.ingredienti.add(ele);});
	}
	Calorie = calorie;
	this.prezzo = prezzo;
}

public Pizza() {
	super();
}

public String getNome_pizza() {
	return nome_pizza;
}

public void setNome_pizza(String nome_pizza) {
	this.nome_pizza = nome_pizza;
}

public List<Topping> getIngredienti() {
	return ingredienti;
}

public void setIngredienti(List<Topping> ingredienti) {
	this.ingredienti = ingredienti;
}

public int getCalorie() {
	return Calorie;
}

public void setCalorie(int calorie) {
	Calorie = calorie;
}

public double getPrezzo() {
	return prezzo;
}

public void setPrezzo(double prezzo) {
	this.prezzo = prezzo;
}

@Override
public String toString() {
	return "Pizza [nome_pizza=" + nome_pizza + ", ingredienti=" + ingredienti + ", Calorie=" + Calorie + ", prezzo="
			+ prezzo + "]";
}
	


}
