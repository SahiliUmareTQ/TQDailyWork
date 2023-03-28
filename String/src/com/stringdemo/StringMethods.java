package com.stringdemo;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {

		// 1) Length method
		String a = "sahili";
		System.out.println(a.length());

		// 2) .equals -----> It gives boolean ans
		String a1 = "sahili";
		System.out.println(a1.equals(a1));

		String s = "Sahili";
		System.out.println(s.equals(a1));

		// 3) .euqalsIgnoreCase -----> It will check only spelling
		String a2 = "SAHILI";
		System.out.println(a2.equalsIgnoreCase(a2));
		System.out.println(a2.equalsIgnoreCase(a1));

		// 4) .toUpperCase -------> convert into capital letters
		System.out.println(a.toUpperCase());

		// 5) .toLowerCase -------> convert into small letters
		System.out.println(a2.toLowerCase());

		// 6) .indexOf -----> It will gives the index of string
		System.out.println(a.indexOf('h'));

		// 7) .replace -----> replace old char with new char
		System.out.println(a.replace('h', 'y'));

		// 8) .replaceAll -----> replace all string
		String x = "Good Morning";
		String y = "GM";
		System.out.println(x.replaceAll(x, y));

		// 9) .replaceFirst ------> replace first string with new string
		String b = "Hello World";
		String c = "Hi World";
		System.out.println(b.replaceFirst(b, c));

		// 10) .endsWith'
		String str = "Sahili is my name";
		System.out.println(str.endsWith("me"));
		System.out.println(str.endsWith("ay"));

		// 11) .starstWith
		System.out.println(str.startsWith("Sa"));

		// 12) .concat
		String z = "umare";
		System.out.println(a.concat(z));

		// 13) .contains
		System.out.println(z.contains("m"));

		// 14) .Split
		String S = "I am sahili";
		String[] k = S.split("m");
		System.out.println(Arrays.toString(k));

	}

}
