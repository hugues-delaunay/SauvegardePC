package io.sopra.pox3.bibliotheque;

import java.util.ArrayList;
import java.util.List;

public class Disque {

	private String nom;
	private String codeBarre;
	private List<Chanson> chansons;

	public Disque(String nom, String codeBarre) {
		this.nom = nom;
		this.codeBarre = codeBarre;
		chansons = new ArrayList<>();
	}

	public String getNom() {
		return nom;
	}

	public String getCodeBarre() {
		return codeBarre;
	}

	public List<Chanson> getChansons() {
		return chansons;
	}

	public void addChanson(Chanson chanson) {

		chansons.add(chanson);
	}

	public int getDuree() {
		int dureeTotale = 0;
		for (Chanson c : chansons) {
			dureeTotale += c.getDuree();
		}
		return dureeTotale;
	}


	public void afficherEnTete() {
		System.out.println("Disque: " + nom);
		System.out.println("code barre:" + codeBarre);

	}
	
	public void afficherDetails(){
		afficherEnTete();
		for (Chanson chanson : chansons) {
			chanson.afficher();
		}

	}

}
