package com.demo1;

import java.util.Scanner;

public class StudentGetterSeter {

	static Scanner sc = new Scanner(System.in);

	public static void enterDetails(Student s) {
		System.out.println("Enter student id");
		s.setId(sc.nextInt());

		System.out.println("Enter Student name");
		s.setName(sc.next());

		System.out.println("Enter student age");
		s.setAge(sc.nextInt());

		Course c = new Course();

		System.out.println("Enter course id");
		c.setCid(sc.nextInt());

		System.out.println("Enter course name");
		c.setCname(sc.next());

		System.out.println("Enter course fees");
		c.setFees(sc.nextDouble());

		s.setCourse(c);

	}

	public static void enterDetailsAnynomous(Student s) {
		System.out.println("Enter student id");
		s.setId(sc.nextInt());

		System.out.println("Enter Student name");
		s.setName(sc.next());

		System.out.println("Enter student age");
		s.setAge(sc.nextInt());

		s.setCourse(new Course());

		System.out.println("Enter course id");
		s.getCourse().setCid(sc.nextInt());

		System.out.println("Enter course name");
		s.getCourse().setCname(sc.next());

		System.out.println("Enter course fees");
		s.getCourse().setFees(sc.nextDouble());

	}

	public static void printDetails(Student st[]) {
		for (Student s : st) {
			System.out.println(s);
		}

	}

	public static void main(String[] args) {

		Student stud[] = new Student[3];
		for (int i = 0; i < stud.length; i++) {
			stud[i] = new Student();
			enterDetails(stud[i]);
		}
		printDetails(stud);

	}

}
