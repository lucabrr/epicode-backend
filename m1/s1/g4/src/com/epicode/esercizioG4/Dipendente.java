package com.epicode.esercizioG4;

public class Dipendente {
	static double stipendioBase = 1000;
	private String matricola ;
	private double stipendio;
	private double importoOrarioStraordinario;
	private Livello livello;
	private Dipartimento dipartimento;
	
	
	Dipendente(String _matricola, Dipartimento _dipartimento){
		this.stipendio = stipendioBase;
		this.importoOrarioStraordinario = 30;
		this.livello = Livello.OPERAIO;
		this.matricola = _matricola;
		this.dipartimento = _dipartimento;
	};
	
	 Dipendente(String matricola, int stipendio, double importoOrarioStraordinario, Livello livello,
			Dipartimento dipartimento) {
		this.matricola = matricola;
		this.stipendio = stipendio;
		this.importoOrarioStraordinario = importoOrarioStraordinario;
		this.livello = livello;
		this.dipartimento = dipartimento;
	}
	 
	 public static double calcola(Dipendente x) {
		 x.stipendio = stipendioBase;
		 return x.stipendio;
	 };
	 public static double calcola(int ore, Dipendente x) {
		 x.stipendio = stipendioBase + (ore * x.importoOrarioStraordinario);
		 return x.stipendio;
	 };




	public String stampaDatiDipendente() {
		return "Dipendente [matricola=" + matricola + ", stipendio=" + stipendio + ", importoOrarioStraordinario="
				+ importoOrarioStraordinario + ", livello=" + livello + ", dipartimento=" + dipartimento + "]";
	}

	public double getImportoOrarioStraordinario() {
		return importoOrarioStraordinario;
	}
	public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
		this.importoOrarioStraordinario = importoOrarioStraordinario;
	}
	public Dipartimento getDipartimento() {
		return dipartimento;
	}
	public void setDipartimento(Dipartimento dipartimento) {
		this.dipartimento = dipartimento;
	}
	
	public String getMatricola() {
		return matricola;
	}
	public double getStipendio() {
		return stipendio;
	}
	public Livello getLivello() {
		return livello;
	}
 	Livello promuovi(){
 		switch (livello) {
		case OPERAIO: 
			livello = Livello.IMPIEGATO;
			stipendioBase = stipendioBase * 1.2;
			
			break;
			
		case IMPIEGATO: 
			livello = Livello.QUADRO;
			stipendioBase = stipendioBase * 1.5;
			break;
		
		case QUADRO:
			livello = Livello.DIRIGENTE;
			stipendioBase = stipendioBase * 2;
		
			break;
			
		case DIRIGENTE: System.out.print("errore");
		
		break;
			
		}
 		return livello;
 		
 	}
	
}
