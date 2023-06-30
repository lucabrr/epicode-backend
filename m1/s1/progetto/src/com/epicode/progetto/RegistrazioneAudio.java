package com.epicode.progetto;

public class RegistrazioneAudio extends ElementoMultimediale implements IVolume {
	

	int volume = 5;
	private final int MAXVOLUME = 10;
	private final int MINVOLUME = 0;
	int durata;
	
	public RegistrazioneAudio(String titolo, int _durata){
		super(titolo);
		this.durata =_durata;

		
		
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
	public void play() {
		String sequenza = "";
		for (int i = 0 ; i< volume; i++) {
			sequenza += "!";
		}
		for (int i = 0; i <= durata; i++) {
			System.out.println(titolo + sequenza );
		}
	}

}
