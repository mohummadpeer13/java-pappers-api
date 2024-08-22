package com.devteam.pappers.entity;

public class PublicationBodacc {
	private String numero_parution;
	private String date;
	private String numero_annonce;
	private String annonce_rectificative;
	private String bodacc;
	private String type;
	private String rcs;
	private String sigle;
	private String denomination;
	private String forme_juridique;
	
	// Si bodacc = "A"
	private String date_cloture;
	private String type_depot;
	private String descriptif;
	
	// Si bodacc = "B"
	private String nom_entreprise;
	private Boolean personne_morale;
	private String nom_commercial;
	private String nom;
	private String prenom;
	private String administration;
	private String pseudonyme;
	private String nationnalite;
	private String adresse;
	private String capital;
	private String devise_capital;
	private String activite;
	private String date_debut_activite;
	private String description;
	
	public String getNumero_parution() {
		return numero_parution;
	}
	public void setNumero_parution(String numero_parution) {
		this.numero_parution = numero_parution;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getNumero_annonce() {
		return numero_annonce;
	}
	public void setNumero_annonce(String numero_annonce) {
		this.numero_annonce = numero_annonce;
	}
	public String getAnnonce_rectificative() {
		return annonce_rectificative;
	}
	public void setAnnonce_rectificative(String annonce_rectificative) {
		this.annonce_rectificative = annonce_rectificative;
	}
	public String getBodacc() {
		return bodacc;
	}
	public void setBodacc(String bodacc) {
		this.bodacc = bodacc;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRcs() {
		return rcs;
	}
	public void setRcs(String rcs) {
		this.rcs = rcs;
	}
	public String getSigle() {
		return sigle;
	}
	public void setSigle(String sigle) {
		this.sigle = sigle;
	}
	public String getDenomination() {
		return denomination;
	}
	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}
	public String getForme_juridique() {
		return forme_juridique;
	}
	public void setForme_juridique(String forme_juridique) {
		this.forme_juridique = forme_juridique;
	}
	public String getDate_cloture() {
		return date_cloture;
	}
	public void setDate_cloture(String date_cloture) {
		this.date_cloture = date_cloture;
	}
	public String getType_depot() {
		return type_depot;
	}
	public void setType_depot(String type_depot) {
		this.type_depot = type_depot;
	}
	public String getDescriptif() {
		return descriptif;
	}
	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}
	public String getNom_entreprise() {
		return nom_entreprise;
	}
	public void setNom_entreprise(String nom_entreprise) {
		this.nom_entreprise = nom_entreprise;
	}
	public Boolean getPersonne_morale() {
		return personne_morale;
	}
	public void setPersonne_morale(Boolean personne_morale) {
		this.personne_morale = personne_morale;
	}
	public String getNom_commercial() {
		return nom_commercial;
	}
	public void setNom_commercial(String nom_commercial) {
		this.nom_commercial = nom_commercial;
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
	public String getAdministration() {
		return administration;
	}
	public void setAdministration(String administration) {
		this.administration = administration;
	}
	public String getPseudonyme() {
		return pseudonyme;
	}
	public void setPseudonyme(String pseudonyme) {
		this.pseudonyme = pseudonyme;
	}
	public String getNationnalite() {
		return nationnalite;
	}
	public void setNationnalite(String nationnalite) {
		this.nationnalite = nationnalite;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getDevise_capital() {
		return devise_capital;
	}
	public void setDevise_capital(String devise_capital) {
		this.devise_capital = devise_capital;
	}
	public String getActivite() {
		return activite;
	}
	public void setActivite(String activite) {
		this.activite = activite;
	}
	public String getDate_debut_activite() {
		return date_debut_activite;
	}
	public void setDate_debut_activite(String date_debut_activite) {
		this.date_debut_activite = date_debut_activite;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		String publicationBodacc = "PublicationBodacc [numero_parution=" + numero_parution + ", date=" + date + ", numero_annonce="
				+ numero_annonce + ", annonce_rectificative=" + annonce_rectificative + ", bodacc=" + bodacc + ", type="
				+ type + ", rcs=" + rcs + ", sigle=" + sigle + ", denomination=" + denomination + ", forme_juridique="
				+ forme_juridique;
		
		if (this.bodacc.equals("A")) {
			publicationBodacc += ", date_cloture=" + date_cloture + ", type_depot=" + type_depot + ", descriptif="
					+ descriptif;
		} else if (this.bodacc.equals("B")) {
			publicationBodacc += ", nom_entreprise=" + nom_entreprise + ", personne_morale=" + personne_morale
					+ ", nom_commercial=" + nom_commercial + ", nom=" + nom + ", prenom=" + prenom + ", administration="
					+ administration + ", pseudonyme=" + pseudonyme + ", nationnalite=" + nationnalite + ", adresse="
					+ adresse + ", capital=" + capital + ", devise_capital=" + devise_capital + ", activite=" + activite
					+ ", date_debut_activite=" + date_debut_activite + ", description=" + description + "]";
		}
		
		return publicationBodacc;
	}
}
