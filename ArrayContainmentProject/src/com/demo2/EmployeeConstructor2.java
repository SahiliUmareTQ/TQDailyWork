package com.demo2;

public class EmployeeConstructor2 {

	public static void main(String[] args) {

		Department[] dp = new Department[4];

		dp[0] = new Department(10, "Hr");
		dp[1] = new Department(20, "Sales");
		dp[2] = new Department(30, "Technical");
		dp[3] = new Department(40, "Marketing");

		Employee em[] = new Employee[4];

		em[0] = new Employee(1, "sahili", 45000, new Department(10, "Hr"));
		em[1] = new Employee(2, "neha", 75000, new Department(20, "Sales"));
		em[2] = new Employee(3, "ram", 55000, new Department(30, "Technical"));
		em[3] = new Employee(4, "yash", 50000, new Department(40, "Marketing"));

		for (Employee e : em) {
			System.out.println(e);
		}

	}

}
