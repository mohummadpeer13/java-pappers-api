package com.devteam.pappers.entity;

public class DerniersStatuts {
	private String date_depot;
	private String date_depot_formate;
	private Boolean disponible;
	private String type;
	private String decision;
	private String date_acte;
	private String date_acte_formate;
	
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
	public Boolean getDisponible() {
		return disponible;
	}
	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDecision() {
		return decision;
	}
	public void setDecision(String decision) {
		this.decision = decision;
	}
	public String getDate_acte() {
		return date_acte;
	}
	public void setDate_acte(String date_acte) {
		this.date_acte = date_acte;
	}
	public String getDate_acte_formate() {
		return date_acte_formate;
	}
	public void setDate_acte_formate(String date_acte_formate) {
		this.date_acte_formate = date_acte_formate;
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
		String derniersStatuts = "DerniersStatuts [date_depot=" + date_depot + ", date_depot_formate=" + date_depot_formate
				+ ", disponible=" + disponible + ", type=" + type + ", decision=" + decision + ", date_acte="
				+ date_acte + ", date_acte_formate=" + date_acte_formate;
		
		if (this.disponible) {
			derniersStatuts += ", nom_fichier_pdf=" + nom_fichier_pdf
					+ ", token=" + token + "]";
		} else {
			derniersStatuts += "]";
		}
		
		return derniersStatuts;
	}
}
