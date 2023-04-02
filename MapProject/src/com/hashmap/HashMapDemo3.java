package com.hashmap;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo3 {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();
		map.put("Sahili", 90);
		map.put("Suraj", 75);
		map.put("Pratik", 80);
		map.put("Snehal", 99);

		System.out.println(map);

		Set<String> keyset = map.keySet();
		// for()

	}

}
