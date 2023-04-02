package com.sorting2;

import java.util.HashMap;

public class StudentCourseHashMap {

	public static void main(String[] args) {

		Course c1 = new Course(1, "Java");
		Course c2 = new Course(1, "Pythan");
		Course c3 = new Course(1, ".Net");

		HashMap<Student, Course> sMap = new HashMap<>();
		sMap.put(new Student(101, "Sahili", 89.0f), c3);
		sMap.put(new Student(101, "Suraj", 90.0f), c1);
		sMap.put(new Student(101, "Pratik", 85.0f), c2);
		sMap.put(new Student(101, "Snehal", 87.0f), c3);
		sMap.put(new Student(101, "Shradhda", 82.0f), c1);

	}

}
