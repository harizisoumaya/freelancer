package tn.essat.model;

import java.util.Date;

public class Message {
    private int id;
    private User expediteur;
    private User destinataire;
    private String contenu;
    private Date date;
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Message(int id, User expediteur, User destinataire, String contenu, Date date) {
		super();
		this.id = id;
		this.expediteur = expediteur;
		this.destinataire = destinataire;
		this.contenu = contenu;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getExpediteur() {
		return expediteur;
	}
	public void setExpediteur(User expediteur) {
		this.expediteur = expediteur;
	}
	public User getDestinataire() {
		return destinataire;
	}
	public void setDestinataire(User destinataire) {
		this.destinataire = destinataire;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
    

}
