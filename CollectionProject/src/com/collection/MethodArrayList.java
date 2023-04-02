package com.collection;

import java.util.ArrayList;

public class MethodArrayList {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Java");
		list1.add("Pythan");
		list1.add("Java");
		list1.add("C++");
		System.out.println(list1);

		list1.add(1, ".Net");
		System.out.println(list1);

		ArrayList<String> a1 = new ArrayList<>();
		a1.add("vb.net");
		a1.add("asp.net");
		System.out.println(a1);

		list1.addAll(a1);
		System.out.println(list1);

	}

}
