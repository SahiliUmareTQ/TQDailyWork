package com.demo;

import java.util.Scanner;

public class SearchNumber {

	static Scanner sc = new Scanner(System.in);

	public static void search(int ar[], int value) {
		System.out.println("Enter element for searching");

		boolean isPresent = false;
		int pos = -1;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == value) {
				isPresent = true;
				pos = 1;
				break;
			}
		}
		if (isPresent) {
			System.out.println("Element " + value + " is present at position:" + pos);

		} else {
			System.out.println("Element " + value + " is not present");

		}
	}

	public static void enterArrayElements(int ar[]) {
		System.out.println("Enter array elements");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
	}

	public static void main(String[] args) {

		System.out.println("Enter the size of array");
		int size = sc.nextInt();

		int arr[] = new int[size];

		enterArrayElements(arr);

		System.out.println("Enter the element to be searched:");

		int val = sc.nextInt();

		// System.out.println(arr1.length);

		search(arr, val);

	}

}
