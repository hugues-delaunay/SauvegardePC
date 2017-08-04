package io.sopra.pox3.servlet;

public class ChatRoom {
	String name;
	User createur;
	
	public ChatRoom(String name, User createur) {
		this.name = name;
		this.createur = createur;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getCreateur() {
		return createur;
	}

	public void setCreateur(User createur) {
		this.createur = createur;
	}
	

}
