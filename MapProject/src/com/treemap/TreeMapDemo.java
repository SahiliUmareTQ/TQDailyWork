package com.treemap;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		TreeMap<String, Integer> tMap = new TreeMap<>();
		tMap.put("Sahili", 1);
		tMap.put("Pratik", 2);
		tMap.put("Suraj", 3);

//		TreeMap<String, Integer> Map = new TreeMap<>();
//		Map.putAll(tMap);

		for (Entry<String, Integer> en : tMap.entrySet()) {
			System.out.println(en.getKey() + " : " + en.getValue());
		}

	}

}
