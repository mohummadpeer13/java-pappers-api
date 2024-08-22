package com.devteam.pappers.entity;

public class Compte {

	private String date_depot;
	private String date_depot_formate;
	private String date_cloture;
	private String annee_cloture;
	private String type_comptes;
	private Boolean confdentialite;
	private Boolean confidentialite_compte_de_resultat;
	private Boolean disponible;
	
	// Si disponible = true
	private String nom_fichier_pdf;
	private String token;
	
	public String getDate_depot() {
		return date_depot;
	}
	public void setDate_depot(String date_depot) {
		this.date_depot = date_depot;
	}
	public String getDate_depot_formate() {
		return date_depot_formate;
	}
	public void setDate_depot_formate(String date_depot_formate) {
		this.date_depot_formate = date_depot_formate;
	}
	public String getDate_cloture() {
		return date_cloture;
	}
	public void setDate_cloture(String date_cloture) {
		this.date_cloture = date_cloture;
	}
	public String getAnnee_cloture() {
		return annee_cloture;
	}
	public void setAnnee_cloture(String annee_cloture) {
		this.annee_cloture = annee_cloture;
	}
	public String getType_comptes() {
		return type_comptes;
	}
	public void setType_comptes(String type_comptes) {
		this.type_comptes = type_comptes;
	}
	public Boolean getConfdentialite() {
		return confdentialite;
	}
	public void setConfdentialite(Boolean confdentialite) {
		this.confdentialite = confdentialite;
	}
	public Boolean getConfidentialite_compte_de_resultat() {
		return confidentialite_compte_de_resultat;
	}
	public void setConfidentialite_compte_de_resultat(Boolean confidentialite_compte_de_resultat) {
		this.confidentialite_compte_de_resultat = confidentialite_compte_de_resultat;
	}
	public Boolean getDisponible() {
		return disponible;
	}
	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}
	public String getNom_fichier_pdf() {
		return nom_fichier_pdf;
	}
	public void setNom_fichier_pdf(String nom_fichier_pdf) {
		this.nom_fichier_pdf = nom_fichier_pdf;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	@Override
	public String toString() {
		String compte = "Compte [date_depot=" + date_depot + ", date_depot_formate=" + date_depot_formate + ", date_cloture="
				+ date_cloture + ", annee_cloture=" + annee_cloture + ", type_comptes=" + type_comptes
				+ ", confdentialite=" + confdentialite + ", confidentialite_compte_de_resultat="
				+ confidentialite_compte_de_resultat + ", disponible=" + disponible;
		
		if (this.disponible) {
			compte += ", nom_fichier_pdf="
					+ nom_fichier_pdf + ", token=" + token + "]";
		} else {
			compte += "]";
		}
		
		return compte;
	}
}
