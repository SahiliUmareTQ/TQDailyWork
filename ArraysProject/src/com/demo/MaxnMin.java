package com.demo;

import java.util.Scanner;

public class MaxnMin {

	static Scanner sc = new Scanner(System.in);

	public static void minAndmax(int ar[]) {

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max)
				max = ar[i];
			if (ar[i] < min)
				min = ar[i];

		}
		System.out.println("maximun:" + max);
		System.out.println("minimum:" + min);
	}

	public static void enterArrayElements(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			int ar1 = sc.nextInt();
		}
	}

	public static void main(String[] args) {

		System.out.println("Enter size of array");
		int size = sc.nextInt();

		int arr[] = new int[size];

		enterArrayElements(arr);

		minAndmax(arr);
	}

}
