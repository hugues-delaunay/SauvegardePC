package io.sopra.pox3.bibliotheque;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class BiblioApplication {

	public static void main(String[] args) throws IOException {

		Bibliotheque bibliotheque = new Bibliotheque();

		Disque disque1 = new Disque("Alleluia", "100");
		disque1.addChanson(new Chanson("Intro", 30));
		disque1.addChanson(new Chanson("Superbe", 62));
		disque1.addChanson(new Chanson("Milieu", 15));
		disque1.addChanson(new Chanson("Incroyable", 120));
		disque1.addChanson(new Chanson("Outro", 85));
		bibliotheque.addDisques(disque1);

		Disque disque2 = new Disque("Amen", "200");
		disque2.addChanson(new Chanson("Intro2", 30));
		disque2.addChanson(new Chanson("Superbe2", 62));
		disque2.addChanson(new Chanson("Milieu2", 15));
		disque2.addChanson(new Chanson("Incroyable2", 120));
		disque2.addChanson(new Chanson("Outro2", 85));
		bibliotheque.addDisques(disque2);

		System.out.println(bibliotheque.getNbDisques());

		while (true) {
			System.out.println("1:Liste des disques ");
			System.out.println("2 : Détails d'un disque");
			System.out.println("3 : Recherche chanson");
			System.out.println("4 : Retirer disque");
			System.out.println("5 : Ajouter disque");
			System.out.println("6 : Sauvegarde");
			System.out.println("7 : Charger");

			System.out.println("Q: Quitter");

			String choix = Saisie.saisie("Quel est ton choix?");

			switch (choix) {
			case "1":
				bibliotheque.afficherDisques();

				break;

			case "2":
				String codeBarre = Saisie.saisie("CodeBarre");
				Disque disqueTrouve = bibliotheque.getDisque(codeBarre);

				if (disqueTrouve == null)
					System.out.println("Pas de disque avec ce code barre");
				else
					disqueTrouve.afficherDetails();

				break;

			case "3":
				String chansonCherchee = Saisie.saisie("Chanson");
				List<Chanson> chansons = bibliotheque.rechercherChansons(chansonCherchee);

				if (chansons == null || chansons.isEmpty()) {
					System.out.println("Pas de Chanson");
				} else {
					for (Chanson chanson : chansons) {
						chanson.afficher();
					}
				}

				break;

			case "4":
				String codeBarreToDelete = Saisie.saisie("CodeBarre");
				boolean disqueEfface = bibliotheque.retirerDisque(codeBarreToDelete);

				if (disqueEfface) {
					bibliotheque.afficherDisques();
				}

				else {
					System.out.println("Pas de disque à effacer");
				}
				bibliotheque.afficherDisques();

				break;

			case "5":
				String nomDisqueAjoute = Saisie.saisie("Nom du disque à ajouter");
				String codeBarreAjoute = Saisie.saisie("Code Barre à ajouter");
				Disque disque = new Disque(nomDisqueAjoute, codeBarreAjoute);

				/*while (true) {
					Chanson chanson = saisirChanson();

					if (chanson != null) {

						disque.addChanson(chanson);

					} else {
						break;
					}
				}
				try {
					bibliotheque.ajouterDisque(disque);
					System.out.println("Disque ajouté");
				} catch (DisqueExisteDejaException e) {
					System.out.println("Impossible d'ajouter le disque");
				}*/

				 //if (bibliotheque.ajouterDisque(disque)) {
				 //System.out.println("Disque ajouté");
				 //}

				 //if(bibliotheque.ajouterDisque(disque)){
				 bibliotheque.ajouterDisque(disque);
				 bibliotheque.addDisques(disque);
				 disque.afficherDetails();
				 //}

				break;
				
			case "6":


				bibliotheque.sauvegarde(bibliotheque);
				System.out.println("Données sauvegardées");

				
				break;
		
			case "7" :
				
				bibliotheque.chargerFichierTexte(bibliotheque);
				System.out.println("Données chargées");

				break;
						

			case "Q":
			case "q":
				System.exit(0);

				break;

			default:
				System.out.println("Ce choix n'existe pas");
			}
		}

	}

	private static Chanson saisirChanson() {
		String nom = Saisie.saisie("Nom de la chanson");
		if (nom == null || nom.isEmpty())
			return null;

		int duree = Saisie.saisieInt("Durée");
		return new Chanson(nom, duree);
	}
}
