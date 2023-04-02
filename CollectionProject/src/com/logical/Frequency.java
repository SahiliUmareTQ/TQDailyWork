package com.logical;

import java.util.ArrayList;

public class Frequency {

	public static void frequnecy(ArrayList<String> a1) {
		int count;
		for (int i = 0; i < a1.size(); i++) {
			count = 1;
			if (a1.get(i).equals("Visited"))

				continue;

			for (int j = i + 1; j < a1.size(); j++) {
				if (a1.get(i).equals(a1.get(j))) {
					a1.set(j, "Visited");
					count++;
				}
			}
			System.out.println(a1.get(i) + " :" + count);
		}

	}

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");

		frequnecy(list);
	}

}
