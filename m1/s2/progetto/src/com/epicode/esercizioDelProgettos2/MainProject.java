package com.epicode.esercizioDelProgettos2;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;


import java.util.stream.Collectors;


import org.apache.commons.io.FileUtils;

public class MainProject {
static	File file = new File("doc/file.txt");
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro l1= new Libro("abc123", "Heidi", 2010, 200, "Achille lauro", "Horror");
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
		
		
		
	//	for(Catalogo ogg : arrCatalogo ) {
	//		System.out.println(ogg.toString());
	//	}
		rimuoviElemento("abc123", arrCatalogo);
		
		aggiungiElemento(l1, arrCatalogo);
		ricerca(arrCatalogo, 2010);
		ricerca(arrCatalogo, "Nikita");
		ricerca(arrCatalogo, "peterpan");
		convertiEsalva(arrCatalogo);
		
	}
	
	
	
	static void aggiungiElemento (Catalogo oggetto, Set<Catalogo> contenitore) {
			if(contenitore.add(oggetto)) {
				System.out.println("elemento aggiunto");
			} else {System.out.println("errore");}
	}
	static void rimuoviElemento (String Isbm, Set<Catalogo> contenitore) {
		if(contenitore.removeIf(x -> x.getCodiceISBM().equals(Isbm))) {
			System.out.println("elemento con codice: " + Isbm +" eliminato");
		} else {System.out.println("elemento con codice:" + Isbm +" non trovato");}
		
	}
	static void ricerca(Set<Catalogo> contenitore, int anno) {
		Set<Catalogo> elementiFiltrati = contenitore.stream()
											.filter(x-> x.getAnnoPubblicazione() == anno)
											.collect(Collectors.toSet());
		System.out.println("elementi trovati con anno: "+anno);
		System.out.println("------------------");
		for(Catalogo elemento : elementiFiltrati) {
			System.out.println(elemento);
		}
		System.out.println("------------------");
	}
	static void ricerca(Set<Catalogo> contenitore, String autore) {
		Set<Catalogo> elementiFiltrati = contenitore.stream()
													.filter(x -> x instanceof Libro)
													.filter(x -> ((Libro)x).getAutore().equalsIgnoreCase(autore))
													.collect(Collectors.toSet());
				System.out.println("elementi trovati con autore: "+ autore);
				System.out.println("//////////////");
				for(Catalogo elemento : elementiFiltrati) {
				System.out.println(elemento);
				}
				System.out.println("//////////////");
	}
	static void scriviFile(String catalogo) throws IOException {
		
			FileUtils.writeStringToFile(file,catalogo,"UTF-8" );
		
	}
	static void convertiEsalva(Set<Catalogo> catalogo) {
		String elementoDaSalvare = "";
		for(Catalogo elemento : catalogo) {
			elementoDaSalvare += (elemento.toString()) + "#";
		}
		try {
			scriviFile(elementoDaSalvare);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
