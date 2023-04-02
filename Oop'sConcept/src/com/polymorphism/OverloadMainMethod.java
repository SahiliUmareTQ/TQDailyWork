package com.polymorphism;

public class OverloadMainMethod {

	// JVM can only call original main method

	public static void main(String[] args) {

		System.out.println("Hiiiii");
	}

	public static void main(int x) {

		System.out.println("Hello");

	}

}
