package com.epicode.esercizio2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TerzaPartizione extends DateContainer implements Runnable{
	public static int terzaPartizione=0;
	Logger log = LoggerFactory.getLogger(PrimaPartizione.class);
	@Override
	public void run() {
		int[] arrData = DateContainer.arr;
		for(int i = 2000; i<3000; i++) {
			 terzaPartizione +=  arrData[i];
			 
		}
		log.info("terza  partizione = " + terzaPartizione);
		
	}

}
