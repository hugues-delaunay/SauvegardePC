package com.sopra.pox3.base;

public class Passage {

	public static void main(String[] args) {

		int x = 3;
		System.out.println(x);
		passage(x);
		System.out.println(x);

		Data data = new Data("azerty");
		System.out.println(data.value);
		passageObject(data);
		System.out.println(data.value);
	}

	static void passage(int x) {

		x++;
		System.out.println("inside passage:" + x);

	}

	static void passageObject(Data data) {
		data.value += "uiop";
		System.out.println("inside passage:" + data.value);

	}
}

class Data {
	String value = "value";

	public Data(String value) {
		super();
		this.value = value;
	}

}
