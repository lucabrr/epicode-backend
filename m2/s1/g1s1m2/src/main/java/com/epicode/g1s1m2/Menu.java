package com.epicode.g1s1m2;

import java.util.List;

public class Menu {
	
	private List<Pizza> lista_pizze;
	private List<Topping> lista_topping;
	private List<Drink> lista_drink;
	private List<Franchise> lista_franchise;
	
	
	
	public List<Pizza> getLista_pizze() {
		return lista_pizze;
	}
	public void setLista_pizze(List<Pizza> lista_pizze) {
		this.lista_pizze = lista_pizze;
	}
	public List<Topping> getLista_topping() {
		return lista_topping;
	}
	public void setLista_topping(List<Topping> lista_topping) {
		this.lista_topping = lista_topping;
	}
	public List<Drink> getLista_drink() {
		return lista_drink;
	}
	public void setLista_drink(List<Drink> lista_drink) {
		this.lista_drink = lista_drink;
	}
	public List<Franchise> getLista_franchise() {
		return lista_franchise;
	}
	public void setLista_franchise(List<Franchise> lista_franchise) {
		this.lista_franchise = lista_franchise;
	}
	public Menu(List<Pizza> lista_pizze, List<Topping> lista_topping, List<Drink> lista_drink,
			List<Franchise> lista_franchise) {
		super();
		this.lista_pizze = lista_pizze;
		this.lista_topping = lista_topping;
		this.lista_drink = lista_drink;
		this.lista_franchise = lista_franchise;
	}
	public Menu() {
		super();
	}
	@Override
	public String toString() {
		return "Menu [lista_pizze=" + lista_pizze + ", lista_topping=" + lista_topping + ", lista_drink=" + lista_drink
				+ ", lista_franchise=" + lista_franchise + "]";
	}
	
	
}
