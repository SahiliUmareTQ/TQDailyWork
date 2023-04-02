package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ValueSort {

	public static void valueSort(HashMap<String, Double> map) {
		ArrayList<Double> list = new ArrayList<>(map.values());

		Collections.sort(list);

		System.out.println(list);

		System.out.println("------------------------------");

		LinkedHashMap<String, Double> lmap = new LinkedHashMap<>();

		for (Double m : list) {
			for (Map.Entry<String, Double> en : map.entrySet()) {
				if (en.getValue() == m) {
					String k = en.getKey();
					if (!lmap.containsKey(k)) {
						lmap.put(k, m);
					}

				}

			}

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

		valueSort(map);

	}

}
