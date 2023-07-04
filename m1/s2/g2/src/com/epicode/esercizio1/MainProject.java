package com.epicode.esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MainProject {
private static	Logger log = LoggerFactory.getLogger(MainProject.class);
private static Scanner sc = new Scanner(System.in);
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		esercizio1();
	}
	private static void esercizio1() {
		System.out.println("quanti elementi vuoi inserire?");
		int nElementi = Integer.parseInt(sc.nextLine());
		Set<String> contenitoreParole = new HashSet<String>();
		Set<String> contenitoreParoleDoppie = new HashSet<String>();
		for (int i=0; i< nElementi ;i++) {
			System.out.println("inserisci la parola");
			String parola = sc.nextLine();
			if(contenitoreParole.add(parola)){}
			else {contenitoreParoleDoppie.add(parola);}
		
		}
		for (String parola : contenitoreParole) {
			log.info("parole distinte :" + parola);
		}
		for (String parola : contenitoreParoleDoppie) {
			log.info("parole doppie " + parola);
		}
		log.info("numero parole distinte : "+ contenitoreParole.size());
		
		
	}
	

}
