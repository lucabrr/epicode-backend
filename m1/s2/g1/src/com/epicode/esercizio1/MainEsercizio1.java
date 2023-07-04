package com.epicode.esercizio1;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainEsercizio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		esercizio1();	
		};
		
	static	Logger log = LoggerFactory.getLogger(MainEsercizio1.class);
		
		
		
		
		static int randomNum() {
			int random = (int) (Math.floor(Math.random() * 10)+1);
			return random;
		}
		static void esercizio1() {
			Scanner sc = new Scanner(System.in);
			int[] array = new int[5];
			for (int i = 0 ; i< array.length; i++) {
				array[i] = randomNum();
			}
			for (int i = 0 ; i< array.length; i++) {
			System.out.print(array[i] +""+",");
			}
			while(true) {
				try {
				System.out.println("in che posizione vuoi inserire un numero casuale?");
				int posizione = Integer.parseInt(sc.nextLine());
				if (posizione == 0) {
					System.out.println("fine");
					return;
				}
				
				array[posizione -1] = randomNum();
				
				for (int i = 0 ; i< array.length; i++) {
					System.out.print(array[i]+""+",");
					}
			}
			catch(NumberFormatException e) {log.error("devi inserire un numero");}
			catch(ArrayIndexOutOfBoundsException e) {log.error("seleziona una posizione tra 1 e 5");}
			
				}
			}
			
}


