package com.object;

import java.util.Scanner;

public class StudentTestGetterSetter1 {

	public static void main(String[] args) {

		Student stud[] = new Student[3];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < stud.length; i++) {
			stud[i] = new Student();

			System.out.println("Enter id :");
			stud[i].setId(sc.nextInt());

			System.out.println("Enter name");
			stud[i].setName(sc.next());

			System.out.println("Enter marks");
			stud[i].setMarks(sc.nextFloat());

		}

		for (Student s : stud) {
			System.out.println(s);
		}
	}

}
