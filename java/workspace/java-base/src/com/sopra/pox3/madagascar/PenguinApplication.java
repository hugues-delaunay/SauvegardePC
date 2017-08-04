package com.sopra.pox3.madagascar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PenguinApplication {

	public static void main(String[] args) {
		List<Penguin> penguins = new ArrayList<>();

		Penguin skipper = new Penguin("Commandant", 15);
		Penguin kowalski = new Penguin("Kowalski", 8);
		Penguin rico = new Penguin("Rico", 21);
		Penguin soldat = new Penguin("Soldat", 6);
		// Penguin truc = new Penguin("", 6);
		// Penguin machin = new Penguin("", 6);

		penguins.add(skipper);
		penguins.add(kowalski);
		penguins.add(soldat);
		penguins.add(rico);
		// penguins.add(truc);
		// penguins.add(machin);

		System.out.println(penguins);
		Collections.sort(penguins);
		System.out.println(penguins);

		Collections.sort(penguins, new Comparator<Penguin>() {

			@Override
			public int compare(Penguin p1, Penguin p2) {
				return p1.speed.compareTo(p2.speed);
			}
		});
		System.out.println(penguins);

		Emperor napoleon = new Emperor("napoleon");
		System.out.println(napoleon);

		napoleon.slide();
		napoleon.slide(rico);

		Emperor neron = new Emperor("Neron");
		neron.slide(napoleon);

		// Tout va bien...pour l'instant

		Penguin p = napoleon;
		p = rico;
		p = napoleon;
		System.out.println("====Complex stuff====");
		p.slide();
		
		p=neron;
		napoleon .slide(p);

	}

}
