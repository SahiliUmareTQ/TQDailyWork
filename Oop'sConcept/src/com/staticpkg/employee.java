package com.staticpkg;

public class employee {

	private int id;
	private String name;
	static private String HCL;

	employee() {

	}

	employee(int id) {
		this.id = id;
	}

	public employee(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public static void main(String[] args) {

		employee e = new employee(10);
		System.out.println(e);

	}

}
