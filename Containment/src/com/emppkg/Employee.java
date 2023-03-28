package com.emppkg;

public class Employee {

	private int empid;
	private int empage;
	private String empname;

	private Department department;

	// default constructor
	Employee() {

	}

	// para constructor
	Employee(int id, int age, String name, Department department) {
		this.empid = id;
		this.empage = age;
		this.empname = name;
		this.department = department;
	}

	// getter setter

	public void setEmpId(int id) {
		this.empid = id;
	}

	public int getEmpId() {
		return empid;
	}

	public void setEmpAge(int age) {
		this.empage = age;
	}

	public int getEmpAge() {
		return empage;
	}

	public void setEmpName(String name) {
		this.empname = name;
	}

	public String getEmpName() {
		return empname;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Department getDepartment() {
		return department;
	}

	// toString method

	public String toString() {
		return "Empid: " + empid + " Empage: " + empage + " Empname: " + empname + " department: " + department;

	}

}
