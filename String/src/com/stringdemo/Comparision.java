package com.stringdemo;

public class Comparision {

	public static void main(String[] args) {

		// check reference
		String s1 = "Sahili";
		String s2 = new String("sahili");

		System.out.println("==:" + (s1 == s2));
		System.out.println("equals:" + s1.equals(s2));

		String s3 = "Sahili"; // check values

		System.out.println("==:" + (s1 == s3));
		System.out.println("equals:" + s1.equals(s3));

		// check reference
		String s4 = new String("Sahili");
		System.out.println("==:" + (s1 == s4));
		System.out.println("equals:" + s1.equals(s4));

		// both have same content so its true
		if (s1 == s3) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Both are not equal");
		}

		// both have not same content so its false
		if (s1 == s2) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Both are not equal");
		}

		// both have same content so its true
		if (s1.equals(s3)) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Both are not equal");
		}

	}

}
