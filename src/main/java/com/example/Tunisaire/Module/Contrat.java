package com.example.Tunisaire.Module;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table
public class Contrat {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    private String objet;
    private String reference;
    private Date date_Deb;
    private Date date_Fin;
    
    
	public Contrat() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Contrat(Integer id, String objet, String reference, Date date_Deb, Date date_Fin) {
		super();
		this.id = id;
		this.objet = objet;
		this.reference = reference;
		this.date_Deb = date_Deb;
		this.date_Fin = date_Fin;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getObjet() {
		return objet;
	}


	public void setObjet(String objet) {
		this.objet = objet;
	}


	public String getReference() {
		return reference;
	}


	public void setReference(String reference) {
		this.reference = reference;
	}


	public Date getDate_Deb() {
		return date_Deb;
	}


	public void setDate_Deb(Date date_Deb) {
		this.date_Deb = date_Deb;
	}


	public Date getDate_Fin() {
		return date_Fin;
	}


	public void setDate_Fin(Date date_Fin) {
		this.date_Fin = date_Fin;
	}
    
    
}
