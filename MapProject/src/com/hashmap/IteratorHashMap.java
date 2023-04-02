package com.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IteratorHashMap {

	public static void main(String[] args) {

		HashMap<String, Double> map = new HashMap<>();
		map.put("Sahili", 90.2);
		map.put("Suraj", 75.0);
		map.put("Pratik", 80.5);
		map.put("Snehal", 99.3);

		System.out.println(map);

		System.out.println();

		System.out.println("---------------All Keys-----------------------");

		// All keys
		Set<String> keyset = map.keySet();
		for (String s : keyset) {
			System.out.println(s);
		}

		System.out.println("---------------All Values-----------------------");
		// All value

		Collection<Double> marks = map.values();
		for (Double m : marks) {
			System.out.println(m);
		}

		System.out.println("----------------Key Value Pair----------------------");
		// key value pair

		Iterator<String> itr = keyset.iterator();
		while (itr.hasNext()) {
			String k = itr.next();
			System.out.println(k + " :" + map.get(k));
		}
		System.out.println("-----------------Key Value Pair---------------------");
		// key value pair

		for (Map.Entry<String, Double> en : map.entrySet()) {
			System.out.println(en.getKey() + " :" + en.getValue());
		}

		System.out.println("----------------Key Value Pair----------------------");
		// key value pair

		Set<Entry<String, Double>> entries = map.entrySet();
		for (Entry<String, Double> e : entries) {
			System.out.println(e.getKey() + " :" + e.getValue());
		}
	}

}
