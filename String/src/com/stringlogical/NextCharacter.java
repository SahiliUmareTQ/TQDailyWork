package com.stringlogical;

public class NextCharacter {

	public static void nextCharacter(String str) {
		char ch[] = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			ch[i]++;

		}
		System.out.println(ch);
	}

	public static void main(String[] args) {

		String st = "bulb";
		System.out.println(st);

		nextCharacter(st);

	}

}
