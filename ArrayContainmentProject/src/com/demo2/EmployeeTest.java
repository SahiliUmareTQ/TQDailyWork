package com.demo2;

import java.util.Scanner;

public class EmployeeTest {

	static Scanner sc = new Scanner(System.in);

	public static void enterEmpDetail(Employee[] e) {
		for (int i = 0; i < e.length; i++) {
			e[i] = new Employee();
			System.out.println("Enter the employee id:");

			e[i].setEid(sc.nextInt());

			System.out.println("Enter name:");
			e[i].setEname(sc.next());

			System.out.println("Enter salary:");
			e[i].setEsalry(sc.nextDouble());
		}

	}

	public static void printEmpDetails(Employee em[]) {
		System.out.println("=================================");
		for (Employee e : em) {
			System.out.println(e);

		}
	}

	public static void salarySort(Employee em[]) {
		Employee e = new Employee();// temporary object
		for (int i = 0; i < em.length; i++) {
			for (int j = i + 1; j < em.length; j++) {
				if (em[i].getEsalary() > em[j].getEsalary()) {
					e = em[i];
					em[i] = em[j];
					em[j] = e;
				}
			}
		}

	}

	public static void main(String[] args) {

		Employee emp[] = new Employee[3];

		enterEmpDetail(emp);

		printEmpDetails(emp);

		salarySort(emp);

		printEmpDetails(emp);
	}

}
