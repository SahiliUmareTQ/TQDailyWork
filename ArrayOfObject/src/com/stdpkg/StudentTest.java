package com.stdpkg;

public class StudentTest {

	public static float calPer(Student s) {
		float marks[];
		marks = s.getMarks();
		float per = 0.0f;
		for (float m : marks) {
			per += m;
		}
		per = (per / 500) * 100;
		return per;
	}

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setId(101);
		s1.setName("sahili");
		float m1[] = { 45.5f, 78.8f, 96.6f, 80.0f, 60.6f };
		s1.setMarks(m1);

		Student s2 = new Student();
		s2.setId(102);
		s2.setName("sayali");
		float m2[] = { 90f, 70f, 78.0f, 40f, 60f };
		s1.setMarks(m2);

		System.out.println("----------Student 1----------");
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println("Per :" + calPer(s1) + "%");

		System.out.println("----------Student 2---------");
		System.out.println(s2.getId());
		System.out.println(s2.getName());
		System.out.println("Per :" + calPer(s2) + "%");

	}

}
