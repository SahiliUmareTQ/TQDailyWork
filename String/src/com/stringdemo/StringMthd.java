package com.stringdemo;

public class StringMthd {

	public static void main(String[] args) {

		String s = "Sahili hi";
		String x = "umare";
		// length
		System.out.println(s.length());

		// concat
		System.out.println(s.concat(x));

		// charAt
		String s1 = "java is fun";
		System.out.println(s1.charAt(1));

		System.out.println(s1.length() - 1);

		// endswith
		System.out.println(s.endsWith("hi"));

		// startswith
		System.out.println(s1.startsWith("java"));

		// uppercase
		System.out.println(x.toUpperCase());

		// lowercase
		String z = "hi";
		System.out.println(z.toLowerCase());

		// substring
		System.out.println(s1.substring(4, 6));

		// indexof
		System.out.println(s1.indexOf('v'));

		// lastindexof
		System.out.println(s1.lastIndexOf("fun"));
	}

}
