package com.stringlogical;

import java.util.Arrays;

public class SearchWordinString {

	public static void searchWord(String str[]) {
		String searchWord = "banana";

		boolean found = false;
		for (String st : str) {
			if (st.equals(searchWord)) {
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println(str);
		}
	}

	public static void main(String[] args) {

		String[] st = { "apple", "banana", "orange", "grape" };

		System.out.println(Arrays.toString(st));

		searchWord(st);
	}

}
