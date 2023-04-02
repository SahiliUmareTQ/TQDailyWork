package com.logicalamap;

import java.util.HashMap;
import java.util.Map;

public class SearchEmployeeHashMap {

	public static void searchMap(HashMap<Employee, String> map) {

		String name = "Sahili";
		Employee emp = null;
		boolean flag = false;

		for (Map.Entry<Employee, String> en : map.entrySet()) {
			emp = en.getKey();
			if (emp.getName().equals(name)) {
				System.out.println(en.getValue());
				flag = true;
			}

		}
		if (!flag) {
			System.out.println("Name doen't exit");
		}
	}

	public static void main(String[] args) {

		HashMap<Employee, String> map = new HashMap<>();

		map.put(new Employee(101, "Sahili", 90000.0f), "Testing");
		map.put(new Employee(101, "Pratik", 99000.0f), "Technical");
		map.put(new Employee(101, "Suraj", 98000.0f), "Develpoment");

		searchMap(map);
	}

}
