package com.twoDarray;

import java.util.Scanner;

public class MultiArray1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 3-Rows and 4-columns
		int ar[][] = new int[3][4];
		System.out.println("Enter array elements");
		// for row
		for (int i = 0; i < 3; i++) {
			// columns for each row
			for (int j = 0; j < 4; j++) {
				ar[i][j] = sc.nextInt();
			}
		}

		System.out.println("--------------------");
		// print 2D array

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 4; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
	}

}
