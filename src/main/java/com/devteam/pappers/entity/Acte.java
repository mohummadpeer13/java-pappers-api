package com.devteam.pappers.entity;

public class Acte {
    private String type;
	private String decision;
	private String date_acte;
	private String date_acte_formate;
	
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
	
	@Override
	public String toString() {
		return "Acte [type=" + type + ", decision=" + decision + ", date_acte=" + date_acte + ", date_acte_formate="
				+ date_acte_formate + "]";
	}
}
