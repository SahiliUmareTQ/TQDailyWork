package com.stringassignment;

public class FirstOccuranceOfWord {

	static int countOccurrences(String str, String word) {
		// split the string by spaces in a
		String a[] = str.split(" ");

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			// if match found increase count
			if (word.equals(a[i]))
				count++;
		}

		return count;
	}

	public static void main(String args[]) {
		String str = "Hi everyone good evening ";
		String word = "good";
		System.out.println(countOccurrences(str, word));
	}
}
