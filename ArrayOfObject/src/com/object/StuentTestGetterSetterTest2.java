package com.object;

import java.util.Scanner;

public class StuentTestGetterSetterTest2 {

	static Scanner sc = new Scanner(System.in);

	public static void enterDetails(Student s)

	{
		System.out.println("Enter the id :");
		s.setId(sc.nextInt());

		System.out.println("Enter the name :");
		s.setName(sc.next());

		System.out.println("Enter the marks");
		s.setMarks(sc.nextFloat());

	}

//	public static void printDetails(Student st[]) {
//		for (Student s : st) {
//			System.out.println(s);
//		}
//	}

	public static void main(String[] args) {
		Student[] stud = new Student[3];

		for (int i = 0; i < stud.length; i++) {
			stud[i] = new Student();

			enterDetails(stud[i]);
		}
		// printDetails(stud);
	}

}
