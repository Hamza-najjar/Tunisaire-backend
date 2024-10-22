package com.example.Tunisaire.Module;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table
public class Fournisseur {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    private String nom;
    private String objet;
    private Date dateDebut;
    private Date dateFin;
    private Integer periodNotifcation;
    
    
	public Fournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getObjet() {
		return objet;
	}


	public void setObjet(String objet) {
		this.objet = objet;
	}


	public Date getDateDebut() {
		return dateDebut;
	}


	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}


	public Date getDateFin() {
		return dateFin;
	}


	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}


	public Integer getPeriodNotifcation() {
		return periodNotifcation;
	}


	public void setPeriodNotifcation(Integer periodNotifcation) {
		this.periodNotifcation = periodNotifcation;
	}
	
	
    
    
}
