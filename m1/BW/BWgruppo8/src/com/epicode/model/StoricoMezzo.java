package com.epicode.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class StoricoMezzo {
	@Id
	@GeneratedValue
	protected Long id;
	
	@Column (nullable = false)
	@Enumerated(EnumType.STRING)
	private Stato status;
	
    @ManyToOne
 
    protected MezziTrasporto mezzoAssociato;
    
    @Column (nullable = false)
    private LocalDate dataInizio;
    
    
    @Column (nullable = false)
    private LocalDate dataFine;

	public StoricoMezzo(Stato status, MezziTrasporto mezzoAssociato, LocalDate dataInizio, LocalDate dataFine) {
		super();
		this.status = status;
		this.mezzoAssociato = mezzoAssociato;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
	}


	public StoricoMezzo(Long id, Stato status, MezziTrasporto mezzoAssociato, LocalDate dataInizio,
			LocalDate dataFine) {
		super();
		this.id = id;
		this.status = status;
		this.mezzoAssociato = mezzoAssociato;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
	}


	public StoricoMezzo() {
		super();
	}


	public Stato getStatus() {
		return status;
	}


	public void setStatus(Stato status) {
		this.status = status;
	}


	public MezziTrasporto getMezzoAssociato() {
		return mezzoAssociato;
	}


	public void setMezzoAssociato(MezziTrasporto mezzoAssociato) {
		this.mezzoAssociato = mezzoAssociato;
	}


	public LocalDate getDataInizio() {
		return dataInizio;
	}


	public void setDataInizio(LocalDate dataInizio) {
		this.dataInizio = dataInizio;
	}


	public LocalDate getDataFine() {
		return dataFine;
	}


	public void setDataFine(LocalDate dataFine) {
		this.dataFine = dataFine;
	}


	public Long getId() {
		return id;
	}
    

    @Override
    public String toString() {
        return "StoricoMezzo{" +
                "id=" + id +
                ", status=" + status +
                ", mezzoAssociato=" + mezzoAssociato +
                ", dataInizio=" + dataInizio +
                ", dataFine=" + dataFine +
                '}';
    }
    
    

}
