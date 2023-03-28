package com.demo2;

import java.util.Scanner;

public class EmployeeGetterSetter {

	static Scanner sc = new Scanner(System.in);

	public static void enterEmployeeDetails(Employee e) {
		System.out.println("Enter the emp id");
		e.setEid(sc.nextInt());

		System.out.println("Enter the emp name");
		e.setEname(sc.next());

		System.out.println("Enter the emp salary");
		e.setEsalry(sc.nextDouble());

		Department d = new Department();

		System.out.println("Enter dept id");
		d.setId(sc.nextInt());

		System.out.println("Enter dept name");
		d.setName(sc.next());

		e.setDepartment(d);

	}

	///////////////////////
	public static void enterEmployeeDetailsAnonymus(Employee e) {
		System.out.println("Enter the emp id");
		e.setEid(sc.nextInt());

		System.out.println("Enter the emp name");
		e.setEname(sc.next());

		System.out.println("Enter the emp salary");
		e.setEsalry(sc.nextDouble());

		e.setDepartment(new Department());

		System.out.println("Enter dept id");
		e.getDepartment().setId(sc.nextInt());

		System.out.println("Enter dept name");
		e.getDepartment().setName(sc.next());

	}

	public static void printDetails(Employee emp[]) {
		for (Employee e : emp) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {

		Employee em[] = new Employee[4];

		for (int i = 0; i < em.length; i++) {
			em[i] = new Employee();

			enterEmployeeDetails(em[i]);
		}
		printDetails(em);

	}

}
