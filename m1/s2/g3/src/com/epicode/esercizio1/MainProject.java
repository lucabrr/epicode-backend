package com.epicode.esercizio1;

public class MainProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1 = new Thread1("*");
		Thread1 t2 = new Thread1("#");
		t1.start();
		t2.start();
	}

}
