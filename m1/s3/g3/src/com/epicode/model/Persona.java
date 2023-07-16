package com.epicode.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	private String nome;
	private String cognome;
	private LocalDate dataDiNascita;
	private String email;
	
	@Enumerated(EnumType.STRING)
	private Sesso sesso;
	
	
	@OneToMany(mappedBy= "persona", cascade = CascadeType.REMOVE)
	private List<Partecipazione> listaPartecipazioni;
}
