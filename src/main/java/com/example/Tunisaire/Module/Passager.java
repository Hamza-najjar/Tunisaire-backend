package com.example.Tunisaire.Module;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table
public class Passager {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    private String nom;
    private String prenom;
    private Integer numReclamationm;
    private Integer numVol;
    private Date dateVol;
    private Date dateReceptionReclamation;
    private String typeReclamation;
    private Double montantReclameAvant;
    private Double montantReclameApres;
    private Date dateCloture;
    private String remarques;
    
    
	public Passager() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Passager(Integer id, String nom, String prenom, Integer numReclamationm, Integer numVol, Date dateVol,
			Date dateReceptionReclamation, String typeReclamation, Double montantReclameAvant,
			Double montantReclameApres, Date dateCloture, String remarques) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.numReclamationm = numReclamationm;
		this.numVol = numVol;
		this.dateVol = dateVol;
		this.dateReceptionReclamation = dateReceptionReclamation;
		this.typeReclamation = typeReclamation;
		this.montantReclameAvant = montantReclameAvant;
		this.montantReclameApres = montantReclameApres;
		this.dateCloture = dateCloture;
		this.remarques = remarques;
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


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public Integer getNumReclamationm() {
		return numReclamationm;
	}


	public void setNumReclamationm(Integer numReclamationm) {
		this.numReclamationm = numReclamationm;
	}


	public Integer getNumVol() {
		return numVol;
	}


	public void setNumVol(Integer numVol) {
		this.numVol = numVol;
	}


	public Date getDateVol() {
		return dateVol;
	}


	public void setDateVol(Date dateVol) {
		this.dateVol = dateVol;
	}


	public Date getDateReceptionReclamation() {
		return dateReceptionReclamation;
	}


	public void setDateReceptionReclamation(Date dateReceptionReclamation) {
		this.dateReceptionReclamation = dateReceptionReclamation;
	}


	public String getTypeReclamation() {
		return typeReclamation;
	}


	public void setTypeReclamation(String typeReclamation) {
		this.typeReclamation = typeReclamation;
	}


	public Double getMontantReclameAvant() {
		return montantReclameAvant;
	}


	public void setMontantReclameAvant(Double montantReclameAvant) {
		this.montantReclameAvant = montantReclameAvant;
	}


	public Double getMontantReclameApres() {
		return montantReclameApres;
	}


	public void setMontantReclameApres(Double montantReclameApres) {
		this.montantReclameApres = montantReclameApres;
	}


	public Date getDateCloture() {
		return dateCloture;
	}


	public void setDateCloture(Date dateCloture) {
		this.dateCloture = dateCloture;
	}


	public String getRemarques() {
		return remarques;
	}


	public void setRemarques(String remarques) {
		this.remarques = remarques;
	}
    
    
    

}
