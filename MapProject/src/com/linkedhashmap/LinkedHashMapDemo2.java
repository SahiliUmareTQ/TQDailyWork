package com.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo2 {

	public static void main(String[] args) {

		LinkedHashMap<String, Double> map = new LinkedHashMap<>();
		map.put("Sahili", 10.0);
		map.put("Amit", 20.0);
		map.put("Akshay", 30.0);
		map.put("Roy", 40.0);
		map.put(null, 0.0);

		for (Map.Entry<String, Double> en : map.entrySet()) {
			System.out.println(en.getKey() + " :" + en.getValue());
		}

		System.out.println("----------------------------");

		System.out.println("Marks of Sahili :" + map.get("Sahili"));

		System.out.println("Marks of Amit :" + map.get("Amit"));

	}

}
