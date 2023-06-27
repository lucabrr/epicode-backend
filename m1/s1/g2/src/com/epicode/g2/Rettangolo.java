package com.epicode.g2;

public class Rettangolo {
int altezza;
int larghezza;
public static int calcolaArea(Rettangolo x) {
	return x.altezza * x.larghezza;
} 
public static int calcolaPerimetro(Rettangolo x) {
	return (x.altezza + x.larghezza) * 2;
} 
public static void stampaRettangolo(Rettangolo x) {
	System.out.println(calcolaArea(x));
	System.out.println(calcolaPerimetro(x));
	
} 
public static void stampaDueRettangoli(Rettangolo x, Rettangolo y) {
	System.out.println("primo rettangolo:");
	System.out.println("area"+ " " +calcolaArea(x));
	System.out.println("perimetro"+ " " +calcolaPerimetro(x));
	System.out.println("secondo rettangolo:");
	System.out.println("area"+ " " +calcolaArea(y));
	System.out.println("perimetro"+ " " +calcolaPerimetro(y));
	int sommaPerimetro = Rettangolo.calcolaPerimetro(x) + Rettangolo.calcolaPerimetro(y);
	int sommaArea = Rettangolo.calcolaArea(x) + Rettangolo.calcolaArea(y);
	System.out.println("somma perimetro dei 2 ret:" +" "+ sommaPerimetro);
	System.out.println("somma area dei 2 ret:" +" "+ sommaArea);
	
} 
	
public Rettangolo(int _altezza, int _larghezza){
		this.altezza = _altezza;
		this.larghezza = _larghezza;
	}
}
