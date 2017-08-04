package io.sopra.pox3.bataille;

import java.util.ArrayList;
import java.util.List;

public class FabriqueDeck {

	int INITIAL_SIZE_52 = 52;
	int INITIAL_SIZE_32 = 32;
	

	int valeur;
	String couleur;

	List<Carte> cartes = new ArrayList<>();

	public List<Carte> creerDeck52() {

		int valeur = INITIAL_SIZE_52/4 +1;
		for (Couleurs couleur : Couleurs.values()) {

			for (int i = 2; i <= valeur; i++) {
				Carte carte = new Carte(i, couleur);

				cartes.add(carte);

			}
		}

		return cartes;
	}
	
	public List<Carte> creerDeck32() {

		int valeur = INITIAL_SIZE_32/4 +1;
		for (Couleurs couleur : Couleurs.values()) {

			for (int i = 7; i < valeur+6; i++) {
				Carte carte = new Carte(i, couleur);

				cartes.add(carte);

			}
		}

		return cartes;
	}

}
