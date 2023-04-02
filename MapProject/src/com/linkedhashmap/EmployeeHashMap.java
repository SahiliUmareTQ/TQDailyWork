package com.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class EmployeeHashMap {

	public static void main(String[] args) {

		Department d1 = new Department(1, "HR");
		Department d2 = new Department(1, "Sales");
		Department d3 = new Department(1, "Technical");

		LinkedHashMap<Employee, Department> lMap = new LinkedHashMap<>();
		lMap.put(new Employee(1, "Sahili", 99000.0f), d3);
		lMap.put(new Employee(2, "Suraj", 99000.0f), d1);
		lMap.put(new Employee(3, "Pratik", 99000.0f), d2);
		lMap.put(new Employee(4, "Snehal", 99000.0f), d3);
		lMap.put(new Employee(5, "Shradha", 99000.0f), d1);
		lMap.put(new Employee(6, "Amit", 99000.0f), d2);

		for (Map.Entry<Employee, Department> en : lMap.entrySet()) {
			System.out.println(en.getKey() + " :" + en.getValue());
		}

		System.out.println("-------------------------------------------------");

		System.out.println(lMap.get(new Employee(1, "Sahili", 99000.0f)));

		System.out.println("-------------------------------------------------");

		for (Map.Entry<Employee, Department> en : lMap.entrySet()) {
			System.out.println(en.getKey() + " :" + en.getValue());
		}
	}

}
