package com.basics2;

public class Emplyoee1 {

	int empId;
	float salary;
	String Name;
	int age;

	// method
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

		System.out.println("----------------------");

		Emplyoee1 e1 = new Emplyoee1();
		e1.enterDetails(101, 120000.0f, "Sahili", 26);
		e1.showDetails();
	}

}
