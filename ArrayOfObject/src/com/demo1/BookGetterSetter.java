package com.demo1;

import java.util.Scanner;

public class BookGetterSetter {

	static Scanner sc = new Scanner(System.in);

	public static void enterBookDetails(Book b) {
		System.out.println("Enter bookid");
		b.setBookid(sc.nextInt());

		System.out.println("Enter book name");
		b.setBookname(sc.next());

		System.out.println("Enter book price");
		b.setBookprice(sc.nextFloat());

	}

	public static void main(String[] args) {

		Book b[] = new Book[5];
		for (int i = 0; i < b.length; i++) {
			b[i] = new Book();
			enterBookDetails(b[i]);

		}

	}

}
