package com.demo;

public class Library2 {

	public static void main(String[] args) {

		Book b1 = new Book(101, "The sign of Four", 500f, new Author(1, "Sherlock Holmes", 56));
		Book b2 = new Book(102, "Study in Scarlet", 650f, new Author(1, "Sherlock Holmes", 56));

		Book b3 = new Book(103, "Hamlet", 900f, new Author(2, "Shakespeare", 65));
		Book b4 = new Book(104, "Julius Ceaser", 1050f, new Author(2, "Shakespeare", 65));

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);

	}

}
