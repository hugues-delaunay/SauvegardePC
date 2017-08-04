package com.sopra.pox3.Object;

public class People {
	String name;
	int age;
	static int maxAge = 120;

	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int birthday() {

		if (age < 120) {
			int increment = 1;
			return this.age + increment;

		}
		return -1;
	}

	public String getName() {

		return name;
	}
}
