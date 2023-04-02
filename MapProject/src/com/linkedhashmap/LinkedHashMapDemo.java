package com.linkedhashmap;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		LinkedHashMap<String, Double> lMap = new LinkedHashMap<>();
		lMap.put("Sahili", 80.0);
		lMap.put("Suraj", 90.0);
		lMap.put("Pratk", 70.0);
		lMap.put("Dhiraj", 99.0);
		lMap.put("Amit", 100.0);
		lMap.put(null, 0.0);
		// maintain insertion order
		for (Map.Entry<String, Double> en : lMap.entrySet()) {
			System.out.println(en.getKey() + " " + en.getValue());
		}

		System.out.println("----------------------------------");
		// keys

		Set<String> names = lMap.keySet();
		Iterator<String> itr = names.iterator();
		while (itr.hasNext()) {
			// String k = itr.next();
			// System.out.println(k + " " + lMap.get(k));
			System.out.println(itr.next());
		}

		System.out.println("----------------------------------");
		// values

		Collection<Double> marks = lMap.values();
		Iterator<Double> itr1 = marks.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		System.out.println("----------------------------------");

		System.out.println("Marks of Amit :" + lMap.get("Amit"));

	}

}
