package com.demo;

public class SecondHighestElement {

	public static void sortArray(int ar[]) {
		int temp;

		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] > ar[j]) {
					// swapping
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
				// System.out.print(ar[i] + " ");
			}
//			System.out.println("2nd maximun element");
//			System.out.println(ar[i] - (ar[i] - 2));

		}

	}

	public static void main(String[] args) {

		int arr1[] = { 3, 4, 7, 1, 2, 5, 10, 9 };

		System.out.println("Before Sorting:");
		for (int i : arr1) {
			System.out.print(i + " ");
		}
		sortArray(arr1);

		System.out.println();

		System.out.println("After Sorting:");
		for (int i : arr1) {
			System.out.print(i + " ");
		}
		sortArray(arr1);
	}

}
