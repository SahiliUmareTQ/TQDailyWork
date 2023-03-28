package com.demo1;

import java.util.Scanner;

public class AddEle {

	static Scanner sc = new Scanner(System.in);

	public static void enterArray(int ar[]) {

		System.out.println("Enter array ele");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		System.out.println();
	}

	public static void printArray(int ar[]) {
		System.out.println("----------------");
		for (int x : ar) {
			System.out.println(x + " ");
		}
	}

	public static void addElement(int ar[]) {

		for (int i = 0; i < ar.length; i += 2) {
			System.out.println(ar[i] + " ");
		}
	}

	public static void main(String[] args) {

		System.out.println("Enter size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		enterArray(arr);
		System.out.println("Before");
		printArray(arr);
		System.out.println("-----------");
		addElement(arr);

	}

}
