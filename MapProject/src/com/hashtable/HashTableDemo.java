package com.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {

		Hashtable<Integer, String> hs = new Hashtable<>();

		// No null values and No null keys
		// synchronized

		hs.put(1, "Sahili");
		hs.put(2, "Pratik");
		hs.put(3, "Suraj");

		Enumeration<Integer> en = hs.keys();

		// Collection<String> name = hs.values();

		while (en.hasMoreElements()) {
			int key = en.nextElement();
			System.out.println(key + " " + hs.get(key));
		}
	}

}
