package com.demo2;

public class EmployeeConsrtuctor {
	// Emp Highest salary
	public static void higSalary(Employee emp[]) {
		double max = Float.MIN_VALUE;
		for (int i = 0; i < emp.length; i++) {
			if (emp[i].getEsalary() > max) {
				max = emp[i].getEsalary();
			}
		}
		System.out.println("Highest salary =" + max);
	}

	// sort salary
	public static void sortSalary(Employee emp[]) {
		Employee highsal = new Employee();
		for (int i = 0; i < emp.length; i++) {
			for (int j = i + 1; j < emp.length; j++) {
				if (emp[i].getEsalary() > emp[j].getEsalary()) {
					highsal = emp[i];
					emp[i] = emp[j];
					emp[j] = highsal;
				}

			}

		}

	}

	// DeptWiseSort
	public static void empDepartmentWise(Employee emp[], Department d[]) {
		int count = 0;
		for (Department da : d) {
			System.out.println("Department " + da.getName());
			System.out.println();
			count = 0;
			for (Employee ea : emp) {
				if (ea.getDepartment().equals(da)) {
					count++;
					System.out.println(ea.getEname());
				}
			}
			System.out.println("=========================");
			System.out.println("Department: " + da.getName() + " number of employee =" + count);
			System.out.println("=========================");
		}
	}

	// Print
	public static void printEmployee(Employee e[]) {
		for (Employee x : e) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {

		Department[] dp = new Department[4];

		dp[0] = new Department(101, "Hr");
		dp[1] = new Department(102, "Sales");
		dp[2] = new Department(103, "Technical");
		dp[3] = new Department(103, "Marketing");

		Employee emp[] = new Employee[8];

		emp[0] = new Employee(1, "sahili", 45000, dp[0]);
		emp[1] = new Employee(2, "neha", 75000, dp[1]);
		emp[2] = new Employee(3, "ram", 55000, dp[1]);
		emp[3] = new Employee(4, "yash", 50000, dp[3]);
		emp[4] = new Employee(5, "rahul", 60000, dp[0]);
		emp[5] = new Employee(6, "ajay", 85000, dp[2]);
		emp[6] = new Employee(7, "dhiraj", 99000, dp[2]);
		emp[7] = new Employee(8, "pranay", 40000, dp[3]);

		for (Employee e : emp) {
			System.out.println(e);
		}
		System.out.println("================================");

		higSalary(emp);

		sortSalary(emp);

		empDepartmentWise(emp, dp);
		printEmployee(emp);

	}

}
