package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterateArrayList {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Java");
		list1.add("Pythan");
		list1.add("Java");
		list1.add("C++");
		System.out.println(list1);

		System.out.println("-------------1st way---------------");

		// 1st way
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}

		System.out.println("------------2nd way----------------");

		// 2nd way

		for (String s : list1) {
			System.out.println(s);
		}
		System.out.println("------------3rd way----------------");

		// 3rd way
		// cursor before the first element

		Iterator<String> itr = list1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("-------------4th way---------------");

		// 4th way

		ListIterator<String> a1 = list1.listIterator();
		while (a1.hasNext()) {
			System.out.println(a1.next());
		}

		System.out.println("-------------5th way---------------");

		// 5th way

		ListIterator<String> a2 = list1.listIterator(list1.size());
		while (a2.hasPrevious()) {
			System.out.println(a2.previous());
		}
	}

}
