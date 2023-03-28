package com.stringlogical;

import java.util.Scanner;

public class Frequencyofstring {

	public static void frequency(String s) {
		int count;
		s = s.toUpperCase();
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
			System.out.println(ch[i] + " :" + count);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String st = sc.next();
		frequency(st);

	}

}
