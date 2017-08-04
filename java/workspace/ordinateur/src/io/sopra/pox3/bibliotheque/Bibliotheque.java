package io.sopra.pox3.bibliotheque;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {

	private List<Disque> disques = new ArrayList<>();

	public Bibliotheque() {
		disques = new ArrayList<>();
	}

	/*
	 * void ajouterDisque(Disque disque) throws DisqueExisteDejaException {
	 * //List<Disque> newDisques = disque.getCodeBarre(); if
	 * (disque.getCodeBarre() != null && disques.isEmpty()) { throw new
	 * DisqueExisteDejaException(disque); } }
	 */

	boolean ajouterDisque(Disque disque) {

		// for (Disque disqueAjout : disques) {

		// if (disque.getCodeBarre().equals(disqueAjout.getCodeBarre()) ||
		// disque.getCodeBarre().equals(null)) {
		// System.out.println("Code barre existant ou nul");
		// return false;

		// } else {

		int nbChanson = Saisie.saisieInt("Nombre de chanson?");

		for (int i = 1; i <= nbChanson; i++) {
			String nomChansonAjoute = Saisie.saisie("Nom de la chanson " + i);
			int tempsChansonAjoute = Saisie.saisieInt("Durée de la Chanson" + i);
			disque.addChanson(new Chanson(nomChansonAjoute, tempsChansonAjoute));
		}

		// }
		// }
		return true;

	}

	boolean retirerDisque(String codeBarre) {
		for (Disque disque : disques)
			if (disque.getCodeBarre().equals(codeBarre)) {
				disques.remove(disque);
				System.out.println("Disque " + disque.getNom() + " effacé");
				return true;
			}
		return false;
	}

	public void afficherDisques() {
		System.out.println("liste des disques de la bibliotheque");
		System.out.println("Il y a " + disques.size() + " disque(s)");
		for (Disque disque : disques) {
			disque.afficherEnTete();
		}
	}

	public int getNbDisques() {
		int NbDisques = disques.size();
		return NbDisques;
	}

	public void addDisques(Disque disque) {
		disques.add(disque);
	}

	public Disque getDisque(String codeBarre) {
		for (Disque disque : disques) {
			String codeBarreDisque = disque.getCodeBarre();
			if (codeBarreDisque.equals(codeBarre))
				return disque;
		}
		return null;

	}

	/*
	 * List<Disque> rechercherDisques(String recherche) {
	 * 
	 * }
	 */

	public List<Chanson> rechercherChansons(String recherche) {

		recherche = recherche.toLowerCase();
		List<Chanson> resultat = new ArrayList<>();
		for (Disque disque : disques) {

			List<Chanson> ListeChansons = disque.getChansons();

			for (Chanson chanson : ListeChansons) {

				/*
				 * if (chanson.getNom().equalsIgnoreCase(recherche)) {
				 * resultat.add(chanson);
				 * 
				 * }
				 */
				if (chanson.getNom().toLowerCase().contains(recherche))
					resultat.add(chanson);

			}

		}
		return resultat;
	}

	void chargerFichierTexte(Bibliotheque bibliotheque) {
		File file = new File("jukebox.txt");

		FileInputStream fis;
		try {
			fis = new FileInputStream(file);

			InputStreamReader isr = new InputStreamReader(fis, "UTF8");

			BufferedReader reader = new BufferedReader(isr);

			while (true) {
				String nom = reader.readLine();
				if (nom == null)
					break;

				String codeBarre = reader.readLine();
				Disque disque = new Disque(nom, codeBarre);

				int nbChansons = Integer.parseInt(reader.readLine());

				for (int i = 0; i < nbChansons; i++) {
					String nomChanson = reader.readLine();
					int dureeChanson = Integer.parseInt(reader.readLine());

					Chanson chanson = new Chanson(nomChanson, dureeChanson);
					disque.addChanson(chanson);
				}
				bibliotheque.addDisques(disque);
			}
			reader.close();

			isr.close();

			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	void sauvegarde(Bibliotheque bibliotheque) throws IOException {

		try {
			File file = new File("jukebox.txt");
			FileOutputStream fos = new FileOutputStream(file);
			PrintWriter writer = new PrintWriter(fos);

			for (Disque disque : bibliotheque.disques) {
				writer.println(disque.getNom());
				writer.println(disque.getCodeBarre());
				writer.println(disque.getChansons().size());

				for (Chanson chanson : disque.getChansons()) {
					writer.println(chanson.getNom());
					writer.println(chanson.getDuree());

				}
			}

			writer.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
