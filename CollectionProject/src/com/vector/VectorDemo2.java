package com.vector;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) {

		Vector<String> vr = new Vector<>();
		vr.add("A");
		vr.add("B");
		vr.add("C");
		vr.add("D");

		System.out.println(vr);

		System.out.println("-----------1st way---------------");

		for (int i = 0; i < vr.size(); i++) {
			System.out.println(vr.get(i));
		}
		System.out.println("-----------2nd way---------------");

		for (String s : vr) {
			System.out.println(s);
		}
		System.out.println("-----------3rd way---------------");

		Iterator<String> itr = vr.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

			System.out.println("-----------4th way---------------");

			ListIterator<String> itr1 = vr.listIterator();
			while (itr1.hasNext()) {
				System.out.println(itr1.next());
			}

			System.out.println("-----------5th way---------------");

			ListIterator<String> litr = vr.listIterator(vr.size());
			while (litr.hasPrevious()) {
				System.out.println(litr.previous());
			}

		}

	}
}