package com.epicode.esercizio2;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class MainEsercizio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		esercizio2();

	}
 static	void esercizio2(){
	 Scanner sc = new Scanner(System.in);
	 Logger log = LoggerFactory.getLogger(MainEsercizio2.class);
	 while(true) {
	 try {
	 System.out.println("inserisci litri");
	 int litro = Integer.parseInt(sc.nextLine());
	 System.out.println("inserisci km");
	 int km = Integer.parseInt(sc.nextLine());
	 double result = km / litro;
	 	
	 System.out.println( result +"km/l"); 
	 }
	 catch(ArithmeticException e) {log.error("0 non è valido per litri");}
 }}

}
