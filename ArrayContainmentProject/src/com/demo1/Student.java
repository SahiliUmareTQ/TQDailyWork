package com.demo1;

public class Student {

	private int id;
	private String name;
	private int age;
	private Course course;
	private static float marks[];

	Student() {

	}

	Student(int id, String name, int age, float marks[]) {
		this();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	Student(int id, String name, int age, Course course) {
		this(id, name, age, marks);
		this.course = course;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Course getCourse() {
		return course;
	}

	public void setMarks(float[] m) {
		this.marks = marks;

	}

	public float[] getMarks() {
		return marks;
	}

	public String toString() {
		return id + " " + name + " " + age + " " + course;
	}

}
