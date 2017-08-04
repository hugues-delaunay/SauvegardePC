package io.sopra.pox3.bataille;

import java.util.List;

public class PartieApplication {

	public static void main(String[] args) {
		
		FabriqueDeck deck1 = new FabriqueDeck();
		FabriqueDeck deck2 = new FabriqueDeck();
		
		List<Carte> mCarte1 = deck1.creerDeck52();
		System.out.println(deck1.creerDeck52().toString());
		System.out.println(deck2.creerDeck32().toString());
		
		Joueur joueur1 = new Joueur();
		
		joueur1.setMain(mCarte1);
		Carte carteChoisi =joueur1.donneCarte() ;
		System.out.println(carteChoisi);
		System.out.println(mCarte1);
	
		
		/*public Joueur deroulerPartie(Joueur joueur1, Joueur joueur2){
			
		}*/


		


	}

}
