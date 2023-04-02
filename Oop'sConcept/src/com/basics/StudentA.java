package com.basics;

public class StudentA {

	int a = 10;
	int b = 20;

	void Addition() {
		int c = a + b;
		System.out.println("Adiition is :" + c);

	}

	void Substraction() {
		int c = a - b;
		System.out.println("Substraction is :" + c);

	}

	public static void main(String args[]) {
		StudentA k = new StudentA();
		k.Addition();
		k.Substraction();

	}

}
