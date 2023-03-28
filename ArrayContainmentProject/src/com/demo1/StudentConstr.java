package com.demo1;

public class StudentConstr {

	public static void main(String[] args) {

		Student1 stud[] = new Student1[3];

		float m1[] = { 45, 60, 35 };
		stud[0] = new Student1(1, "sahili", m1);

		float m2[] = { 82, 73, 90 };
		stud[1] = new Student1(2, "neha", m2);

		float m3[] = { 87, 50, 91 };
		stud[2] = new Student1(2, "rani", m3);

		for (Student1 s : stud) {
			System.out.println(s);
		}
	}

}
