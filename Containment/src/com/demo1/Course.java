package com.demo1;

public class Course {

	private int cid;
	private String cname;
	private double fees;

	Course() {

	}

	Course(int id, String name, double fees) {
		this.cid = id;
		this.cname = name;
		this.fees = fees;
	}

	public void setCId(int id) {
		this.cid = id;
	}

	public int getCId() {
		return cid;
	}

	public void setCName(String cname) {
		this.cname = cname;
	}

	public String getCName() {
		return cname;
	}

	public void setFess(float fees) {
		this.fees = fees;
	}

	public double getFees() {
		return fees;
	}

	public String toString() {
		return "Course:" + cid + " " + cname + " " + fees;
	}

}
