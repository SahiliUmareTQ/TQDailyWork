package com.custommap;

import java.util.HashMap;
import java.util.Map;

public class BookHashMpaDemo {

	public static void main(String[] args) {

		HashMap<Book, String> bMap = new HashMap<>();

		bMap.put(new Book(1, "The Secrete", 450.0f), "Religious");

		bMap.put(new Book(2, "Harry Potter", 900.0f), "Fiction");

		// System.out.println(bMap.put(new Book(2, "Harry Potter", 900.0f), "Fantacy"));
		// fiction print on first

		bMap.put(new Book(2, "Harry Potter", 900.0f), "Fantacy");

		for (Map.Entry<Book, String> en : bMap.entrySet()) {

			System.out.println(en.getKey() + " :" + en.getValue());
		}

	}

}
