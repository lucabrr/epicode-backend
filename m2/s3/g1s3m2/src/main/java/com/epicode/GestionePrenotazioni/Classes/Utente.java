package com.epicode.GestionePrenotazioni.Classes;

import java.time.LocalDate;
import java.util.List;

import com.epicode.GestionePrenotazioni.security.configuration.SecretCodeConverter;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Builder
public class Utente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false)
	private String username;
	@Column(nullable = false , name="nome_completo")
	private String nomeCompleto;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	@Convert(converter = SecretCodeConverter.class)
	private String secretCode;
	
	
	
	
	
	
}
