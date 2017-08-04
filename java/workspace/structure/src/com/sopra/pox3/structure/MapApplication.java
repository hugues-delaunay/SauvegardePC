package com.sopra.pox3.structure;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapApplication {

	public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
		List<Map.Entry<K, V>> list = new LinkedList<Map.Entry<K, V>>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
			public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		Map<K, V> result = new LinkedHashMap<K, V>();
		for (Map.Entry<K, V> entry : list) {
			result.put(entry.getKey(), entry.getValue());
		}
		return result;
	}

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();
		map.put("John", 45);
		map.put("Jo", 95);
		map.put("Jack", 32);

		System.out.println(map);

		Player John = new Player();
		John.name = "John";

		Player Jo = new Player();
		Jo.name = "Jo";

		Player Jack = new Player();
		Jack.name = "Jack";

		TreeMap<Player, Integer> playerScores = new TreeMap<>();
		playerScores.put(John, 45);
		playerScores.put(Jo, 95);
		playerScores.put(Jack, 32);

		System.out.println(playerScores);

		System.out.println(sortByValue(playerScores));
	}

}
