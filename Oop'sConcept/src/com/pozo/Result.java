package com.pozo;

import java.util.Scanner;

public class Result {

	public static void main(String[] args) {

		// default constructor
		Person c = new Person();

		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - ");

		// user input
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter person age");
		c.setPersonAge(sc.nextInt());

		System.out.println("Enter person id");
		c.setPersonId(sc.nextInt());

		System.out.println("Enter person name");
		c.setPersonName(sc.next());

		System.out.println("Enter person salary");
		c.setPersonSalry(sc.nextFloat());

		// System.out.println(
		// c.getPersonAge() + " " + c.getPersonId() + " " + c.getPersonNmae() + " " +
		// c.getPersonSalary() + " ");

		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - ");

		// para constructor
		Person cc = new Person(12, "Sahili", 500, 456000f);
		// System.out.println(cc);

		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - ");

		System.out.println(c); // to String

		sc.close();

	}

}
