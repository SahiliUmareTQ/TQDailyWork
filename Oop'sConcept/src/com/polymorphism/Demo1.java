package com.polymorphism;

public class Demo1 {

	void addition(int a, int b) {
		System.out.println("Method 1");
		System.out.println("Sum:" + (a + b));
	}

	void addition(int a, int b, int c) {
		System.out.println("Method 2");
		System.out.println("Sum:" + (a + b + c));
	}

	void addition(float a, float b) {
		System.out.println("Method Float");
		System.out.println("Sum:" + (a + b));
	}

	void addition(int a, float b) {
		System.out.println("Method Float 1");
		System.out.println("Sum:" + (a + b));
	}

	void addition(float a, int b) {
		System.out.println("Method Float 2");
		System.out.println("Sum:" + (a + b));
	}

	public static void main(String[] args) {

		Demo1 p1 = new Demo1();
		p1.addition(12, 56, 200); // method2
		p1.addition(85f, 2f); // method float
		p1.addition(6, 31f); // method float1

	}
}
