package com.demo2;

public class Employee {

	private int eid;
	private String ename;
	private double esalary;
	private Department department;

	public Employee() {

	}

	Employee(int eid, String ename, double esalary, Department department) {
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.department = department;

	}

	// getter setter

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getEid() {
		return eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEname() {
		return ename;
	}

	public void setEsalry(double esalary) {
		this.esalary = esalary;
	}

	public double getEsalary() {
		return esalary;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Department getDepartment() {
		return department;
	}

	// toString

	public String toString() {
		return "Employee :" + eid + " " + ename + " " + esalary + " " + department;
	}

}
