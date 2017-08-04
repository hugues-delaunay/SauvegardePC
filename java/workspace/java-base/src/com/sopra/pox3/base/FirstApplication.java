package com.sopra.pox3.base;

public class FirstApplication {

	public static void main(String[] args) {

		System.out.println("Hello World");

		int a = 2;
		int[] array;

		Integer[] wrapper;
		String string = "some text";

		String otherString = new String("some text");
		String compareString = new String("some text");

		System.out.println(otherString == compareString);
		System.out.println(otherString.equals(compareString));

		String x = string + 2;
		x = x.concat("other");
		x = x.concat(String.valueOf(2));

		int b = a + 2;

	}

}
