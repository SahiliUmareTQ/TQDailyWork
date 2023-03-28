package com.demo;

import java.util.Scanner;

public class LibraryInput3 {

	static Scanner sc = new Scanner(System.in);

	public static void enterBookDetails(Book b) {
		Author au = new Author();
		System.out.println("Enter book id:");
		b.setId(sc.nextInt());

		System.out.println("Enter book name:");
		b.setName(sc.next());

		System.out.println("Enter book price:");
		b.setBPrice(sc.nextFloat());

		authorDetails(au);
		b.setAuthor(au);

	}

	public static void authorDetails(Author a) {
		System.out.println("Enter author id:");
		a.setAuthorId(sc.nextInt());

		System.out.println("Enter author name:");
		a.setAuthorName(sc.next());

		System.out.println("Enter author age:");
		a.setAuthorAge(sc.nextInt());
	}

	public static void main(String[] args) {

		Book b1 = new Book();
		enterBookDetails(b1);
		System.out.println(b1);

		Book b2 = new Book();
		enterBookDetails(b2);
		System.out.println(b2);

		Author a1 = new Author();
		authorDetails(a1);

	}

}
