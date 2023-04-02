package com.custommap;

import java.util.HashMap;
import java.util.Map;

public class BookHashMpaDemo2 {

	public static void main(String[] args) {

		HashMap<Book, Author> bMap = new HashMap<>();

		Book b1 = new Book(101, "The Secrete", 500.0f);

		bMap.put(b1, new Author(1, "XYZ"));

		Book b2 = new Book(102, "Harry Potter", 1000.0f);

		bMap.put(b2, new Author(2, "J.K Rowlig"));

		bMap.put(new Book(103, "Ramayan", 200.0f), new Author(1, "Valmiki"));

		System.out.println(bMap.put(new Book(103, "Ramayan", 200.0f), new Author(1, " A.Valmiki")) + "-------");

		bMap.put(new Book(104, "Ramayan2", 500.0f), new Author(1, "Valmiki"));

		for (Map.Entry<Book, Author> en : bMap.entrySet()) {
			System.out.println(en.getKey() + " :" + en.getValue());
		}

	}

}
