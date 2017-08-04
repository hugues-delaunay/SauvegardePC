package io.sopra.pox3.bibliotheque;

public class Chanson {

	private String titre;
	private int duree;

	public String getNom() {
		return titre;
	}

	public int getDuree() {
		return duree;
	}

	public Chanson(String titre, int duree) {
		this.titre = titre;
		this.duree = duree;
	}

	public void afficher() {
		System.out.println(titre + "(" + duree + " s)");
	}

}
