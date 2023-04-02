package com.hashmap;

import java.util.HashMap;

public class HashMapDemo2 {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<>();
		map.put("Maharashtra", "Mumbai");
		map.put("Assam", "Dispur");
		map.put("Andhra Pradesh", "Amaravati");
		map.put("Arunachal Pradesh", "Itanagar");
		map.put("Bihar", "Patna");

		System.out.println(map);
	}

}
