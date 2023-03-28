package com.demo1;

public class StudentConstructor {

	public static void main(String[] args) {

		Course c1 = new Course(1, "Java", 8000);
		Course c2 = new Course(2, "Python", 10000);

		Student stud[] = new Student[4];

		stud[0] = new Student(101, "Snehal", 22, c1);
		stud[1] = new Student(102, "Partik", 22, c2);
		stud[2] = new Student(103, "Vaibhav", 22, c2);
		stud[3] = new Student(104, "Shradha", 22, c1);

		for (Student s : stud) {
			System.out.println(s);
		}

	}

}
