package com.logical;

import java.util.ArrayList;

public class RemoveDuplicate {

	public static void RemoveDuplicate(ArrayList<String> list1) {

		ArrayList<String> list2 = new ArrayList<>();
		for (String s : list1) {
			if (!list2.contains(s)) {
				list2.add(s);
			}
		}
		System.out.println(list2);

	}

	public static void main(String[] args) {

		ArrayList<String> a1 = new ArrayList<>();
		a1.add("A");
		a1.add("B");
		a1.add("C");
		a1.add("D");
		a1.add("E");
		a1.add("A");
		a1.add("B");
		a1.add("C");

		RemoveDuplicate(a1);
	}

}
