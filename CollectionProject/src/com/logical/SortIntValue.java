package com.logical;

import java.util.ArrayList;
import java.util.Collections;

public class SortIntValue {

	public static void sortArrayList(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) < list.get(j)) {
					int temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);

				}
			}
		}
	}

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);

		// System.out.println(a);

		Collections.sort(a);
//		System.out.println(a);

		Collections.sort(a, Collections.reverseOrder());
		System.out.println(a);

	}

}
