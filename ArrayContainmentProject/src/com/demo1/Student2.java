package com.demo1;

public class Student2 {

	private int id;
	private String name;
	private float marks[];
	private float totalMarks;

	Student2() {
		totalMarks = 0.0f;
	}

	Student2(int id, String name, float marks[]) {
		this();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

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

	public void setMarks(float marks[]) {
		this.marks = marks;
	}

	public float[] getMarks() {
		return marks;
	}

	public float getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(float totalMarks) {
		this.totalMarks = totalMarks;
	}

	public String toString() {
		return id + " " + name + "  Marks:" + totalMarks;
	}

}
