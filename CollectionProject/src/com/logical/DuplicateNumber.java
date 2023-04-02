package com.logical;

import java.util.ArrayList;

public class DuplicateNumber {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("A");
		list.add("C");
		// list.add("B");
		list.add("A");
		list.add("C");
		list.add("A");

		ArrayList<String> list2 = new ArrayList<>();
		for (String s : list) {
			if (!list2.contains(s)) {
				list2.add(s);
			}
		}
		System.out.println(list2);
	}

}
