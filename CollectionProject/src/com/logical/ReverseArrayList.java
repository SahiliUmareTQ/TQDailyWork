package com.logical;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);

		System.out.println("Before reverse");
		System.out.println(list);

		Collections.reverse(list);
		System.out.println("After reverse");
		System.out.println(list);
	}

}
