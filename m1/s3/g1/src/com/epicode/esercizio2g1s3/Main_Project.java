package com.epicode.esercizio2g1s3;

import java.sql.SQLException;
import java.time.LocalDate;

public class Main_Project {

	public static void main(String[] args) {
		Studente s1 = new Studente("Cicco", "Caputo", Gender.M, LocalDate.of(2000, 4, 10), 6, 5, 8);
		Studente s2 = new Studente("Alessia", "Caputo", Gender.F, LocalDate.of(1995, 7, 13), 8, 5, 9);
		Studente s3 = new Studente("Franco", "Boldi", Gender.M, LocalDate.of(1977, 11, 16), 4, 2, 6);
		Studente s4 = new Studente("Alessia", "Taibi", Gender.F, LocalDate.of(1995, 7, 13), 8, 5, 9);
		try {
			JdbcConnection db = new JdbcConnection();
			
			//db.modificaUtente(s4, 1);
			//db.cancellaUtente(3);
			db.getBest();
			db.getVoteRange(2, 10);
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
