package com.encapsulation;

public class Student {

	private int id;
	private String name;
	private int age;

	public Student() {

	}

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// setter

	public void setId(int id) {
		this.id = id;
	}

	// getter
	public int getId() {
		return id;
	}

	public void setName(String Name) {
		this.name = Name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
