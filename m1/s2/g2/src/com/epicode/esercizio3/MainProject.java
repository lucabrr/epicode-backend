package com.epicode.esercizio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainProject {
	static private Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Map<String, String> arr = creaContatti();
		System.out.println(arr.toString());
		cancellaContatto("luca", arr);
		System.out.println(arr.toString());
		trovaContatto("fra", arr);
		

	}
	private static Map<String, String> creaContatti() {
		Map<String, String> arr = new HashMap<String, String>();
		for(int i = 0 ; i< 3; i++) {
			System.out.println("inserisci nome");
			String nome = sc.nextLine();
			System.out.println("inserisci numero");
			String numero = sc.nextLine();
			arr.put(nome, numero);
		}
		return arr;
	}
	private static void cancellaContatto(String contatto, Map<String, String> arr ) {
		arr.remove(contatto);
	}
	private static void trovaContatto(String contatto, Map<String, String> arr ) {
		System.out.println( arr.get(contatto));
	}
	
	
	
}
