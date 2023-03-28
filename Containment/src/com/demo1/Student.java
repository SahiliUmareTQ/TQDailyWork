package com.demo1;

public class Student {

	private int id;
	private String name;
	private int age;
	private Course course;

	// deafult constructor
	Student() {

	}

	// para constructor
	Student(int id, String name, int age) {

		this.id = id;
		this.name = name;
		this.age = age;

	}

	// para constructor
	Student(int id, String name, int age, Course course) {

		this(id, name, age);

		this.course = course;
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

	public void setAge(int age)

	{
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Course getCourse() {
		return course;
	}

	// toString method
	public String toString() {
		return id + " " + name + " " + age + " " + course;
	}
}
