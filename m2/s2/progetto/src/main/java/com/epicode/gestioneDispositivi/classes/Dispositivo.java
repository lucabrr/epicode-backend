package com.epicode.gestioneDispositivi.classes;

import java.util.ArrayList;
import java.util.List;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Dispositivo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private ETipo tipo;
	@Column(nullable = false)
	private String modello;
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private EStatus status;
	@Column(nullable = false)
	@ManyToMany(fetch = FetchType.EAGER)
	private List<Dipendente> dipendenti = new ArrayList<Dipendente>() ;
}
