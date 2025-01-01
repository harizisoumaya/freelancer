package tn.essat.model;

public class Project {
    private int id;
    private String titre;
    private String description;
    private double budget;
    private String dateLimite;
    private String technologies;
    private String statut;
    private User client;
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(int id, String titre, String description, double budget, String dateLimite, String technologies,
			String statut, User client) {
		super();
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.budget = budget;
		this.dateLimite = dateLimite;
		this.technologies = technologies;
		this.statut = statut;
		this.client = client;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	public String getDateLimite() {
		return dateLimite;
	}
	public void setDateLimite(String dateLimite) {
		this.dateLimite = dateLimite;
	}
	public String getTechnologies() {
		return technologies;
	}
	public void setTechnologies(String technologies) {
		this.technologies = technologies;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public User getClient() {
		return client;
	}
	public void setClient(User client) {
		this.client = client;
	}

}
