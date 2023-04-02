package com.basics;

public class StudentB extends StudentA {

	int a = 21;
	int b = 12;

	void Multiplication() {
		int c = a * b;
		System.out.println("Multiplication is :" + c);

	}

	public static void main(String args[]) {

		StudentB s = new StudentB();

		StudentA k = new StudentA();

		s.Multiplication();
//		k.Addition();
//		k.Substraction();
		s.Addition();
		s.Substraction();

	}

}
