package com.hashmap;

import java.util.HashMap;

public class StudentHashMap {

	public static void main(String[] args) {

		HashMap<Integer, Student> smap = new HashMap<>();

		smap.put(1, new Student(101, "sahili", 85.0f));

		Student s1 = new Student(102, "Pratik", 90.2f);
		smap.put(2, s1);
		System.out.println(smap);

		// pratik replace by suraj
		smap.put(2, new Student(102, "Suraj", 90.2f));
		System.out.println(smap);

	}

}
