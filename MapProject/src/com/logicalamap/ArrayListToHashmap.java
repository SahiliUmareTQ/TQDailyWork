package com.logicalamap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayListToHashmap {

	public static void OccuranceOfLetter(ArrayList<String> a) {

		HashMap<String, Integer> map = new HashMap<>();
		for (String s : a)

			if (map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
			} else {
				map.put(s, 1);
			}
		for (Map.Entry<String, Integer> en : map.entrySet()) {
			System.out.println(en.getKey() + " :" + en.getValue());
		}
	}

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("A");
		list.add("C");
		list.add("B");
		list.add("A");
		list.add("A");
		list.add("C");
		list.add("D");

		System.out.println(list);

		OccuranceOfLetter(list);

	}

}
