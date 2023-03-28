package com.stringlogical;

public class UniqueString {

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

		String s1[] = { "Shuruti", "Ajay", "Suraj", "Mamta", "Vinod" };

		String s2[] = { "Gaurav", "Sharukh", "Ajay", "Sahili", "Vinod" };

		uniqueString(s1, s2);
	}

}
