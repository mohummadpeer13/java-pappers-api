package com.devteam.pappers.entity;

public class Finance {
	private String annee;
	private String date_de_cloture_exercice;
	private String duree_exercice;
	private String chiffre_affaires;
	private String resultat;
	private String effectif;
	public String getAnnee() {
		return annee;
	}
	public void setAnnee(String annee) {
		this.annee = annee;
	}
	public String getDate_de_cloture_exercice() {
		return date_de_cloture_exercice;
	}
	public void setDate_de_cloture_exercice(String date_de_cloture_exercice) {
		this.date_de_cloture_exercice = date_de_cloture_exercice;
	}
	public String getDuree_exercice() {
		return duree_exercice;
	}
	public void setDuree_exercice(String duree_exercice) {
		this.duree_exercice = duree_exercice;
	}
	public String getChiffre_affaires() {
		return chiffre_affaires;
	}
	public void setChiffre_affaires(String chiffre_affaires) {
		this.chiffre_affaires = chiffre_affaires;
	}
	public String getResultat() {
		return resultat;
	}
	public void setResultat(String resultat) {
		this.resultat = resultat;
	}
	public String getEffectif() {
		return effectif;
	}
	public void setEffectif(String effectif) {
		this.effectif = effectif;
	}
	@Override
	public String toString() {
		return "Finance [annee=" + annee + ", date_de_cloture_exercice=" + date_de_cloture_exercice
				+ ", duree_exercice=" + duree_exercice + ", chiffre_affaires=" + chiffre_affaires + ", resultat="
				+ resultat + ", effectif=" + effectif + "]";
	}
}
