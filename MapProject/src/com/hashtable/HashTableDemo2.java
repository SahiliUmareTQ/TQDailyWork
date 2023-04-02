package com.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo2 {

	public static void main(String[] args) {

		Hashtable<String, Float> hs = new Hashtable<>();

		// No null values and No null keys
		// synchronized

		hs.put("A", 50.0f);
		hs.put("B", 60.0f);
		hs.put("C", 70.0f);
		hs.put("D", 80.0f);

		Enumeration<String> en = hs.keys();

		while (en.hasMoreElements()) {
			String key = en.nextElement();
			System.out.println(key + " --> " + hs.get(key));
		}
	}

}
