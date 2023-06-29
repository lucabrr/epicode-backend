package com.epicode.esercizioG4;

public class Main_Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dipendente ciccio = new Dipendente("fsdjgsa", Dipartimento.VENDITE);
		Dipendente lillo = new Dipendente("trenboa234", Dipartimento.AMMINISTRAZIONE);
		System.out.println(ciccio.stampaDatiDipendente());
		System.out.println(lillo.stampaDatiDipendente());
		
		System.out.println(lillo.promuovi());
		System.out.println(lillo.stampaDatiDipendente());
		System.out.println(Dipendente.calcola(lillo));
		System.out.println(Dipendente.calcola(4,lillo));
		System.out.println(lillo.promuovi());
		System.out.println(Dipendente.calcola(lillo));
		
		
		
	}

}
