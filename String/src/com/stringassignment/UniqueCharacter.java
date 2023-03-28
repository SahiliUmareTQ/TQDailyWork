package com.stringassignment;

public class UniqueCharacter {

	public static void uniqueString(String str1[], String str2[]) {
		boolean found;
		for (String st : str2) {
			found = false;
			for (String si : str1) {
				if (st.equals(si)) {
					found = true;
					break;
				}

			}
			if (!found) {
				System.out.println(st);
			}

		}

	}

	public static void main(String[] args) {

		String s1[] = { "Sam", "Amit", "Suraj", "Mala", "Abhi" };

		String s2[] = { "Guru", "Sneha", "Amit", "Sahili", "Abhi" };

		uniqueString(s1, s2);
	}

}
