package com.devteam.pappers.entity;

public class Siege {
	private String siret;
	private String siret_formate;
	private String nic;
	private String numero_voie;
	private String indice_repetition;
	private String type_voie;
	private String libelle_voie;
	private String complement_adresse;
	private String adresse_ligne_1;
	private String adresse_ligne_2;
	private String code_postal;
	private String ville;
	private String pays;
	private String latitude;
	private String longitude;
	private String code_naf;
	private String libelle_code_naf;
	private String date_de_creation;
	private Boolean etablissement_employeur;
	private String effectif;
	private String effectif_min;
	private String effectif_max;
	private String tranche_effectif;
	private String annee_effectif;
	private Boolean etablissement_cesse;
	private String date_cessation;
	private String domiciliation;
	private Boolean siege;
	
	public String getSiret() {
		return siret;
	}
	public void setSiret(String siret) {
		this.siret = siret;
	}
	public String getSiret_formate() {
		return siret_formate;
	}
	public void setSiret_formate(String siret_formate) {
		this.siret_formate = siret_formate;
	}
	public String getNic() {
		return nic;
	}
	public void setNic(String nic) {
		this.nic = nic;
	}
	public String getNumero_voie() {
		return numero_voie;
	}
	public void setNumero_voie(String numero_voie) {
		this.numero_voie = numero_voie;
	}
	public String getIndice_repetition() {
		return indice_repetition;
	}
	public void setIndice_repetition(String indice_repetition) {
		this.indice_repetition = indice_repetition;
	}
	public String getType_voie() {
		return type_voie;
	}
	public void setType_voie(String type_voie) {
		this.type_voie = type_voie;
	}
	public String getLibelle_voie() {
		return libelle_voie;
	}
	public void setLibelle_voie(String libelle_voie) {
		this.libelle_voie = libelle_voie;
	}
	public String getComplement_adresse() {
		return complement_adresse;
	}
	public void setComplement_adresse(String complement_adresse) {
		this.complement_adresse = complement_adresse;
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
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getCode_naf() {
		return code_naf;
	}
	public void setCode_naf(String code_naf) {
		this.code_naf = code_naf;
	}
	public String getLibelle_code_naf() {
		return libelle_code_naf;
	}
	public void setLibelle_code_naf(String libelle_code_naf) {
		this.libelle_code_naf = libelle_code_naf;
	}
	public String getDate_de_creation() {
		return date_de_creation;
	}
	public void setDate_de_creation(String date_de_creation) {
		this.date_de_creation = date_de_creation;
	}
	public Boolean getEtablissement_employeur() {
		return etablissement_employeur;
	}
	public void setEtablissement_employeur(Boolean etablissement_employeur) {
		this.etablissement_employeur = etablissement_employeur;
	}
	public String getEffectif() {
		return effectif;
	}
	public void setEffectif(String effectif) {
		this.effectif = effectif;
	}
	public String getEffectif_min() {
		return effectif_min;
	}
	public void setEffectif_min(String effectif_min) {
		this.effectif_min = effectif_min;
	}
	public String getEffectif_max() {
		return effectif_max;
	}
	public void setEffectif_max(String effectif_max) {
		this.effectif_max = effectif_max;
	}
	public String getTranche_effectif() {
		return tranche_effectif;
	}
	public void setTranche_effectif(String tranche_effectif) {
		this.tranche_effectif = tranche_effectif;
	}
	public String getAnnee_effectif() {
		return annee_effectif;
	}
	public void setAnnee_effectif(String annee_effectif) {
		this.annee_effectif = annee_effectif;
	}
	public Boolean getEtablissement_cesse() {
		return etablissement_cesse;
	}
	public void setEtablissement_cesse(Boolean etablissement_cesse) {
		this.etablissement_cesse = etablissement_cesse;
	}
	public String getDate_cessation() {
		return date_cessation;
	}
	public void setDate_cessation(String date_cessation) {
		this.date_cessation = date_cessation;
	}
	public String getDomiciliation() {
		return domiciliation;
	}
	public void setDomiciliation(String domiciliation) {
		this.domiciliation = domiciliation;
	}
	public Boolean getSiege() {
		return siege;
	}
	public void setSiege(Boolean siege) {
		this.siege = siege;
	}
	
	@Override
	public String toString() {
		return "Siege [siret=" + siret + ", siret_formate=" + siret_formate + ", nic=" + nic + ", numero_voie="
				+ numero_voie + ", indice_repetition=" + indice_repetition + ", type_voie=" + type_voie
				+ ", libelle_voie=" + libelle_voie + ", complement_adresse=" + complement_adresse + ", adresse_ligne_1="
				+ adresse_ligne_1 + ", adresse_ligne_2=" + adresse_ligne_2 + ", code_postal=" + code_postal + ", ville="
				+ ville + ", pays=" + pays + ", latitude=" + latitude + ", longitude=" + longitude + ", code_naf="
				+ code_naf + ", libelle_code_naf=" + libelle_code_naf + ", date_de_creation=" + date_de_creation
				+ ", etablissement_employeur=" + etablissement_employeur + ", effectif=" + effectif + ", effectif_min="
				+ effectif_min + ", effectif_max=" + effectif_max + ", tranche_effectif=" + tranche_effectif
				+ ", annee_effectif=" + annee_effectif + ", etablissement_cesse=" + etablissement_cesse
				+ ", date_cessation=" + date_cessation + ", domiciliation=" + domiciliation + ", siege=" + siege + "]";
	}
}
