package com.example.restservice;

import java.sql.Date;

public class Personne {
	private String nom;
	private String prenom;
	private Date annee;
	private String genre;
	private String libelle;
	private int quantite;
	private int prixU;
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
	public  Date getAnnee() {
		return annee;
	}
	public void setAnnee(Date annee) {
		this.annee = annee;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public int getPrixU() {
		return prixU;
	}
	public void setPrixU(int prixU) {
		this.prixU = prixU;
	}
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", annee=" + annee + ", genre=" + genre + ", getNom()="
				+ getNom() + ", getPrenom()=" + getPrenom() + ", getAnnee()=" + getAnnee() + ", getGenre()="
				+ getGenre() + "]";
	}
	
}
