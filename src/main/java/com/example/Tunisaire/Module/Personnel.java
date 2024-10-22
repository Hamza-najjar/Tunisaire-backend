package com.example.Tunisaire.Module;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table
public class Personnel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    private String nom;
    private String prenom;
    private String cin;
    private String matricule;
    private String numAffaire;
    private Date dateConvocation;
    private String addresseTribunal;
    private String ficheCarriere;
    private String contratTravail;
    private String decisionsPromotions;
    private String objetAffaire;
    private String avocatCharge;
    private String issueAffaire;
    private String degrejuridiction;
    private Date dateaudience;
    private Date dateJugement;
    private Date dateRcuperation;
    private Date dateCloture;
    
    
    
	public Personnel() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Personnel(Integer id, String nom, String prenom, String cin, String matricule, String numAffaire,
			Date dateConvocation, String addresseTribunal, String ficheCarriere, String contratTravail,
			String decisionsPromotions, String objetAffaire, String avocatCharge, String issueAffaire,
			String degrejuridiction, Date dateaudience, Date dateJugement, Date dateRcuperation, Date dateCloture) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
		this.matricule = matricule;
		this.numAffaire = numAffaire;
		this.dateConvocation = dateConvocation;
		this.addresseTribunal = addresseTribunal;
		this.ficheCarriere = ficheCarriere;
		this.contratTravail = contratTravail;
		this.decisionsPromotions = decisionsPromotions;
		this.objetAffaire = objetAffaire;
		this.avocatCharge = avocatCharge;
		this.issueAffaire = issueAffaire;
		this.degrejuridiction = degrejuridiction;
		this.dateaudience = dateaudience;
		this.dateJugement = dateJugement;
		this.dateRcuperation = dateRcuperation;
		this.dateCloture = dateCloture;
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



	public String getCin() {
		return cin;
	}



	public void setCin(String cin) {
		this.cin = cin;
	}



	public String getMatricule() {
		return matricule;
	}



	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}



	public String getNumAffaire() {
		return numAffaire;
	}



	public void setNumAffaire(String numAffaire) {
		this.numAffaire = numAffaire;
	}



	public Date getDateConvocation() {
		return dateConvocation;
	}



	public void setDateConvocation(Date dateConvocation) {
		this.dateConvocation = dateConvocation;
	}



	public String getAddresseTribunal() {
		return addresseTribunal;
	}



	public void setAddresseTribunal(String addresseTribunal) {
		this.addresseTribunal = addresseTribunal;
	}



	public String getFicheCarriere() {
		return ficheCarriere;
	}



	public void setFicheCarriere(String ficheCarriere) {
		this.ficheCarriere = ficheCarriere;
	}



	public String getContratTravail() {
		return contratTravail;
	}



	public void setContratTravail(String contratTravail) {
		this.contratTravail = contratTravail;
	}



	public String getDecisionsPromotions() {
		return decisionsPromotions;
	}



	public void setDecisionsPromotions(String decisionsPromotions) {
		this.decisionsPromotions = decisionsPromotions;
	}



	public String getObjetAffaire() {
		return objetAffaire;
	}



	public void setObjetAffaire(String objetAffaire) {
		this.objetAffaire = objetAffaire;
	}



	public String getAvocatCharge() {
		return avocatCharge;
	}



	public void setAvocatCharge(String avocatCharge) {
		this.avocatCharge = avocatCharge;
	}



	public String getIssueAffaire() {
		return issueAffaire;
	}



	public void setIssueAffaire(String issueAffaire) {
		this.issueAffaire = issueAffaire;
	}



	public String getDegrejuridiction() {
		return degrejuridiction;
	}



	public void setDegrejuridiction(String degrejuridiction) {
		this.degrejuridiction = degrejuridiction;
	}



	public Date getDateaudience() {
		return dateaudience;
	}



	public void setDateaudience(Date dateaudience) {
		this.dateaudience = dateaudience;
	}



	public Date getDateJugement() {
		return dateJugement;
	}



	public void setDateJugement(Date dateJugement) {
		this.dateJugement = dateJugement;
	}



	public Date getDateRcuperation() {
		return dateRcuperation;
	}



	public void setDateRcuperation(Date dateRcuperation) {
		this.dateRcuperation = dateRcuperation;
	}



	public Date getDateCloture() {
		return dateCloture;
	}



	public void setDateCloture(Date dateCloture) {
		this.dateCloture = dateCloture;
	}
    
    
    
    

}
