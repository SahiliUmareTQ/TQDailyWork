package com.demo;

public class BookConstructor {

	public static void main(String[] args) {

		Book b[] = new Book[3];

		Author au1[] = new Author[3];

		au1[0] = new Author(101, "sahili");
		au1[1] = new Author(102, "Badal");
		au1[2] = new Author(103, "Swapnil");

		b[0] = new Book(1, "XYZ", 456.0f, au1);

		Author au2[] = new Author[3];

		au2[0] = new Author(100, "Neha");
		au2[1] = new Author(200, "Rani");
		au2[2] = new Author(300, "Pranay");

		b[1] = new Book(1, "ABC", 500.0f, au2);

		Author au3[] = new Author[3];

		au3[0] = new Author(150, "Ram");
		au3[1] = new Author(250, "Dhiraj");
		au3[2] = new Author(400, "Shyam");

		b[2] = new Book(1, "PQR", 900.0f, au3);

		for (Book bk : b) {
			System.out.println(bk.getId() + " " + bk.getName() + " " + bk.getBPrice());
			for (Author a : bk.getAuthor()) {
				System.out.println(a);
			}
			System.out.println("===============================================");
		}
	}

}
