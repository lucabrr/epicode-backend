package com.epicode.esercizio2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrimaPartizione extends DateContainer implements Runnable {
	public static int primaPartizione=0;
	Logger log = LoggerFactory.getLogger(PrimaPartizione.class);
	@Override
	public void run() {
		int[] arrData = DateContainer.arr;
		for(int i = 0; i<1000; i++) {
			 primaPartizione +=  arrData[i];
			
		}
		log.info("prima partizione = " + primaPartizione);
		
		
	}

}
