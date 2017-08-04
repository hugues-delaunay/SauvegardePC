package io.sopra.pox3.ordinateur;

public class OrdinateurApplication {

	public static void main(String[] args) {

		Ordinateur o = new Ordinateur("Republic of Gamers", 25, new int[] { 100, 1000 });

		o.demarrer();
		o.eteindre();
	}

}
