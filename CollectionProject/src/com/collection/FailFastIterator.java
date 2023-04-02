package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastIterator {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Java");
		list1.add("Pythan");
		list1.add("Java");
		list1.add("C++");
		list1.add("Angular");

		Iterator<String> itr = list1.iterator();
		while (itr.hasNext()) {
			if (itr.next().equals("Angular")) {

				// all.remove("Angular");
				// concurrentModification
				itr.remove();
			}
		}
		System.out.println(list1);
	}

}
