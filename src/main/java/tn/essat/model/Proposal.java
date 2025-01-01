package tn.essat.model;

public class Proposal {
    private int id;
    private Project project;
    private User freelancer;
    private double montant;
    private String description;
	public Proposal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Proposal(int id, Project project, User freelancer, double montant, String description) {
		super();
		this.id = id;
		this.project = project;
		this.freelancer = freelancer;
		this.montant = montant;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public User getFreelancer() {
		return freelancer;
	}
	public void setFreelancer(User freelancer) {
		this.freelancer = freelancer;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
    

}
