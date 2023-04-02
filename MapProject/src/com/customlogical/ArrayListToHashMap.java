package com.customlogical;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayListToHashMap {

	public static void countMap(ArrayList<Employee> al) {
		HashMap<Department, Integer> dmap = new HashMap<>();

		for (Employee emp : al) {
			Department d = emp.getDept();
			if (dmap.containsKey(d)) {
				dmap.put(d, dmap.get(d) + 1);
			} else
				dmap.put(d, 1);
		}

		for (Map.Entry<Department, Integer> en : dmap.entrySet()) {

			System.out.println(en.getKey().getDname() + " :" + en.getValue());
		}

	}

	public static void main(String[] args) {

		Department d1 = new Department(1, "HR");
		Department d2 = new Department(2, "Technical");
		Department d3 = new Department(3, "Sales");

		ArrayList<Employee> list = new ArrayList<>();

		list.add(new Employee(101, "Sahili", 90000f, d1));
		list.add(new Employee(102, "Snehal", 55000f, d2));
		list.add(new Employee(103, "Pratik", 99000f, d3));
		list.add(new Employee(104, "Suraj", 80000f, d1));
		list.add(new Employee(105, "Amit", 70000f, d2));
		list.add(new Employee(106, "Akshay", 96600f, d2));
		list.add(new Employee(107, "Pranay", 40000f, d3));

		countMap(list);

	}

}
