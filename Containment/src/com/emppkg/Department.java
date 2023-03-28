package com.emppkg;

public class Department {

	private int deptno;
	private String deptname;

	// default constructor
	Department() {

	}

	// para constructor
	Department(int no, String name) {
		this.deptno = no;
		this.deptname = name;
	}

	// getter setter

	public void setDeptNo(int no) {
		this.deptno = no;
	}

	public int getDeptNo() {
		return deptno;
	}

	public void setDeptName(String name) {
		this.deptname = name;
	}

	public String getDeptName() {
		return deptname;
	}

	// toString method

	public String toString() {
		return deptno + " " + deptname;
	}

}
