package com.stringassignment;

public class LengthofString {

	public static void main(String[] args) {

		String s1 = "sahili";
		String s2 = "sahili";
		System.out.println(s1.length());

		System.out.println(s1.concat("umare"));

		System.out.println(s1 == s2);

		System.out.println(s1.equals(s2));

		String s3 = new String("sahili");
		System.out.println(s1 == s3);

		System.out.println(s1.toUpperCase());

		System.out.println(s2.toLowerCase());

		String st = "HELLO$WORLD";
		st.split(st);
		System.out.println(st);

	}

}
