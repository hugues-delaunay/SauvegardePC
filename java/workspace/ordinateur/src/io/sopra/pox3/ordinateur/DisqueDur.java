package io.sopra.pox3.ordinateur;

public class DisqueDur {

	private int capacite;

	public DisqueDur(int capacite) {
		this.capacite = capacite;
	}

	public void demarrer() {
		System.out.println("Démarrage disque " + capacite + " Go");

	}

	public void lire() {
		System.out.println("Lecture disque " + capacite + " Go");

	}

	public void eteindreDisque() {
		System.out.println("Extinction disque " + capacite + " Go");

	}

}
