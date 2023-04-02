package com.polymorphism;

public class Ambiguity {

	static void display(int a, double d) {
		System.out.println("Method1");
		System.out.println(a + d);
	}

	static void display(long l, float f) {
		System.out.println("Method12");
		System.out.println(l + f);
	}

	public static void main(String[] args) {

		display(10, 10.0); // Ambigious

	}

}
