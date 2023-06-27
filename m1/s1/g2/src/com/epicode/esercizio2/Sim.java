package com.epicode.esercizio2;

public class Sim {
	int numero;
	int credito;
	int[] lista;
public static void stampaDatiSim (Sim x) {
	System.out.println("numero:" + " " +x.numero);
	System.out.println("credito:" + " " +x.credito+ "€");
	for(int i= 0; i<x.lista.length; i++) {
		System.out.println(x.lista[i]);
		
	}
}	
	public Sim(int _numero) {
		this.numero = _numero;
		this.credito = 0;
		this.lista = new int[5];
	}
}
