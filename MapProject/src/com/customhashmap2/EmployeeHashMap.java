package com.customhashmap2;

import java.util.HashMap;
import java.util.Map.Entry;

public class EmployeeHashMap {

	public static void main(String[] args) {

		HashMap<Employee, String> eMap = new HashMap<>();

		eMap.put(new Employee(101, "sahili", 90000f), "Technical");

		eMap.put(new Employee(102, "pratik", 99000f), "Development");

		// not added
		eMap.put(new Employee(101, "sahili", 80000f), "Testing");

		for (Entry<Employee, String> en : eMap.entrySet()) {

			System.out.println(en.getKey() + " :" + en.getValue());
		}

	}

}
