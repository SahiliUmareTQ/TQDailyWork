package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class EmployeeSortHashMap {

	public static void sortByKey(ArrayList<Employee> map) {
		ArrayList<String> list = new ArrayList<>();
		Collections.sort(list);

	}

	public static void main(String[] args) {

		Department d1 = new Department(1, "HR");
		Department d2 = new Department(2, "Technical");
		Department d3 = new Department(3, "Sales");

		HashMap<Employee, Department> list = new HashMap<>();

		list.put(new Employee(101, "Sahili", 90000f), d1);
		list.put(new Employee(102, "Snehal", 55000f), d2);
		list.put(new Employee(103, "Pratik", 99000f), d3);
		list.put(new Employee(104, "Suraj", 80000f), d1);
		list.put(new Employee(105, "Amit", 70000f), d2);
		list.put(new Employee(106, "Akshay", 96600f), d2);
		list.put(new Employee(107, "Pranay", 40000f), d3);
	}

}
