package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortKeys1 {

	public static void keySort(HashMap<String, Double> map) {

		ArrayList<String> list = new ArrayList<>();
		Collections.sort(list);

		// System.out.println(list);

		LinkedHashMap<String, Double> lMap = new LinkedHashMap<>();
		for (String s : list) {
			lMap.put(s, map.get(s));
		}

		for (Map.Entry<String, Double> en : lMap.entrySet()) {
			System.out.println(en.getKey() + " :" + en.getValue());
		}
	}

	public static void main(String[] args) {

		HashMap<String, Double> lMap = new HashMap<>();
		lMap.put("Sahili", 90.0);
		lMap.put("Pratik", 99.0);
		lMap.put("Suraj", 80.0);
		lMap.put("Shradhha", 89.0);

		keySort(lMap);

	}

}
