package tn.essat.model;


public class User {
    private int id;
    private String nom;
    private String username;
    private String email;
    private String motDePasse;
    private String role; // "freelancer" ou "client"
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String nom, String username, String email, String motDePasse, String role) {
		super();
		this.id = id;
		this.nom = nom;
		this.username = username;
		this.email = email;
		this.motDePasse = motDePasse;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

}
