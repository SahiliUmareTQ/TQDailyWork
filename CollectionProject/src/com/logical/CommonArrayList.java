package com.logical;

import java.util.ArrayList;

public class CommonArrayList {

	public static void commonElement(ArrayList<String> list1, ArrayList<String> list2) {
		System.out.println(list1);
		System.out.println(list2);

		for (String s : list1) {
			if (list2.contains(s)) {
				System.out.println(s);
			}
		}

	}

	public static void main(String[] args) {

		ArrayList<String> a1 = new ArrayList<>();
		a1.add("A");
		a1.add("B");
		a1.add("C");
		a1.add("D");
		a1.add("E");

		// System.out.println("First list:" + a1);

		ArrayList<String> a2 = new ArrayList<>();
		a2.add("F");
		a2.add("A");
		a2.add("G");
		a2.add("B");
		a2.add("H");

//		System.out.println("Second list:" + a2);

		// by using method

//		a1.retainAll(a2);
//		System.out.println("Common elements are " + a1);

		// by using logic
		commonElement(a1, a2);
	}

}
