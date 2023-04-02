package com.customarraylist;

import java.util.ArrayList;

public class StudentArrayList {

	public static void main(String[] args) {

		ArrayList<Student> sList = new ArrayList<>();
		sList.add(new Student(101, "Sahili", 58.0f));
		sList.add(new Student(106, "Suraj", 80.0f));
		sList.add(new Student(103, "Pratik", 58.0f));
		sList.add(new Student(107, "Shraddha", 90.0f));
		sList.add(new Student(105, "Sahili", 69f));

		for (Student s : sList) {
			System.out.println(s);
		}

	}

}
