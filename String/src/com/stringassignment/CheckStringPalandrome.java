package com.stringassignment;

import java.util.Scanner;

public class CheckStringPalandrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string ");
		String str = sc.next();
		String reverseStr = "";

		for (int i = (str.length() - 1); i >= 0; --i) {
			reverseStr = reverseStr + str.charAt(i);
		}

		if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
			System.out.println(str + " is a Palindrome String.");
		} else {
			System.out.println(str + " is not a Palindrome String.");
		}
	}

}
