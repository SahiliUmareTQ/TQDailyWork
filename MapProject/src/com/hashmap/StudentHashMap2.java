package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class StudentHashMap2 {

	public static void main(String[] args) {

		HashMap<Student, String> smap = new HashMap<>();

		smap.put(new Student(101, "Sahili", 90.5f), "Java");

		smap.put(new Student(102, "Pratik", 99.0f), "Pythan");

		for (Map.Entry<Student, String> en : smap.entrySet()) {

			System.out.println(en.getKey());

			System.out.println(en.getValue());

			System.out.println("-----------------``````--------------------------");
		}

		// smap.put(new Student(102, "Pratik", 99.0f), "Pythan");

		System.out.println("--------------////////-----------------------------");

		for (Map.Entry<Student, String> en : smap.entrySet()) {

			System.out.println(en.getKey());

			System.out.println(en.getValue());

			System.out.println("-------------------------------------------");
		}
	}

}
