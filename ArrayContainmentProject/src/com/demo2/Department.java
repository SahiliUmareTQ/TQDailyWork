package com.demo2;

public class Department {

	private int id;
	private String name;

	// default constructor
	public Department() {

	}

	// para constructor
	Department(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// getter setter

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	// toString

	public String toString() {
		return "DeptId :" + id + " DeptName: " + name;
	}

}
