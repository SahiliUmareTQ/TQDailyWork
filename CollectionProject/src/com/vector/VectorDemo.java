package com.vector;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<String> colours = new Vector<>(9, 5);
		System.out.println("Size:" + colours.size());
		System.out.println("Capacity:" + colours.capacity());

		colours.add("Blue");
		colours.addElement("Green"); // legacy method(no more in use )
		colours.add("Yellow");
		colours.add("Black");
		colours.add("Pink");
		colours.add("Blue");
		colours.add("Green");
		colours.addElement("Green");
		colours.add("Black");
		colours.add("Pink");
		colours.add("Brown");

		System.out.println("Size:" + colours.size());
		System.out.println("Capacity:" + colours.capacity());

		colours.add("Pink");
		colours.ensureCapacity(20); // min capacity to maintain

		System.out.println("Size:" + colours.size());
		System.out.println("Capacity:" + colours.capacity());

		System.out.println("---------------------");

		System.out.println(colours.get(4));

		System.out.println(colours.elementAt(4));

		System.out.println(colours.set(4, "Red"));

		System.out.println(colours);
	}

}
