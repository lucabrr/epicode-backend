package com.epicode.esercizio2;
import java.util.Scanner;


public class Main_Project {
static Scanner sc = new Scanner(System.in);
static String stringa = " ";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stampaLettere(2));
		contoAllaRovescia(10);
		stampaQ();
		
		
	}
	static String stampaLettere(int numero) {
		switch (numero) {
		case 0 : return "zero";
			
		case 1 : return "uno";
		
		case 2 : return "due";
		
		case 3 : return "tre";
		default:
			return "errore";
			
		}
	};
	static void contoAllaRovescia(int numero) {
		for (int i = numero; i >= 0; i--) {
			System.out.println(i);
		}
	};
	
	static void stampaQ() {
		while (!stringa.equals(":q")) {
			System.out.println("inserisci stringa:");
			stringa = sc.nextLine();
			if(stringa.equals(":q")){
				System.out.println("hai inserito la stringa corretta");
				break;
			}
			String[] stringaSpezzata = stringa.split("");
			for(int i = 0; i < stringaSpezzata.length; i++) {
				System.out.print(stringaSpezzata[i]+",");
			}
			
		}
	};
	
}
	
	
		
		
	
		
		
