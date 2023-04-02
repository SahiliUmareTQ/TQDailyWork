package com.basics2;

public class Result {

	public static void main(String[] args) {

		Emplyoee1 e1 = new Emplyoee1();
		e1.enterDetails(101, 120000.0f, "Sahili", 26);
		e1.showDetails();

		System.out.println("===============================");

		Emplyoee2 k = new Emplyoee2();
		// k.showDetails();
		k.enterDetails(102, 500000.0f, "fgdkjgjkhjl", 20);
		k.showDetails();

	}

}
