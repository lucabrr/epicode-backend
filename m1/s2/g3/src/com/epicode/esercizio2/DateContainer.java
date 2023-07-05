package com.epicode.esercizio2;

import java.util.Random;

public class DateContainer  implements Runnable{
	
	public static int[] arr = new int[3000];

	private static int randomNum() {
		Random ran = new Random();
		 int num = ran.nextInt(11);
		 return num;
	}
	@Override
	public void run() {
		for(int i=0; i<arr.length; i++) {
			arr[i] = randomNum();
		}
		
	}

	
	
}
