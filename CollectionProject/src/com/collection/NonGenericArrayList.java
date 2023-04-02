package com.collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericArrayList {

	public static void main(String[] args) {

		// Non generic means all types of data

		List list1 = new ArrayList<>();
		list1.add(10);
		list1.add("Sahili");
		list1.add(50.0f);
		list1.add('a');

		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
			int data = (int) list1.get(i) + 10;
			list1.set(i, data);
		}
		System.out.println(list1);
	}

}
