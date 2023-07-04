package com.epicode.esercizio2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainProject {
static Logger log = LoggerFactory.getLogger(MainProject.class);
static Scanner sc = new Scanner(System.in);
static Random random = new Random();
	public static void main(String[] args) {
		log.info(metodo1(5).toString());
		List<Integer> arry1 = metodo1(10);
		log.info(arry1.toString());
		log.info(metodo2(arry1).toString());
		metodo3(arry1, true);
		
	}
	
	private static List<Integer> metodo1(int numero) {
		List<Integer> arr = new ArrayList<Integer>();
		for (int i= 0 ; i< numero; i++) {
			arr.add(random.nextInt(101));
		}
		return arr;
	}
	private static List<Integer> metodo2(List<Integer> array) {
		Collections.reverse(array);
		return array;
	}
	private static void metodo3(List<Integer> array, boolean x){
		if (x) {
			for(int numero : array) {
				if (numero % 2 == 0) {
					System.out.print(numero + " ");
				}
			}
		}else {
			for(int numero : array) {
			if (numero % 2 != 0) {
				System.out.print(numero + " ");
			}
		}
			
		}
	}
		
		
		
	
	

}
