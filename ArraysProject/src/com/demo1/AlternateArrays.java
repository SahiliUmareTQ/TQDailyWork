package com.demo1;

import java.util.Arrays;

public class AlternateArrays {

	public static void mergeArray(int ar1[], int ar2[]) {
		int size1 = ar1.length;
		int size2 = ar2.length;

		int merr[] = new int[size1 + size2];
		int k = 0;
		for (int i = 0, j = 0; i < size1 && j < size2; i++, j++)

		{
		}
	}

	public static void main(String[] args) {

		int ar1[] = { 6, 7, 12, 4, 5, 8 };
		int ar2[] = { 10, 20, 30 };
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar2));
	}

}
