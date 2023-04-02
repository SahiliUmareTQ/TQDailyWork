package com.logical;

import java.util.ArrayList;

public class UniqueArrayList {

	public static void findUnique(ArrayList<String> al) {
		int count;
		for (int i = 0; i < al.size(); i++) {
			count = 1;
			if (al.get(i).equals("visited"))
				continue;
			for (int j = i + 1; j < al.size(); j++) {
				if (al.get(i).equals(al.get(j))) {
					al.set(j, "visited");
					count++;
				}
			}
			if (count == 1)
				System.out.println(al.get(i));
		}

	}

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("A");
		list.add("C");
		list.add("B");
		list.add("A");
		list.add("C");
		list.add("A");

		System.out.println(list);
		System.out.println("Unique elements are:");
		findUnique(list);

	}

}
