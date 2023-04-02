package com.vector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentArraylist {

	public static void main(String[] args) {

		ArrayList<Student> slist = new ArrayList<>();
		slist.add(new Student(1, "Vaibhav", 89f));
		slist.add(new Student(5, "Pratik", 67f));
		slist.add(new Student(3, "Vivek", 99f));
		slist.add(new Student(2, "Snehal", 67f));

		Iterator<Student> itr = slist.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		Collections.sort(slist, new MarksComparator());

		System.out.println("===============================");

		for (Student s : slist) {
			System.out.println(s);
		}

	}

}
