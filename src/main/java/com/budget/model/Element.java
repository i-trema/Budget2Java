package com.budget.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Element implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotNull
	private double montant;
	private String date;
	private String categorie;
	
	private String commentaire;
	
	
	
	
	public Element(long id, @NotNull double montant, String date, String categorie, String commentaire) {
		super();
		this.id = id;
		this.montant = montant;
		this.date = date;
		this.categorie = categorie;
		this.commentaire = commentaire;
	}
	public Element() {
		super();
	}
	public Element(double montant, String date, String categorie, String commentaire) {
		super();
		this.montant = montant;
		this.date = date;
		this.categorie = categorie;
		this.commentaire = commentaire;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
