package com.stringassignment;

import java.util.Scanner;

public class CheckVowels {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String input = sc.next();
		int vowels = 0;
		int consonant = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels++;
			} else if (ch >= 'a' && ch <= 'z') {
				consonant++;

			}
		}
		System.out.println("Enter the number of vowels :" + vowels);
		System.out.println("Enter the number of consonant :" + consonant);

	}
}