package tn.essat.model;

public class Profil {
    private int id;
    private String biblio;
    private String skills;
    private int anneeExperience;
    private boolean disponibilite;
    private double rating;
	public Profil() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Profil(int id, String biblio, String skills, int anneeExperience, boolean disponibilite, double rating) {
		super();
		this.id = id;
		this.biblio = biblio;
		this.skills = skills;
		this.anneeExperience = anneeExperience;
		this.disponibilite = disponibilite;
		this.rating = rating;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBiblio() {
		return biblio;
	}
	public void setBiblio(String biblio) {
		this.biblio = biblio;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public int getAnneeExperience() {
		return anneeExperience;
	}
	public void setAnneeExperience(int anneeExperience) {
		this.anneeExperience = anneeExperience;
	}
	public boolean isDisponibilite() {
		return disponibilite;
	}
	public void setDisponibilite(boolean disponibilite) {
		this.disponibilite = disponibilite;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
    

}
