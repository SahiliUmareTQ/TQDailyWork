package com.logical;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ReverseArrayList2 {

	public static void reverseList(ArrayList<String> list) {
		Iterator<String> itr = list.iterator();
		ListIterator<String> litr = list.listIterator(list.size());

		String temp;
		for (int i = 0, j = list.size() - 1; i < list.size() / 2; i++, j--) {
			temp = list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);

		}

		System.out.println(list);

	}

	public static void main(String[] args) {

		ArrayList<String> a1 = new ArrayList<>();
		a1.add("Java");
		a1.add("Pythan");
		a1.add("Java");
		a1.add("C++");
		a1.add("Spring");

		reverseList(a1);
	}

}
