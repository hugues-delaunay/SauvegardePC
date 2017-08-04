package io.sopra.pox3.ordinateur;

public class Ordinateur {

	private String modele;
	private Ram memoireVive;
	private DisqueDur[] disquesDurs;

	public Ordinateur(String modele, int capaciteMemoire, int[] capaciteDisquesDurs) {
		this.modele = modele;
		this.memoireVive = new Ram(capaciteMemoire);
		this.disquesDurs = new DisqueDur[capaciteDisquesDurs.length];

		for (int i = 0; i < capaciteDisquesDurs.length; i++) {
			disquesDurs[i] = new DisqueDur(capaciteDisquesDurs[i]);
		}
	}

	public void demarrer() {

		System.out.println("L'ordinateur " + modele + " démarre");

		if (memoireVive == null) {
			System.out.println("No memory");
		} else {
			memoireVive.initialiser();

		}

		System.out.println("Démarrage des disques durs");

		for (int i = 0; i < disquesDurs.length; i++) {
			disquesDurs[i].demarrer();

		}
		if (disquesDurs.length > 0) {
			disquesDurs[0].lire();
		} else {
			System.out.println("No disc");
		}

		System.out.println("Ordinateur " + modele + " en service\r\n");

	}

	public void eteindre() {
		System.out.println("Extinction disques durs");

		for (int i = disquesDurs.length - 1; i >= 0; i--) {
			disquesDurs[i].eteindreDisque();
		}

		System.out.println("Les disques sont éteints");

		memoireVive.eteindre();

		System.out.println("Ordinateur " + modele + " éteint");
	}

}
