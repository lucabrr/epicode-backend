package com.epicode.esercizio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Thread1 extends Thread {
private String message;
public static Logger log = LoggerFactory.getLogger(Thread1.class);


	public Thread1(String message) {
		this.message = message;
	}
	@Override
	public void run() {
		for (int i =0 ; i<10; i++) {
			try {
			log.info(this.message);		
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.getMessage();
			}
		}
	}
}
