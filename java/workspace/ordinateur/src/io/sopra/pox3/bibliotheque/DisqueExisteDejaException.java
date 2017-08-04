package io.sopra.pox3.bibliotheque;

public class DisqueExisteDejaException extends Exception{

	public DisqueExisteDejaException(Disque disqueEnErreur) {
		super("Existe d�j� (" +disqueEnErreur.getCodeBarre()+")");
	}
	

}
