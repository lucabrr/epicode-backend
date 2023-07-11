package com.epicode.esercizio2g1s3;

import java.time.LocalDate;

public class Studente {
	private int id;
	private String name;
	private String surname;
	private Gender gender;
	private LocalDate birthdate;
	private int avg;
	private int min_vote;
	private int max_vote;
	
	

	public Studente(String name, String surname, Gender gender, LocalDate birthdate, int avg, int min_vote,
			int max_vote) {
		super();
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.birthdate = birthdate;
		this.avg = avg;
		this.min_vote = min_vote;
		this.max_vote = max_vote;
	}

	@Override
	public String toString() {
		return "Studente [name=" + name + ", surname=" + surname + ", gender=" + gender + ", birthdate=" + birthdate
				+ ", avg=" + avg + ", min_vote=" + min_vote + ", max_vote=" + max_vote + "]";
	}

	public int getId() {
		return id;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public int getAvg() {
		return avg;
	}

	public void setAvg(int avg) {
		this.avg = avg;
	}

	public int getMin_vote() {
		return min_vote;
	}

	public void setMin_vote(int min_vote) {
		this.min_vote = min_vote;
	}

	public int getMax_vote() {
		return max_vote;
	}

	public void setMax_vote(int max_vote) {
		this.max_vote = max_vote;
	}
	

	
}
