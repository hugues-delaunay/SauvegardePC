package com.sopra.pox3.equals;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class EqualsApplication {

	public static void main(String[] args) {

		Card c1 = new Card(8, 's');
		Card c2 = new Card(2, 'c');
		Card c3 = new Card(8, 's');

		boolean result = c1.equals(c2);
		boolean result2 = c1.equals(c3);

		System.out.println(result);
		System.out.println(result2);
		
		Set<Card> set = new HashSet<>();
		//set.add(c1);
		//set.add(c2);
		//set.add(c3);
		Collections.addAll(set, c1,c2,c3);
		
		System.out.println(set);
		

	}

}
