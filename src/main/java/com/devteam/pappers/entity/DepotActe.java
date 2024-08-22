package com.devteam.pappers.entity;

import java.util.List;

public class DepotActe {
	private String date_depot;
	private String date_depot_formate;
	private Boolean disponible;
	private String nom_fichier_pdf;
	private String token;
	private List<Acte> actes;
	
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
	public List<Acte> getActes() {
		return actes;
	}
	public void setActes(List<Acte> actes) {
		this.actes = actes;
	}
	
	@Override
	public String toString() {
		return "DepotsActe [date_depot=" + date_depot + ", date_depot_formate=" + date_depot_formate + ", disponible="
				+ disponible + ", nom_fichier_pdf=" + nom_fichier_pdf + ", token=" + token + ", actes=" + actes + "]";
	}
}
