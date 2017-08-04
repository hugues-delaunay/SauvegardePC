package io.sopra.pox3.bataille;


public class Carte {
	int valeur;
	Couleurs couleur;

	public Carte(int valeur, Couleurs couleur) {
		this.valeur = valeur;
		this.couleur = couleur;
	}
	
	public Carte() {
	}

	@Override
	public String toString() {
		return "Carte [" + valeur +" "+ couleur + "]";
	}

	public int getValeur() {
		return valeur;
	}

	public Couleurs getCouleur() {
		return couleur;
	}


}
