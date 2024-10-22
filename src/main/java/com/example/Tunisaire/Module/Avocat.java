package com.example.Tunisaire.Module;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table
public class Avocat {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    private String nom;
    private String prenom;
    private String addresse;
    private String referenceConvention;
    private Date dateDebConvention;
    private Date dateFinConvention;
    private String region;
	
    
    public Avocat() {
    	super();
	}


	public Avocat(Integer id, String nom, String prenom, String addresse, String referenceConvention,
			Date dateDebConvention, Date dateFinConvention, String region) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.addresse = addresse;
		this.referenceConvention = referenceConvention;
		this.dateDebConvention = dateDebConvention;
		this.dateFinConvention = dateFinConvention;
		this.region = region;
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


	public String getAddresse() {
		return addresse;
	}


	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}


	public String getReferenceConvention() {
		return referenceConvention;
	}


	public void setReferenceConvention(String referenceConvention) {
		this.referenceConvention = referenceConvention;
	}


	public Date getDateDebConvention() {
		return dateDebConvention;
	}


	public void setDateDebConvention(Date dateDebConvention) {
		this.dateDebConvention = dateDebConvention;
	}


	public Date getDateFinConvention() {
		return dateFinConvention;
	}


	public void setDateFinConvention(Date dateFinConvention) {
		this.dateFinConvention = dateFinConvention;
	}


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}
    
    
}
