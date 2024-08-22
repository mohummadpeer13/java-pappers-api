package com.devteam.pappers.entity;

public class ConventionsCollective {

	private String nom;
	private String idcc;
	private Boolean confirmee;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getIdcc() {
		return idcc;
	}
	public void setIdcc(String idcc) {
		this.idcc = idcc;
	}
	public Boolean getConfirmee() {
		return confirmee;
	}
	public void setConfirmee(Boolean confirmee) {
		this.confirmee = confirmee;
	}
	
	@Override
	public String toString() {
		return "ConventionsCollective [nom=" + nom + ", idcc=" + idcc + ", confirmee=" + confirmee + "]";
	}
}
