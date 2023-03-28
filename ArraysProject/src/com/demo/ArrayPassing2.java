package com.demo;

import java.util.Scanner;

public class ArrayPassing2 {

	public static void change(int arr[]) {

		for (int i = 0; i < arr.length; i++) {

			arr[i] = arr[i] + arr[i];
		}
		System.out.println("Arrays in method1");

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");

		}
		System.out.println();
	}

	public static void main(String[] args) {

		int ar[] = new int[5];

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array element");

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();

		}
		change(ar);

		System.out.println("Original array");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
	}

}
