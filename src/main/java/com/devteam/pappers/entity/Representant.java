package com.devteam.pappers.entity;

public class Representant {
	private String qualite;
	private Boolean personne_morale;
	private String date_prise_de_poste;
	private String nom_complet;
	private String adresse_ligne_1;
	private String adresse_ligne_2;
	private String adresse_ligne_3;
	private String code_postal;
	private String ville;
	private String pays;
	
	// si personne_moral = true
	private String denomination;
	private String siren;
	private String forme_juridique;
	
	// si personne_moral = false
	private String nom;
	private String prenom;
	private String date_de_naissance;
	private String date_de_naissance_formate;
	private String age;
	private String nationalite;
	private String ville_de_naissance;
	private String pays_de_naissance;
	
	public String getQualite() {
		return qualite;
	}
	public void setQualite(String qualite) {
		this.qualite = qualite;
	}
	public Boolean getPersonne_morale() {
		return personne_morale;
	}
	public void setPersonne_morale(Boolean personne_morale) {
		this.personne_morale = personne_morale;
	}
	public String getDate_prise_de_poste() {
		return date_prise_de_poste;
	}
	public void setDate_prise_de_poste(String date_prise_de_poste) {
		this.date_prise_de_poste = date_prise_de_poste;
	}
	public String getNom_complet() {
		return nom_complet;
	}
	public void setNom_complet(String nom_complet) {
		this.nom_complet = nom_complet;
	}
	public String getAdresse_ligne_1() {
		return adresse_ligne_1;
	}
	public void setAdresse_ligne_1(String adresse_ligne_1) {
		this.adresse_ligne_1 = adresse_ligne_1;
	}
	public String getAdresse_ligne_2() {
		return adresse_ligne_2;
	}
	public void setAdresse_ligne_2(String adresse_ligne_2) {
		this.adresse_ligne_2 = adresse_ligne_2;
	}
	public String getAdresse_ligne_3() {
		return adresse_ligne_3;
	}
	public void setAdresse_ligne_3(String adresse_ligne_3) {
		this.adresse_ligne_3 = adresse_ligne_3;
	}
	public String getCode_postal() {
		return code_postal;
	}
	public void setCode_postal(String code_postal) {
		this.code_postal = code_postal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getDenomination() {
		return denomination;
	}
	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}
	public String getSiren() {
		return siren;
	}
	public void setSiren(String siren) {
		this.siren = siren;
	}
	public String getForme_juridique() {
		return forme_juridique;
	}
	public void setForme_juridique(String forme_juridique) {
		this.forme_juridique = forme_juridique;
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
	public String getDate_de_naissance() {
		return date_de_naissance;
	}
	public void setDate_de_naissance(String date_de_naissance) {
		this.date_de_naissance = date_de_naissance;
	}
	public String getDate_de_naissance_formate() {
		return date_de_naissance_formate;
	}
	public void setDate_de_naissance_formate(String date_de_naissance_formate) {
		this.date_de_naissance_formate = date_de_naissance_formate;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getNationalite() {
		return nationalite;
	}
	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}
	public String getVille_de_naissance() {
		return ville_de_naissance;
	}
	public void setVille_de_naissance(String ville_de_naissance) {
		this.ville_de_naissance = ville_de_naissance;
	}
	public String getPays_de_naissance() {
		return pays_de_naissance;
	}
	public void setPays_de_naissance(String pays_de_naissance) {
		this.pays_de_naissance = pays_de_naissance;
	}
	@Override
	public String toString() {
		String representant = "Representant [qualite=" + qualite + ", personne_morale=" + personne_morale + ", date_prise_de_poste="
				+ date_prise_de_poste + ", nom_complet=" + nom_complet + ", adresse_ligne_1=" + adresse_ligne_1
				+ ", adresse_ligne_2=" + adresse_ligne_2 + ", adresse_ligne_3=" + adresse_ligne_3 + ", code_postal="
				+ code_postal + ", ville=" + ville + ", pays=" + pays;
		
		if (this.personne_morale) {
			representant += ", denomination=" + denomination + ", siren="
					+ siren + ", forme_juridique=" + forme_juridique + "]";
		} else {
			representant += ", nom=" + nom + ", prenom=" + prenom
					+ ", date_de_naissance=" + date_de_naissance + ", date_de_naissance_formate="
					+ date_de_naissance_formate + ", age=" + age + ", nationalite=" + nationalite + ", ville_de_naissance="
					+ ville_de_naissance + ", pays_de_naissance=" + pays_de_naissance + "]";
		}
		
		return representant;
	}
}
