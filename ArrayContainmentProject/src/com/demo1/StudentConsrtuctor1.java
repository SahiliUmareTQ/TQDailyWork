package com.demo1;

public class StudentConsrtuctor1 {

	public static void courseWiseStudent(Student[] st, Course cr[]) {

		for (Course c : cr) {
			System.out.println(c.getCname());
			System.out.println("-------------");
			for (Student s : st) {
				if (s.getCourse().equals(c))
					System.out.print(s.getName() + "  ");
			}
			System.out.println();
			System.out.println("================================");
		}

	}

	public static void courseWiseTotalStudent(Student[] st, Course cr[]) {
		int count;
		for (Course c : cr) {
			count = 0;

			for (Student s : st) {
				if (s.getCourse().equals(c))
					count++;
			}
			System.out.println(c.getCname() + " :" + count);
			System.out.println("=================================");

		}
	}

	public static void main(String[] args) {

		Course cr[] = new Course[3];

		cr[0] = new Course(1, "Java", 40000);
		cr[1] = new Course(2, "python", 80000);
		cr[2] = new Course(3, "c++", 50000);

		Student stud[] = new Student[6];
		stud[0] = new Student(101, "sahili", 25, cr[0]);
		stud[1] = new Student(102, "neha", 27, cr[1]);
		stud[2] = new Student(103, "rani", 22, cr[2]);
		stud[3] = new Student(104, "pranay", 26, cr[1]);
		stud[4] = new Student(105, "badal", 28, cr[0]);
		stud[5] = new Student(106, "swapnil", 31, cr[1]);

		for (Student s : stud) {
			System.out.println(s);
		}

		System.out.println();
		System.out.println("==============CourseWiseStudent=========================");
		courseWiseStudent(stud, cr);

		courseWiseTotalStudent(stud, cr);
	}

}
