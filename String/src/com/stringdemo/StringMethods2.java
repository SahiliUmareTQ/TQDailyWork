package com.stringdemo;

public class StringMethods2 {

	public static void main(String[] args) {

		String s = "sahili";
		System.out.println(s.isEmpty());

		String s1 = "";
		System.out.println(s1.isEmpty());

		// count spaces also
		String ss = " ";
		System.out.println(ss.isEmpty());

		String s3 = "    sahili   ";
		System.out.println(s3.length()); // gives actual length

		System.out.println(s3.trim().length()); // remove spaces

	}

}
