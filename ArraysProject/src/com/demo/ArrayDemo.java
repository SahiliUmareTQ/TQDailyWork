package com.demo;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {

		int ar[] = new int[5];
		int sum = 0;
		int sumEven = 0;
		int sumOdd = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array element");

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
			sum += ar[i]; // sum=sum+ar[i];

			if (ar[i] % 2 == 0) {
				sumEven += ar[i];
			} else {
				sumOdd += ar[i];
			}
		}
		System.out.println("Total:" + sum);
		System.out.println("Total:" + sumEven);
		System.out.println("Total:" + sumOdd);
	}

}
