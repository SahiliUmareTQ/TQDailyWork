package com.stringassignment;

public class ReplaceVowel {

	public static void replaceV(String st) {
		st = st.toLowerCase();
		char ch1[] = st.toCharArray();
		for (int i = 0; i < ch1.length; i++) {
			if ((ch1[i] == 'a') || (ch1[i] == 'e') || (ch1[i] == 'i') || (ch1[i] == 'o') || (ch1[i] == 'u')) {

				ch1[i] = '#';
			}
		}

		st = ch1.toString();
		System.out.println(ch1);
	}

	public static void main(String[] args) {

		String str = "Sahili";
		System.out.println("Original string:" + str);
		replaceV(str);
		System.out.println("Encoded String");

	}
}
