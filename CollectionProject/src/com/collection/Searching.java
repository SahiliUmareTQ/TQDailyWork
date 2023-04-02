package com.collection;

import java.util.ArrayList;
import java.util.List;

public class Searching {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>();
		list1.add("Java");
		list1.add("C++");
		list1.add("Pythan");
		list1.add("Java");
		list1.add("Java");

		System.out.println(list1);
		System.out.println(list1.contains("Java"));

//		for (int i = 0; i < list1.size(); i++) {
//			if (list1.get(i).equals("Java"))
//				list1.set(i, "Core Java");
//		}
//
//		System.out.println(list1);

	}

}
