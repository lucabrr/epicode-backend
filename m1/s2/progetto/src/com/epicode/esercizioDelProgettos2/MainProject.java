package com.epicode.esercizioDelProgettos2;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class MainProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro l1= new Libro("abc123", "Heidi", 2020, 200, "Achille lauro", "Horror");
		Libro l2= new Libro("tre123", "Tarkov", 2018, 300, "Nikita", "Guerra");
		Libro l3= new Libro("ert123", "SeaOfThives", 2023, 500, "PeterPan", "Avventura");
		Rivista r1 = new Rivista("riv123", "MotoriAndFiga", 2019, 40, Periodicita.MENSILE);
		Rivista r2 = new Rivista("riv133", "Chi", 2010, 20, Periodicita.SETTIMANALE);
		Rivista r3 = new Rivista("riv145", "SportPiu", 2019, 100, Periodicita.SEMESTRALE);
		
		Set<Catalogo> arrCatalogo = new HashSet<Catalogo>();
		
		
		
		arrCatalogo.add(l1);
		arrCatalogo.add(l2);
		arrCatalogo.add(l3);
		arrCatalogo.add(r1);
		arrCatalogo.add(r2);
		arrCatalogo.add(r3);
		
		
		
		for(Catalogo ogg : arrCatalogo ) {
			System.out.println(ogg.toString());
		}
		
		
	}

}
