package io.sopra.pox3.servlet;

import java.util.Date;

public class Message {
	private Date date;
	private User user;
	private String texte;

	public Message(Date date, User user, String texte) {
		this.date = date;
		this.user = user;
		this.texte = texte;
	}

	public Date getDate() {
		return date;
	}

	public User getUser() {
		return user;
	}

	public String getTexte() {
		return texte;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}

}
