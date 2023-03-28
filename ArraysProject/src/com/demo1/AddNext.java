package com.demo1;

import java.util.Scanner;

public class AddNext {

	static Scanner sc = new Scanner(System.in);

	public static void enterArray(int ar[]) {
		System.out.println("Enter array elements");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		System.out.println();
	}

	public static void printArray(int ar[]) {
		for (int x : ar) {
			System.out.print(x + " ");
		}
	}

	public static void addNextElement(int ar[]) {
		int addValue = 2;
		for (int i = 0; i < ar.length - addValue; i++) {
			ar[i] = ar[i] + ar[i] + 1;
		}

	}

	public static void main(String[] args) {

		System.out.println("Enter array size");
		int size = sc.nextInt();
		int ar[] = new int[size];

		enterArray(ar);

		System.out.println("Before");
		printArray(ar);

		addNextElement(ar);

		System.out.println();

		System.out.println("After");
		printArray(ar);
	}

}
