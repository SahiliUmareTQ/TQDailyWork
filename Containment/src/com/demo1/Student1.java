package com.demo1;

public class Student1 {

	public static void main(String args[]) {

		Course c1 = new Course(101, "python", 30000.0);

		Course c2 = new Course(102, "java", 40000.0);

		Student s1 = new Student(1, "sahili", 25, new Course(102, "java", 40000.0));

		System.out.println(s1);

		Student s2 = new Student(2, "sayali", 25);

		System.out.println(s2);

		s2.setCourse(c2);
		System.out.println(s2);

	}
}