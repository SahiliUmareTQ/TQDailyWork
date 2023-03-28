package com.twoDarray;

import java.util.Scanner;

public class MultiArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ar[][] = new int[2][3];
		System.out.println("Enter array elements");
		// for row
		for (int i = 0; i < 2; i++) {
			// columns of each row
			for (int j = 0; j < 3; j++) {
				ar[i][j] = sc.nextInt();
			}
		}

		System.out.println("------------------");
		// print 2D array

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}

	}

}
