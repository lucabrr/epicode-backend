 package com.epicode.progetto;

import java.util.Scanner;

public class MainProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElementoMultimediale[] array = new ElementoMultimediale[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("cosa vuoi creare?");
			System.out.println("img:1");
			System.out.println("video:2");
			System.out.println("audio:3");
			System.out.println("exit:0");
			System.out.print(":");
			int tipo = sc.nextInt();
			switch (tipo) {
			case 1:
				System.out.println("Titolo immagine:");
				String titoloImg = sc.next();
				Immagine img = new Immagine(titoloImg);
				array[i] = img;
				System.out.println("immagine creata e salvata");
				break;
			
			case 2:
				System.out.println("Titolo video:");
				String titoloVideo = sc.next();
				System.out.println("Durata video:");
				int durataVideo = sc.nextInt();
				Video video = new Video(titoloVideo, durataVideo);
				array[i] = video;
				System.out.println("video creato e salvato");
				break;
				
			case 3:
				System.out.println("Titolo audio:");
				String titoloAudio = sc.next();
				System.out.println("Durata audio:");
				int durataAudio = sc.nextInt();
				RegistrazioneAudio audio= new RegistrazioneAudio (titoloAudio, durataAudio);
				array[i] = audio;
				System.out.println("audio creato e salvato");
				break;
			case 0: 
				System.out.println("sei uscito dal programma");
				return;
			default:
				System.out.println("Errore riprova");
				return;
			}
			
		}
		boolean onOff = true;
		while(onOff) {
		System.out.println("cosa vuoi riprodurre?");
		for (int i = 0 ; i< array.length; i++) {
			System.out.println(array[i].titolo + " "+ ": "+ (i+1) );
		}
		System.out.println("EXIT : 0");
		System.out.println(":");
		int scelta = sc.nextInt();
		if (scelta == 0) {
			onOff= false;
			System.out.println("sei uscito dal programma.");
			return;
		}
		scelta -= 1;
		
		if(array[scelta] instanceof Video) {
			Video video = (Video)array[scelta];
			video.play();
		}else if(array[scelta] instanceof RegistrazioneAudio) {
			RegistrazioneAudio audio = (RegistrazioneAudio)array[scelta];
			audio.play();
		}else if(array[scelta] instanceof Immagine) {
			Immagine immagine = (Immagine)array[scelta];
			immagine.show();
			
		}
		}
		
		
	}

}
