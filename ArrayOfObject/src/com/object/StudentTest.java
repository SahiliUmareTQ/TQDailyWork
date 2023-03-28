package com.object;

public class StudentTest {

	public static void main(String[] args) {

		Student st[] = new Student[5];

		st[0] = new Student(1, "sahili", 40);
		st[1] = new Student(2, "rani", 30);
		st[2] = new Student(3, "neha", 20);
		st[3] = new Student(4, "ram", 70);
		st[4] = new Student(5, "jay", 10);

		for (Student s : st) {
			System.out.println(s);
		}
	}

}
