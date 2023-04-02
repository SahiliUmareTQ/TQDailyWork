package com.encapsulation;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setId(100);
		s1.setName("sahili");
		s1.setAge(25);

		System.out.println(s1.getId() + " " + s1.getName() + " " + s1.getAge());

		Scanner sc = new Scanner(System.in);
		Student s2 = new Student();

		System.out.println("Enter id");
		s2.setId(sc.nextInt());

		System.out.println("Enter name");
		s2.setName(sc.next());

		System.out.println("Enter age");
		s2.setAge(sc.nextInt());

		// System.out.println(s1.getId() + "" + s1.getName() + "" + s1.getAge());

		sc.close();
	}

}
