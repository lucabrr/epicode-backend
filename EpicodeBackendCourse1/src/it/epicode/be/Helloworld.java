package it.epicode.be;
import java.util.Scanner;
public class Helloworld {

public static void main (String[] args){
		
		System.out.println("This is my first Epicode Java Project!");
		
		System.out.println( moltiplica(25,5));
		System.out.println( concat("ci","ao"));
		System.out.println( perimetroRet(13.7 , 10.4));
		System.out.println( pariDispari(10));
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci il tuo nome: ");
		String nome = sc.nextLine();
		System.out.print("Inserisci il tuo cognome: ");
		String cognome = sc.nextLine();
		System.out.print("Inserisci il tuo luogo di nascita: ");
		String luogoDiNascita = sc.nextLine();	
		System.out.println("Ciao"+ " "+ nome + " " + cognome +" " + "sei nato a " + luogoDiNascita);
		
		
		
		}

		public static int moltiplica(int x, int y){
			int result = x * y;
			return result;			
		}
		public static String concat(String x, String y) {
			String result = x + y;
			return result;
		}
		public static double perimetroRet(double x, double y) {
			double result = (x + y) * 2;
			return result;
		}
		public static int pariDispari(int x) {
			int rest = x % 2;
			if (rest == 0) {
				return 0;
			}else {
				return 1;
			}
		
		
		}
}
		




