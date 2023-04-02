package com.basics2;

public class Emplyoee2 {

	int empId;
	float salary;
	String Name;
	int age;

	void enterDetails(int id, float s, String n, int a) {
		empId = id;
		salary = s;
		Name = n;
		age = a;
	}

	void showDetails() {
		System.out.println("Emplyoee ID is :" + empId);

		System.out.println("Emplyoee salary is :" + salary);

		System.out.println("Emplyoee Nmae is :" + Name);

		System.out.println("Emplyoee age is :" + age);

	}

	public static void main(String args[]) {
		Emplyoee1 e = new Emplyoee1();
		e.showDetails();

		Emplyoee1 e1 = new Emplyoee1();
		e1.enterDetails(1001, 420000.0f, "xyz", 30);
		e1.showDetails();

		System.out.println("-------------");

		Emplyoee2 k = new Emplyoee2();
		// k.showDetails();
		k.enterDetails(102, 500000.0f, "fgdkjgjkhjl", 20);
		k.showDetails();

	}

}
