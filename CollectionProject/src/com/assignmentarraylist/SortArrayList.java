package com.assignmentarraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(101);
		list.add(30);
		list.add(43);
		list.add(70);
		list.add(8);
		list.add(10);
		list.add(1);
		list.add(45);

		System.out.println("Before sorting :");
		System.out.println(list);

		System.out.println("===========================");

		Collections.sort(list);
		System.out.println("After sorting :");
		System.out.println(list);

		System.out.println("====================");

		System.out.println("Reverse sort :");
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);

	}

}
