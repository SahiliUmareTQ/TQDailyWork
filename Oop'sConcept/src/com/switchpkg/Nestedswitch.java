package com.switchpkg;

import java.util.Scanner;

public class Nestedswitch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your course:");
		String course = sc.next();
		int sem;
		switch (course) {
		case "CSE":
			System.out.println("Enter semester");
			sem = sc.nextInt();
			switch (sem) {
			case 1:
				System.out.println("Welcome to first semester of cse");
				break;
			case 2:
				System.out.println("Welcome to second semester of cse");
				break;
			case 3:
				System.out.println("Welcome to third semester of cse");
				break;
			default:
				System.out.println("Select proper semester for cse");
			}
			break;

		case "ECE":
			System.out.println("Enter semester");
			sem = sc.nextInt();
			switch (sem) {
			case 1:
				System.out.println("Welcome to first semester of electrical");
				break;
			case 2:
				System.out.println("Welcome to second semester of electrical");
				break;

			default:
				System.out.println("Select proper semester for electrical");
			}
			break;

		default:
			System.out.println("No course exist");

		}

	}

}
