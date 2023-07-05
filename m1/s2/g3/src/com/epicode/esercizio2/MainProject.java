package com.epicode.esercizio2;

public class MainProject {

	public static void main(String[] args) throws InterruptedException {
		
		Thread dataThread = new Thread(new DateContainer());
		Thread primaPart = new Thread(new PrimaPartizione());
		Thread secondaPart = new Thread(new SecondaPartizione());
		Thread terzaPart = new Thread(new TerzaPartizione());
		
		dataThread.start();
		dataThread.join();
		primaPart.start();
		secondaPart.start();
		terzaPart.start();
		primaPart.join();
		secondaPart.join();
		terzaPart.join();
		int partizione1 = PrimaPartizione.primaPartizione;
		int partizione2 = SecondaPartizione.secondaPartizione;
		int partizione3 = TerzaPartizione.terzaPartizione;
		int sommaPartizioni = partizione1 + partizione2 + partizione3;
		System.out.print(sommaPartizioni);
		
	}
	public static int partizione1 = PrimaPartizione.primaPartizione;
	public static int partizione2 = SecondaPartizione.secondaPartizione;
	public static int partizione3 = TerzaPartizione.terzaPartizione;
	static int sommaPartizioni = partizione1 + partizione2 + partizione3;
}
