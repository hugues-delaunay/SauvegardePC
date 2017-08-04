package io.sopra.pox3.ordinateur;

public class Ram {

	private int capacite;

	public Ram(int capacite) {
		this.capacite = capacite;
	}

	public void initialiser() {
		System.out.println("Initialisation mémoire " + capacite + " Go");
	}

	public void eteindre() {
		System.out.println("Extinction mémoire vive");
	}

}
