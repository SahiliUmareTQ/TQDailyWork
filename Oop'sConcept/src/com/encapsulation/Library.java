package com.encapsulation;

import java.util.Scanner;

public class Library {

	public static void main(String[] args) {

		Book b1 = new Book();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Bookid");
		b1.setBookId(sc.nextInt());

		System.out.println("Enter Bookname");
		b1.setBookName(sc.next());

		System.out.println("Enter Author ");
		b1.setAuthor(sc.next());

		System.out.println("Enter Price");
		b1.setPrice(sc.nextFloat());

		// System.out.println(b1.getBookId() + "" + b1.getBookName() + "" +
		// b1.getAuthor() + "" + b1.getPrice());

		System.out.println(b1); // toString

		sc.close();
	}

}
