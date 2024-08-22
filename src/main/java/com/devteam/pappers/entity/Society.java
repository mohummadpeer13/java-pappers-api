package com.devteam.pappers.entity;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Society {

	private String siren;
	private String siren_formate;
	private Boolean diffusable;
	private String nom_entreprise;
	private Boolean personne_morale;
	private String denomination;
	private String sigle;
	private String nom;
	private String prenom;
	private String sexe;
	
	//@JsonProperty(value = "siege")
	private Etablissement siege;
	 
	private String rnm;
	private String code_naf;
	private String libelle_code_naf;
	private String domaine_activite;
	private String objet_social;
	
	private List<ConventionsCollective> conventions_collectives;
	
	private String date_creation;
	private String date_creation_formate;
	private Boolean entreprise_cessee;
	private String date_cessation;
	private String date_cessation_formate;
	private String associe_unique;
	private String categorie_juridique;
	private String forme_juridique;
	private Boolean entreprise_employeuse;
	private String effectif;
	private String effectif_min;
	private String effectif_max;
	private String tranche_effectif;
	private String annee_effectif;
	private String capital;
	private String capital_formate;
	private String capital_actuel_si_variable;
	private String devise_capital;
	private String date_cloture_exercice;
	private String date_cloture_exercice_exceptionnelle;
	private String prochaine_date_cloture_exercice;
	private String prochaine_date_cloture_exercice_formate;
	private Boolean economie_sociale_solidaire;
	private String duree_personne_morale;
	private String derniere_mise_a_jour_sirene;
	private String derniere_mise_a_jour_rcs;
	private String dernier_traitement;
	private String statut_rcs;
	private String greffe;
	private String numero_rcs;
	private String date_immatriculation_rcs;
	private String date_premiere_immatriculation_rcs;
	private String date_radiation_rcs;
	private String numero_tva_intracommunautaire;
	
	private List<Etablissement> etablissements;	
	
	private List<Finance> finances;
	
	private List<Representant> representants;	
	
	private List<BeneficiaireEffectif> beneficiaires_effectifs;
	
	private List<DepotActe> depots_actes;
	
	private List<Compte> comptes;
	
	private List<PublicationBodacc> publications_bodacc;
	
	private List<ProcedureCollective> procedures_collectives;
	
	private Boolean procedures_collectives_existes;
	
	private DerniersStatuts derniers_statuts;
	
	private ExtraitImmatriculation extrait_immatriculation;

	public String getSiren() {
		return siren;
	}

	public void setSiren(String siren) {
		this.siren = siren;
	}

	public String getSiren_formate() {
		return siren_formate;
	}

	public void setSiren_formate(String siren_formate) {
		this.siren_formate = siren_formate;
	}

	public Boolean getDiffusable() {
		return diffusable;
	}

	public void setDiffusable(Boolean diffusable) {
		this.diffusable = diffusable;
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

	public String getDenomination() {
		return denomination;
	}

	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}

	public String getSigle() {
		return sigle;
	}

	public void setSigle(String sigle) {
		this.sigle = sigle;
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

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public Etablissement getSiege() {
		return siege;
	}

	public void setSiege(Etablissement siege) {
		this.siege = siege;
	}

	public String getRnm() {
		return rnm;
	}

	public void setRnm(String rnm) {
		this.rnm = rnm;
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

	public String getDomaine_activite() {
		return domaine_activite;
	}

	public void setDomaine_activite(String domaine_activite) {
		this.domaine_activite = domaine_activite;
	}

	public String getObjet_social() {
		return objet_social;
	}

	public void setObjet_social(String objet_social) {
		this.objet_social = objet_social;
	}

	public List<ConventionsCollective> getConventions_collectives() {
		return conventions_collectives;
	}

	public void setConventions_collectives(List<ConventionsCollective> conventions_collectives) {
		this.conventions_collectives = conventions_collectives;
	}

	public String getDate_creation() {
		return date_creation;
	}

	public void setDate_creation(String date_creation) {
		this.date_creation = date_creation;
	}

	public String getDate_creation_formate() {
		return date_creation_formate;
	}

	public void setDate_creation_formate(String date_creation_formate) {
		this.date_creation_formate = date_creation_formate;
	}

	public Boolean getEntreprise_cessee() {
		return entreprise_cessee;
	}

	public void setEntreprise_cessee(Boolean entreprise_cessee) {
		this.entreprise_cessee = entreprise_cessee;
	}

	public String getDate_cessation() {
		return date_cessation;
	}

	public void setDate_cessation(String date_cessation) {
		this.date_cessation = date_cessation;
	}

	public String getDate_cessation_formate() {
		return date_cessation_formate;
	}

	public void setDate_cessation_formate(String date_cessation_formate) {
		this.date_cessation_formate = date_cessation_formate;
	}

	public String getAssocie_unique() {
		return associe_unique;
	}

	public void setAssocie_unique(String associe_unique) {
		this.associe_unique = associe_unique;
	}

	public String getCategorie_juridique() {
		return categorie_juridique;
	}

	public void setCategorie_juridique(String categorie_juridique) {
		this.categorie_juridique = categorie_juridique;
	}

	public String getForme_juridique() {
		return forme_juridique;
	}

	public void setForme_juridique(String forme_juridique) {
		this.forme_juridique = forme_juridique;
	}

	public Boolean getEntreprise_employeuse() {
		return entreprise_employeuse;
	}

	public void setEntreprise_employeuse(Boolean entreprise_employeuse) {
		this.entreprise_employeuse = entreprise_employeuse;
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

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getCapital_formate() {
		return capital_formate;
	}

	public void setCapital_formate(String capital_formate) {
		this.capital_formate = capital_formate;
	}

	public String getCapital_actuel_si_variable() {
		return capital_actuel_si_variable;
	}

	public void setCapital_actuel_si_variable(String capital_actuel_si_variable) {
		this.capital_actuel_si_variable = capital_actuel_si_variable;
	}

	public String getDevise_capital() {
		return devise_capital;
	}

	public void setDevise_capital(String devise_capital) {
		this.devise_capital = devise_capital;
	}

	public String getDate_cloture_exercice() {
		return date_cloture_exercice;
	}

	public void setDate_cloture_exercice(String date_cloture_exercice) {
		this.date_cloture_exercice = date_cloture_exercice;
	}

	public String getDate_cloture_exercice_exceptionnelle() {
		return date_cloture_exercice_exceptionnelle;
	}

	public void setDate_cloture_exercice_exceptionnelle(String date_cloture_exercice_exceptionnelle) {
		this.date_cloture_exercice_exceptionnelle = date_cloture_exercice_exceptionnelle;
	}

	public String getProchaine_date_cloture_exercice() {
		return prochaine_date_cloture_exercice;
	}

	public void setProchaine_date_cloture_exercice(String prochaine_date_cloture_exercice) {
		this.prochaine_date_cloture_exercice = prochaine_date_cloture_exercice;
	}

	public String getProchaine_date_cloture_exercice_formate() {
		return prochaine_date_cloture_exercice_formate;
	}

	public void setProchaine_date_cloture_exercice_formate(String prochaine_date_cloture_exercice_formate) {
		this.prochaine_date_cloture_exercice_formate = prochaine_date_cloture_exercice_formate;
	}

	public Boolean getEconomie_sociale_solidaire() {
		return economie_sociale_solidaire;
	}

	public void setEconomie_sociale_solidaire(Boolean economie_sociale_solidaire) {
		this.economie_sociale_solidaire = economie_sociale_solidaire;
	}

	public String getDuree_personne_morale() {
		return duree_personne_morale;
	}

	public void setDuree_personne_morale(String duree_personne_morale) {
		this.duree_personne_morale = duree_personne_morale;
	}

	public String getDerniere_mise_a_jour_sirene() {
		return derniere_mise_a_jour_sirene;
	}

	public void setDerniere_mise_a_jour_sirene(String derniere_mise_a_jour_sirene) {
		this.derniere_mise_a_jour_sirene = derniere_mise_a_jour_sirene;
	}

	public String getDerniere_mise_a_jour_rcs() {
		return derniere_mise_a_jour_rcs;
	}

	public void setDerniere_mise_a_jour_rcs(String derniere_mise_a_jour_rcs) {
		this.derniere_mise_a_jour_rcs = derniere_mise_a_jour_rcs;
	}

	public String getDernier_traitement() {
		return dernier_traitement;
	}

	public void setDernier_traitement(String dernier_traitement) {
		this.dernier_traitement = dernier_traitement;
	}

	public String getStatut_rcs() {
		return statut_rcs;
	}

	public void setStatut_rcs(String statut_rcs) {
		this.statut_rcs = statut_rcs;
	}

	public String getGreffe() {
		return greffe;
	}

	public void setGreffe(String greffe) {
		this.greffe = greffe;
	}

	public String getNumero_rcs() {
		return numero_rcs;
	}

	public void setNumero_rcs(String numero_rcs) {
		this.numero_rcs = numero_rcs;
	}

	public String getDate_immatriculation_rcs() {
		return date_immatriculation_rcs;
	}

	public void setDate_immatriculation_rcs(String date_immatriculation_rcs) {
		this.date_immatriculation_rcs = date_immatriculation_rcs;
	}

	public String getDate_premiere_immatriculation_rcs() {
		return date_premiere_immatriculation_rcs;
	}

	public void setDate_premiere_immatriculation_rcs(String date_premiere_immatriculation_rcs) {
		this.date_premiere_immatriculation_rcs = date_premiere_immatriculation_rcs;
	}

	public String getDate_radiation_rcs() {
		return date_radiation_rcs;
	}

	public void setDate_radiation_rcs(String date_radiation_rcs) {
		this.date_radiation_rcs = date_radiation_rcs;
	}

	public String getNumero_tva_intracommunautaire() {
		return numero_tva_intracommunautaire;
	}

	public void setNumero_tva_intracommunautaire(String numero_tva_intracommunautaire) {
		this.numero_tva_intracommunautaire = numero_tva_intracommunautaire;
	}

	public List<Etablissement> getEtablissements() {
		return etablissements;
	}

	public void setEtablissements(List<Etablissement> etablissements) {
		this.etablissements = etablissements;
	}

	public List<Finance> getFinances() {
		return finances;
	}

	public void setFinances(List<Finance> finances) {
		this.finances = finances;
	}

	public List<Representant> getRepresentants() {
		return representants;
	}

	public void setRepresentants(List<Representant> representants) {
		this.representants = representants;
	}

	public List<BeneficiaireEffectif> getBeneficiaires_effectifs() {
		return beneficiaires_effectifs;
	}

	public void setBeneficiaires_effectifs(List<BeneficiaireEffectif> beneficiaires_effectifs) {
		this.beneficiaires_effectifs = beneficiaires_effectifs;
	}

	public List<DepotActe> getDepots_actes() {
		return depots_actes;
	}

	public void setDepots_actes(List<DepotActe> depots_actes) {
		this.depots_actes = depots_actes;
	}

	public List<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}

	public List<PublicationBodacc> getPublications_bodacc() {
		return publications_bodacc;
	}

	public void setPublications_bodacc(List<PublicationBodacc> publications_bodacc) {
		this.publications_bodacc = publications_bodacc;
	}

	public List<ProcedureCollective> getProcedures_collectives() {
		return procedures_collectives;
	}

	public void setProcedures_collectives(List<ProcedureCollective> procedures_collectives) {
		this.procedures_collectives = procedures_collectives;
	}

	public Boolean getProcedures_collectives_existes() {
		return procedures_collectives_existes;
	}

	public void setProcedures_collectives_existes(Boolean procedures_collectives_existes) {
		this.procedures_collectives_existes = procedures_collectives_existes;
	}

	public DerniersStatuts getDerniers_statuts() {
		return derniers_statuts;
	}

	public void setDerniers_statuts(DerniersStatuts derniers_statuts) {
		this.derniers_statuts = derniers_statuts;
	}

	public ExtraitImmatriculation getExtrait_immatriculation() {
		return extrait_immatriculation;
	}

	public void setExtrait_immatriculation(ExtraitImmatriculation extrait_immatriculation) {
		this.extrait_immatriculation = extrait_immatriculation;
	}

	@Override
	public String toString() {
		return "Society [siren=" + siren + ", siren_formate=" + siren_formate + ", diffusable=" + diffusable
				+ ", nom_entreprise=" + nom_entreprise + ", personne_morale=" + personne_morale + ", denomination="
				+ denomination + ", sigle=" + sigle + ", nom=" + nom + ", prenom=" + prenom + ", sexe=" + sexe
				+ ", siege=" + siege + ", rnm=" + rnm + ", code_naf=" + code_naf + ", libelle_code_naf="
				+ libelle_code_naf + ", domaine_activite=" + domaine_activite + ", objet_social=" + objet_social
				+ ", conventions_collectives=" + conventions_collectives + ", date_creation=" + date_creation
				+ ", date_creation_formate=" + date_creation_formate + ", entreprise_cessee=" + entreprise_cessee
				+ ", date_cessation=" + date_cessation + ", date_cessation_formate=" + date_cessation_formate
				+ ", associe_unique=" + associe_unique + ", categorie_juridique=" + categorie_juridique
				+ ", forme_juridique=" + forme_juridique + ", entreprise_employeuse=" + entreprise_employeuse
				+ ", effectif=" + effectif + ", effectif_min=" + effectif_min + ", effectif_max=" + effectif_max
				+ ", tranche_effectif=" + tranche_effectif + ", annee_effectif=" + annee_effectif + ", capital="
				+ capital + ", capital_formate=" + capital_formate + ", capital_actuel_si_variable="
				+ capital_actuel_si_variable + ", devise_capital=" + devise_capital + ", date_cloture_exercice="
				+ date_cloture_exercice + ", date_cloture_exercice_exceptionnelle="
				+ date_cloture_exercice_exceptionnelle + ", prochaine_date_cloture_exercice="
				+ prochaine_date_cloture_exercice + ", prochaine_date_cloture_exercice_formate="
				+ prochaine_date_cloture_exercice_formate + ", economie_sociale_solidaire=" + economie_sociale_solidaire
				+ ", duree_personne_morale=" + duree_personne_morale + ", derniere_mise_a_jour_sirene="
				+ derniere_mise_a_jour_sirene + ", derniere_mise_a_jour_rcs=" + derniere_mise_a_jour_rcs
				+ ", dernier_traitement=" + dernier_traitement + ", statut_rcs=" + statut_rcs + ", greffe=" + greffe
				+ ", numero_rcs=" + numero_rcs + ", date_immatriculation_rcs=" + date_immatriculation_rcs
				+ ", date_premiere_immatriculation_rcs=" + date_premiere_immatriculation_rcs + ", date_radiation_rcs="
				+ date_radiation_rcs + ", numero_tva_intracommunautaire=" + numero_tva_intracommunautaire
				+ ", etablissements=" + etablissements + ", finances=" + finances + ", representants=" + representants
				+ ", beneficiaires_effectifs=" + beneficiaires_effectifs + ", depots_actes=" + depots_actes
				+ ", comptes=" + comptes + ", publications_bodacc=" + publications_bodacc + ", procedures_collectives="
				+ procedures_collectives + ", procedures_collectives_existes=" + procedures_collectives_existes
				+ ", derniers_statuts=" + derniers_statuts + ", extrait_immatriculation=" + extrait_immatriculation
				+ "]";
	}
}
