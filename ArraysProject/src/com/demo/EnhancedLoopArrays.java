package com.demo;

public class EnhancedLoopArrays {

	public static void main(String[] args) {
		int arr[] = { 4, 8, 9, 6, 4, 7 };

		for (int i : arr) {
			System.out.println(i);
		}

		/*
		 * for (int i : arr) { i = i + 2; }
		 */

		System.out.println("===============");

		for (int i : arr) {
			System.out.println(i);
		}

	}

}
