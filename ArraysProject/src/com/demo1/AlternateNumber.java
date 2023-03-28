package com.demo1;

import java.util.Scanner;

public class AlternateNumber {

	static Scanner sc = new Scanner(System.in);

	// method
	public static void enterArray(int ar[]) {
		System.out.println("Enter array elements");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
	}

	// method
	public static void printArray(int ar[]) {
		System.out.println("--------------------------");
		for (int x : ar) {
			System.out.print(x + " ");
		}

		System.out.println();
	}

	// method-----logic
	public static void alternateElements(int ar[]) {
		for (int i = 0; i < ar.length; i += 2) {
			System.out.print(ar[i] + " ");
		}

	}

	public static void main(String[] args) {

		System.out.println("Enter array size");
		int size = sc.nextInt();
		int arr[] = new int[size];

		enterArray(arr);
		System.out.println("Before");
		printArray(arr);
		System.out.println("--------------------------");
		alternateElements(arr);
	}

}
