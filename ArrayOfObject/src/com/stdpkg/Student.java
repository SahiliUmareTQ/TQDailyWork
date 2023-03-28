package com.stdpkg;

import java.util.Arrays;

public class Student {

	private int id;
	private String name;
	private float marks[];

	public Student() {

		marks = new float[2];
	}

	Student(int id, String name, float marks) {
		this();
		this.id = id;
		this.name = name;
		this.marks = this.marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float[] getMarks() {
		return marks;
	}

	public void setMarks(float[] marks) {
		this.marks = marks;
	}

	// toString
	public String toString() {
		return "Student :" + id + " " + " " + name + " " + Arrays.toString(marks);
	}
}
