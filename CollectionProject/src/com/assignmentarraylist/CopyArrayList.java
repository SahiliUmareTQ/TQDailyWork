package com.assignmentarraylist;

import java.util.ArrayList;

public class CopyArrayList {

	public static void main(String[] args) {

		ArrayList<String> al1 = new ArrayList<>();

		al1.add("1");
		al1.add("2");
		al1.add("3");
		al1.add("4");

		System.out.println("Array list 1 : " + al1);

		ArrayList<String> al2 = new ArrayList<>();

		al2.add("A");
		al2.add("B");
		al2.add("C");
		al2.add("D");

		System.out.println("Array list 2 :" + al2);

		// Collections.copy(al1, al2); // list 2 copy hoti

		System.out.println("===============After copy============");
		System.out.println("Array list 1 :" + al1);
		System.out.println("Array list 2 :" + al2);

	}

}
