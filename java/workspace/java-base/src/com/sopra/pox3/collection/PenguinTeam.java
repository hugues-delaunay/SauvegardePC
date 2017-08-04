package com.sopra.pox3.collection;

import java.util.List;

import com.sopra.pox3.madagascar.Penguin;

public class PenguinTeam {
	int count;

	List<Penguin> penguins = new CircularList<>();

	public PenguinTeam(Penguin[] allPenguins) {

		for (Penguin p : allPenguins) {
			this.penguins.add(p);
		}

	}

	
	public Penguin next() {

		return this.penguins.iterator().next();
	}

	public List<Penguin> getPenguins() {
		return penguins;
	}
}
