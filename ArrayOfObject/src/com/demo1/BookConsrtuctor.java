package com.demo1;

public class BookConsrtuctor {

	public static void main(String[] args) {

		Book b[] = new Book[3];
		b[0] = new Book(1, "abc", 120.5f);
		b[1] = new Book(2, "abc", 120.5f);
		b[2] = new Book(3, "abc", 120.5f);

		for (Book bk : b) {
			System.out.println(bk);
		}
	}

}
