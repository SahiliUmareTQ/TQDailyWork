package com.stringassignment;

public class ReverseEachWord {

	public static void reverseWord(String st) {
		String words[] = st.split(" ");

		String revString = " ";

		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String revWord = "";

			for (int j = word.length() - 1; j >= 0; j--) {
				revWord = revWord + word.charAt(j); // avaj

			}
			revString = revString + revWord + " ";
		}
		System.out.println(revString);
	}

	public static void main(String[] args) {

		String st = "Java Programs";

		reverseWord(st);

	}

}
