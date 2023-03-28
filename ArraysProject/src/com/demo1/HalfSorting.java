package com.demo1;

public class HalfSorting {

	public static void main(String[] args) {
		int temp = 0;
		int ar[] = { 7, 0, 1, 4, 6, 8 };
		System.out.println("Original Array");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		// for Asscending
		System.out.println();
		System.out.println("Half array in Assending order");
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] > ar[j]) {
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;

				}
			}
		}
		// for half array
		for (int i = 0; i < ar.length / 2; i++) {
			System.out.print(ar[i] + " ");
		}

		// for decending
		System.out.println();
		System.out.println("Half array in Desending order");
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] < ar[j]) {
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;

				}
			}
		}
		// for half array
		for (int i = 0; i < ar.length / 2; i++) {
			System.out.print(ar[i] + " ");
		}
	}

}
