package com.logical;

import java.util.ArrayList;

public class DuplicateArrayList {

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

		ArrayList<String> list = new ArrayList<>();

		list.add("A");
		list.add("C");
		list.add("B");
		list.add("A");
		list.add("C");
		list.add("A");

//		System.out.println(list);
//		System.out.println("Duplicate elements are:");
		RemoveDuplicate(list);

	}
}
