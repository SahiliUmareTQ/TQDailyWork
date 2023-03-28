package com.demo;

import java.util.Scanner;

public class ArrayPassing {

	public static int sumEven(int arr[]) {
		int sumEven = 0;

		// sum of even numbers from array
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sumEven += arr[i];
			}
		}
		return sumEven;
	}

	public static void main(String args[]) {

		int ar[] = new int[5];
		int sum = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array element");

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
			sum += ar[i];
		}
		int sumE = sumEven(ar);
		System.out.println("sum of even:" + sumE);
	}

}
