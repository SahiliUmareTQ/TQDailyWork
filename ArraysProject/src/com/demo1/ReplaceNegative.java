package com.demo1;

import java.util.Scanner;

public class ReplaceNegative {
	static Scanner scanner = new Scanner(System.in);

	public static void enterArray(int ar[]) {
		System.out.println("Enter array elements");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scanner.nextInt();
		}
	}

	public static void printArray(int ar[]) {
		for (int x : ar) {
			System.out.print(x + " ");
		}
		System.out.println();
	}

	// replace -1 with 0
	public static void replaceElement(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < 0) {
				ar[i] = 0;
			}
		}
	}

	public static void main(String[] args) {

		System.out.println("Enter array size");
		int size = scanner.nextInt();
		int arr[] = new int[size];

		enterArray(arr);

		System.out.println("Before");
		printArray(arr);

		replaceElement(arr);

		System.out.println("After");
		printArray(arr);

	}

}
