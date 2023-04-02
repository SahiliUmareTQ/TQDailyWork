package com.polymorphism;

public class Demo2 {

	public int method1(int a) {
		return a;
	}

	/*
	 * void method1(int a) { System.out.println(a); }
	 */

	protected float method2(float b) {
		return b;
	}

	public static void main(String[] args) {

		Demo2 a = new Demo2();
		a.method1(12);
		a.method2(20f);

	}

}
