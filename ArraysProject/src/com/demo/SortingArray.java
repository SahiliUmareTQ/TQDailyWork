package com.demo;

public class SortingArray {

	public static void sortArray(int ar[]) {
		int temp;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] > ar[j]) {
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		int arr1[] = { 1, 5, 4, 6, 8, 9, 10 };
		System.out.println("Before sorting");
		for (int i : arr1) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("After sorting");

		sortArray(arr1);
		for (int i : arr1) {
			System.out.print(i + " ");
		}
	}

}
