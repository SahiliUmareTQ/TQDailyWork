package com.assignmentarraylist;

import java.util.ArrayList;

public class CompairingArrayList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();

		al.add("Pratik");
		al.add("Suraj");
		al.add("Sahili ");
		al.add("Prasanna");

		System.out.println(al);

		ArrayList<String> al2 = new ArrayList<>();

		al2.add("Pratik");
		al2.add("Suraj");
		al2.add("Sahili ");
		al2.add("Prasanna");

		System.out.println(al2);

		System.out.println("-----------------------------");

		boolean equal = al.equals(al2);
		System.out.println(equal);

		for (int i = 0; i < al.size(); i++) {
			if (al.get(i).equals(al2.get(i))) {
				System.out.print(al.get(i) + " ");
			}
		}

	}

}
