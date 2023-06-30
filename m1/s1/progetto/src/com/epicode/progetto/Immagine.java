package com.epicode.progetto;

public class Immagine extends ElementoMultimediale implements ILuminosita {
	
	int luminosita = 5;
	
	public Immagine(String _titolo) {
		super(_titolo);
		
	}
	void show() {
		String sequenzaAsterischi = "";
		for(int i = 0 ; i < luminosita ; i++) {
			sequenzaAsterischi += "*";
		} 
		System.out.println(this.titolo +" "+ sequenzaAsterischi  );
	}


	@Override
	public void alzaLuminosita() {
		if(luminosita < MAXLUMINOSITA) {
			luminosita++;
			System.out.println("luminosità: " + luminosita );
			
			} else {System.out.println("la luminosità è al massimo");}
		
	}

	@Override
	public void abbassaLuminosita() {
		if(luminosita > MINLUMINOSITA) {
			luminosita--;
			System.out.println("luminosità: " + luminosita );
			
			} else {System.out.println("la luminosità è al minimo");}
		
	}

}
