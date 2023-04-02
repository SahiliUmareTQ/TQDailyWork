package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionToArrayConversion {

	public static void main(String[] args) {

		String[] colour = { "Red", "Black", "White", "Blue" };
		// System.out.println(colour); it gives hash code

		// 1st way

		List<String> s1 = Arrays.asList(colour);
		System.out.println(s1);

		// 2nd way
		ArrayList<String> a1 = new ArrayList<>(Arrays.asList(colour));

		// 3Rrd way

		ArrayList<String> a2 = new ArrayList<>();
		Collections.addAll(a2, colour);
		System.out.println(a2);

		// converting ArrayList into Array

		Object[] col = a2.toArray();
		System.out.println(Arrays.toString(col));
		for (int i = 0; i < col.length; i++) {
			col[i] = ((String) col[i]).concat(" colour");

		}
		System.out.println(Arrays.toString(col));

		// type safe
		String cols[] = new String[a2.size()];
		a2.toArray(cols);

		for (int i = 0; i < cols.length; i++) {
			cols[i] = ((String) cols[i]).concat(" Name");

		}
		System.out.println(Arrays.toString(cols));
	}

}
