package com.stringassignment;

public class FeqOfWord {

	public static void freqWord(String st) {

		st = st.toLowerCase();
		String splitstr[] = st.split("\\s"); // for spaces

		int count = 0;
		for (int i = 0; i < splitstr.length; i++) {
			count = 1;
			if (splitstr[i].equals("Visited"))
				continue;
			for (int j = i + 1; j < splitstr.length; j++) {
				if (splitstr[i].equals(splitstr[j])) {
					count++;
					splitstr[j] = "Visited";
				}
			}
			System.out.println(splitstr[i] + " :" + count);
		}

	}

	public static void main(String[] args) {

		String str = "A big cat is rolling on a big mat";

		freqWord(str);

	}

}
