package com.epicode.esercizio2g1s3;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class JdbcConnection {
	String url = "jdbc:postgresql://localhost:5432/";
	String dbName = "dbstudenti";
	String user = "postgres";
	String pssw = "root";
	Statement st;
	
	
	JdbcConnection() throws SQLException {
		Connection connection = DriverManager.getConnection(url + dbName, user, pssw );
		 st = connection.createStatement();
		System.out.println("connessione effettuata al db");
		creaTabellaStrudenti();
		
	}
	void creaTabellaStrudenti () throws SQLException {
		String sql = "CREATE TABLE IF NOT EXISTS utenti ("
					+ "id SERIAL PRIMARY KEY,"
					+ "nome VARCHAR NOT NULL,"
					+ "cognome VARCHAR NOT NULL,"
					+ "gen gender NOT NULL,"
					+ "birthdate DATE NOT NULL,"
					+ "avg INTEGER NOT NULL,"
					+ "min_vote INTEGER NOT NULL,"
					+ "max_vote INTEGER NOT NULL"
					+ " );";
		st.executeUpdate(sql);
		System.out.println("tabella utenti creata");	
					
	}
	void inserisciStudente(Studente s) throws SQLException {
		String sql = "INSERT INTO utenti "
				+ "(nome, cognome, gen, birthdate, avg, min_vote, max_vote) "
				+ "VALUES ('" + s.getName() + "', '" + s.getSurname() + "', "
				+ "'" + s.getGender() + "', '" + s.getBirthdate() + "', "
				+ s.getAvg() + ", " + s.getMin_vote() + ", " + s.getMax_vote() + ");";
		st.executeUpdate(sql);
		System.out.println("Utente inserito");
	}
	void modificaUtente(Studente s , int id) throws SQLException {
		String sql = "UPDATE utenti SET"
				+" nome= '"+ s.getName()+ "' ,"
				+" cognome= '" + s.getSurname()+"' ,"
				+" gen= '" + s.getGender()+"' ,"
				+" birthdate = '"+ s.getBirthdate()+"' ,"
				+" avg= "+ s.getAvg()+" ,"
				+" min_vote =" +s.getMin_vote()+" ,"
				+" max_vote =" +s.getMax_vote()
				+ " WHERE id =" + id ;
		st.executeUpdate(sql);
		System.out.println("stundente con id: " +id+ " modificato");
	}
	void cancellaUtente(int i) throws SQLException {
		String sql = "DELETE FROM utenti WHERE id = " + i;
		st.executeUpdate(sql);
		System.out.println("stundente con id: " +i+ " cancellato");
	}
	void getBest() throws SQLException {
		String sql = "SELECT * FROM utenti ORDER BY avg DESC LIMIT 1 ;";
		ResultSet rs = st.executeQuery(sql);
		if(rs.next()) {
		Studente s = new Studente(rs.getString("nome"), rs.getString("cognome"),
									Gender.valueOf(rs.getString("gen")),
									rs.getDate("birthdate").toLocalDate(),
									rs.getInt("avg"), rs.getInt("min_vote"), 
									rs.getInt("max_vote"));
		System.out.println(s.toString());
		}
	}
	void getVoteRange(int min , int max) throws SQLException {
		String sql = "SELECT * FROM utenti WHERE min_vote >=" + min +" AND  max_vote <= " + max + ";";
		 ResultSet rs = st.executeQuery(sql);
		    
		    while (rs.next()) {
		        String nome = rs.getString("nome");
		        String cognome = rs.getString("cognome");
		        Gender gender = Gender.valueOf(rs.getString("gen"));
		        LocalDate birthdate = rs.getDate("birthdate").toLocalDate();
		        int avg = rs.getInt("avg");
		        int min_vote = rs.getInt("min_vote");
		        int max_vote = rs.getInt("max_vote");

		        Studente s = new Studente(nome, cognome, gender, birthdate, avg, min_vote, max_vote);
		        System.out.println(s);
		    }
	}
	
	
	
}

