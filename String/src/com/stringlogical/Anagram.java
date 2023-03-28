package com.stringlogical;

import java.util.Scanner;

public class Anagram {

	public static void sortArray(char ch[]) {
		char temp;
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				temp = ch[i];
				ch[i] = ch[j];
				ch[j] = temp;
			}
		}

	}

	public static boolean checkEquals(char ch1[], char ch2[]) {
		boolean status = false;
		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] != ch2[i]) {
				status = true;
				break;

			}

		}
		return status;

	}

	public static void checkAnagram(String str1, String str2) {
		boolean status = false;
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		{

			if (str1.length() == str2.length()) {
				char ch1[] = str1.toCharArray();
				char ch2[] = str2.toCharArray();

				// Arrays.sort(ch1);
				// Arrays.sort(ch2);

				sortArray(ch1);
				sortArray(ch2);

				// if (Arrays.equals(ch1, ch2))
				{
					if (checkEquals(ch1, ch2))
						status = true;
					System.out.println("The string is anagram");
				}

			}

			if (!status) {
				System.out.println("The string is not anagram");
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String s1 = sc.next();

		System.out.println("Enter second string");
		String s2 = sc.next();

		checkAnagram(s1, s2);

	}

}
