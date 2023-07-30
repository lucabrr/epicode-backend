package com.epicode.GodfathersPizza.classes;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity

public class Ordine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private Integer numeroOrdine;
	@Enumerated(EnumType.STRING)
	private StatoOrdine statoOrdine;
	private Integer numeroCoperti;
	private LocalTime oraAcquisizioneOrdine;
	private Double costoCoperto;
	private Tavolo tavolo;
	
	private Map<FoodItem, Integer> ordinato = new HashMap<FoodItem, Integer>();
	
	
	
	public void addMeunuItem(FoodItem item) {
		if(!ordinato.containsKey(item)) {
			ordinato.put(item, 1);
		} else {
			ordinato.put(item, ordinato.get(item)+1);
		}
		System.out.println("Prodotto aggiunto al tuo ordine!!");
	}
	
	public void removeMeunuItem(FoodItem item) {
		if(ordinato.containsKey(item)) {
			if(ordinato.get(item) == 1) {
				ordinato.remove(item);
			} else {
				ordinato.put(item, ordinato.get(item)-1);
			}
		} 
		System.out.println("Prodotto rimosso dal tuo ordine!!");
	}
	
	public void getTotale() {
		Double totale = 0.0;
		for (FoodItem item : ordinato.keySet()) {
			totale += item.getPrice() * ordinato.get(item);
		}
		
		totale += (costoCoperto * numeroCoperti) ;
		
		System.out.println("Il totale del tuo ordine è " + totale);
	}

	public Ordine(Integer numeroOrdine, StatoOrdine statoOrdine, Integer numeroCoperti, LocalTime oraAcquisizioneOrdine,
			Double costoCoperto, Tavolo tavolo, Map<FoodItem, Integer> ordinato) {
		super();
		this.numeroOrdine = numeroOrdine;
		this.statoOrdine = statoOrdine;
		this.numeroCoperti = numeroCoperti;
		this.oraAcquisizioneOrdine = oraAcquisizioneOrdine;
		this.costoCoperto = costoCoperto;
		this.tavolo = tavolo;
		this.ordinato = ordinato;
	}

}
