package com.stringassignment;

import java.util.Arrays;

public class SplitString {
	public static void divideString(String st) {
		int len = st.length();
		int n = 2; // number of substring

		int noOfChars = len / n;

		if (len % n != 0) {
			System.out.println("Cannot divide the string");
		}

		else {
			String splitstr[] = new String[n];
			int index = 0; // index of substring

			for (int i = 0; i < st.length(); i += noOfChars) {
				splitstr[index] = st.substring(i, i + noOfChars);
				index++;
			}

			System.out.println(Arrays.toString(splitstr));
		}

	}

	public static void main(String[] args) {

		String str = "Sahili";
		divideString(str);

	}
}
