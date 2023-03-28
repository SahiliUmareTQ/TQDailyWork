package com.stringdemo;

public class StringImmutable {

	public static void main(String[] args) {

		String x = "Hello";
		System.out.println(x);
		x.concat("World");
		System.out.println(x);

		System.out.println(x.concat("World"));

	}

}
