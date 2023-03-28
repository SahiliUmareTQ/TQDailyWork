package com.object;

public class Student {

	private int id;
	private String name;
	private float marks;

	Student() {

	}

	Student(int id, String name, float marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
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

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public float getMarks() {
		return marks;
	}

	public String toString() {
		return "Student [id:" + id + ", name:" + name + ", marks:" + marks + "]";
	}

}
