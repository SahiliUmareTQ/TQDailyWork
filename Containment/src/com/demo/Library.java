package com.demo;

public class Library {

	public static void main(String[] args) {

		Author a1 = new Author(1, "Sherlock Holmes", 56);
		Author a2 = new Author(2, "Shakespeare", 65);

		Book b1 = new Book(101, "The sign of Four", 500f, a1);
		Book b2 = new Book(102, "Study in Scarlet", 650f, a1);

		Book b3 = new Book(103, "Hamlet", 900f, a2);
		Book b4 = new Book(104, "Julius Ceaser", 1050f, a2);

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);

	}

}
