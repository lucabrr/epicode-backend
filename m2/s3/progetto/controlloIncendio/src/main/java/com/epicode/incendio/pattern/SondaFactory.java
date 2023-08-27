package com.epicode.incendio.pattern;

import java.util.Random;

import com.epicode.incendio.classes.Sonda;

public class SondaFactory {
	static Random random = new Random();
	private static SondaFactory instance;
	private SondaFactory(){}
	
	public static  SondaFactory getFactory(){
		if(instance == null) {
		return 	instance = new SondaFactory();
		}return instance;
	}
	
	//sonda con il fumo elevato
	public Sonda createSonda(String fumo){
		if (fumo.equalsIgnoreCase("fumo")) {
			int id = random.nextInt(100);
			int lat = random.nextInt(100);
			int lon = random.nextInt(100);
			int smokeLevel = 6;
			Sonda sonda = new Sonda(id, lat , lon, smokeLevel);
			return sonda;}
		
			else {return null;}
	}
	
	public Sonda createSonda(){
		int id = random.nextInt(100);
		int lat = random.nextInt(100);
		int lon = random.nextInt(100);
		int smokeLevel = random.nextInt(5);
		Sonda sonda = new Sonda(id, lat , lon, smokeLevel);
		return sonda;
	}
}
