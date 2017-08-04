package com.sopra.pox3.madagascar;

public class Emperor extends Penguin {

	public Emperor(String name) {
		super(name, 28);
	}

	@Override
	public void slide() {
		System.out.println("Yeahhhhhhhhhh!!!");
	}
	
	public void slide(Penguin p) {
		System.out.println("Incredible!!" + name);
	}

	public void slide(Emperor p) {
		System.out.println("Nul " + name);
	}
}
