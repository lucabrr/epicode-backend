package com.epicode.progetto;

public class Video extends ElementoMultimediale implements IVolume, ILuminosita {
	static int volume = 5;
	static int luminosita = 5;
	int durata;

	public Video(String _titolo, int _durata) {
		super(_titolo);
		this.durata= _durata;
		
	}
	public void play() {
		String sequenzaPuntoEsclamativo = "";
		for (int i = 0 ; i< volume; i++) {
			sequenzaPuntoEsclamativo += "!";
		}
		String asterisco ="";
		for (int i = 0 ; i< luminosita; i++) {
			asterisco += "*";
		}
		for (int i = 0; i <= durata; i++) {
			System.out.println(titolo + sequenzaPuntoEsclamativo +" " + asterisco );
		}
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
	@Override
	public void alzaVolume() {
		if(volume < MAXVOLUME) {
			volume++;
			System.out.println("volume: " + volume );
			
			} else {System.out.println("il volume è al massimo");}
	}
	@Override
	public void abbassaVolume() {
		if (volume > MINVOLUME) {
			volume-- ;
			System.out.println("volume: " + volume );
		}else{System.out.println("il volume è al minimo");}
		
	}
}
