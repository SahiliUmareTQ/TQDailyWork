package com.stringassignment;

import java.util.Scanner;

public class DuplicateWord {

	public static void duplicateWord(String s) {
		int count;
		int dcount = 0;
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			count = 1;
			if (ch[i] == '\0')
				continue;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = '\0';
				}
			}

			if (count > 1) {
				dcount++;
				System.out.println(ch[i] + " :" + count);
			}

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String st = sc.next();

		duplicateWord(st);

	}

}
