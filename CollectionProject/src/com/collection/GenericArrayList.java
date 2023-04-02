package com.collection;

import java.util.ArrayList;
import java.util.List;

public class GenericArrayList {

	public static void main(String[] args) {

		// Generic menas same data type

		List<String> list1 = new ArrayList<>();
		list1.add("Hi");
		list1.add("Hello");
		list1.add("Good Morning");
		list1.add("Everyone");

		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));

		}

	}

}
