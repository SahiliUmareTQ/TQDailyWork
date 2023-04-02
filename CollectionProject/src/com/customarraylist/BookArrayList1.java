package com.customarraylist;

import java.util.ArrayList;

public class BookArrayList1 {

	public static void main(String[] args) {

		ArrayList<Book> blist = new ArrayList<>();
		blist.add(new Book(101, "Halmet", 456.0f));
		blist.add(new Book(109, "Ramayan", 900.0f));
		blist.add(new Book(107, "Geeta", 600f));
		blist.add(new Book(107, "HarryPotter", 1300f));
		blist.add(new Book(104, "The secrete", 850.0f));

		for (Book b : blist) {
			System.out.println(b);
		}

		// Collections.sort(blist);

		System.out.println("-----------------");

		for (Book b : blist) {
			System.out.println(b);
		}
	}

}
