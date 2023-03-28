package com.demo1;

import java.util.Scanner;

public class StudentGetterSetter1 {

	static Scanner sc = new Scanner(System.in);

	public static void enterDetails(Student s) {
		System.out.println("Enter student id:");
		s.setId(sc.nextInt());

		System.out.println("Enter name:");
		s.setName(sc.next());

		float m[] = new float[3];

		System.out.println("Enter marks of 3 subject");
		for (int i = 0; i < m.length; i++) {
			m[i] = sc.nextFloat();

		}
		s.setMarks(m);

	}

	public static void main(String[] args) {

		Student stud[] = new Student[3];
		for (int i = 0; i < stud.length; i++) {
			stud[i] = new Student();
			enterDetails(stud[i]);
		}

		for (Student s : stud) {
			System.out.println(s);
		}

	}

}
