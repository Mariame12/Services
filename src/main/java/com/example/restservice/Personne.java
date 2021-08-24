package com.example.restservice;

import java.sql.Date;

public class Personne {
	private String nom;
	private String prenom;
	private Date annee;
	private String genre;
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
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", annee=" + annee + ", genre=" + genre + ", getNom()="
				+ getNom() + ", getPrenom()=" + getPrenom() + ", getAnnee()=" + getAnnee() + ", getGenre()="
				+ getGenre() + "]";
	}
	
}
