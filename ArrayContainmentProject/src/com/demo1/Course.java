package com.demo1;

public class Course {

	private int cid;
	private String cname;
	private double fees;

	// constructor
	Course() {

	}

	Course(int cid, String cname, double fees) {
		this.cid = cid;
		this.cname = cname;
		this.fees = fees;
	}

	// getter setter
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	// toString
	public String toString() {
		return "Course:" + cid + " " + cname + " " + fees;
	}

}
