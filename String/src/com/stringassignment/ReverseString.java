package com.stringassignment;

public class ReverseString {

	public static void revString(String str) {

		String splitstr[] = str.split("\\s");

		String revString = "";
		for (int i = 0; i < splitstr.length; i++) {
			for (int j = splitstr[i].length() - 1; j >= 0; j--) {
				revString = revString + splitstr[i].charAt(j);

			}
			revString = revString + " ";
		}
		System.out.println(revString);
	}

	public static void main(String[] args) {

		String st = "I am sahili";
		System.out.println(st);
		revString(st);

	}
}