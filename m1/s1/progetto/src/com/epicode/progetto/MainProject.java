 package com.epicode.progetto;

public class MainProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegistrazioneAudio nek = new RegistrazioneAudio("lascia che io sia",4);
		System.out.println(nek.volume);
		nek.alzaVolume();
		nek.play();
	}

}
