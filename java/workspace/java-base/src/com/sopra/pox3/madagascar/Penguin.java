package com.sopra.pox3.madagascar;

public class Penguin extends Bird implements CanSlide, Comparable<Penguin> {

	String name;
	Integer speed;

	@Override
	public String toString() {
		return name; //+ ", speed: " + speed + "km/h";
	}

	public Penguin(String name, int speed) {

		this(name);
		this.speed = speed;
	}

	public Penguin(String name) {
		if (name.isEmpty()) {
			throw new IllegalArgumentException("Empty name for Penguin");
		}
		this.name = name;
	}

	public void slide() {
		System.out.println("Yahou!!!! at " + speed + " km/h");
	}

	@Override
	public int compareTo(Penguin other) {
		return this.name.compareTo(other.name);
	}

}
