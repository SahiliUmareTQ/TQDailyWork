package com.demo1;

import java.util.Arrays;

public class Student1 {

	private int id;
	private String name;
	private float marks[];

	Student1() {

	}

	Student1(int id, String name, float marks[]) {

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

	public String toString() {
		return id + " " + name + "  Marks:" + Arrays.toString(marks);
	}

}
