package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortKeys {

	public static void keySort(HashMap<String, Double> map) {
		ArrayList<String> list = new ArrayList<>(map.keySet());

		Collections.sort(list);

		// System.out.println(list);

		LinkedHashMap<String, Double> lmap = new LinkedHashMap<>();

		for (String s : list) {
			lmap.put(s, map.get(s));
		}

		for (Map.Entry<String, Double> en : lmap.entrySet()) {
			System.out.println(en.getKey() + " : " + en.getValue());
		}

	}

	public static void main(String[] args) {

		HashMap<String, Double> map = new HashMap<>();
		map.put("Suraj", 89.5);
		map.put("Sahili", 90.0);
		map.put("Vaibhav", 78.6);
		map.put("Snehal", 92.0);
		map.put("Kishor", 78.9);

		keySort(map);

	}

}
