package com.epicode.esercizio1;

public class ClasseEs1 {

	public static boolean stringaPariDispari(String x) {
		int lunghezza = x.length();
		int resto = lunghezza % 2;
		if(resto == 0) {
			return true;
		}else {return false;}
	};
	
	public static boolean annoBisestile(int anno) {
		int resto = anno % 4 ;
		if(resto == 0){return true;}else {return false;}
		};
}
