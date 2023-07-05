package com.epicode.esercizio2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecondaPartizione extends DateContainer implements Runnable{
	public static int secondaPartizione=0;
	Logger log = LoggerFactory.getLogger(PrimaPartizione.class);
	@Override
	public void run() {
	
		int[] arrData = DateContainer.arr;
		for(int i = 1000; i<2000; i++) {
			 secondaPartizione +=  arrData[i];
			 
		}
		log.info("seconda partizione = " + secondaPartizione);
	}

}
