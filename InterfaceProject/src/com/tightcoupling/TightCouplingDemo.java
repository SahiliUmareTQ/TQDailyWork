package com.tightcoupling;

class Student

{
	int id;
	String name;
	int age;
	double fees;

	public Student() {

	}

	public Student(int id, String name, int age, double fees) {

		this.id = id;
		this.name = name;
		this.age = age;
		this.fees = fees;
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

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	void calFees(double fees, float months) {
		this.fees = fees * months;
		System.out.println("Fees to be paid:" + this.fees);
	}

	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", fees=" + fees + "]";
	}
}

class CollegeStudent extends Student

{
	String course;

	CollegeStudent() {

	}

	CollegeStudent(int id, String name, int age, double fees, String course) {
		super(id, name, age, fees);
		this.course = course;
	}

	void scholarship(double fees, int months, float sc) {
		calFees(fees, months);
		this.fees = this.fees - ((sc / 100) * this.fees);

	}

	public String toString() {
		return super.toString() + "CollegeStudent [course=" + course + "]";
	}

}

public class TightCouplingDemo {

	public static void main(String[] args) {

		CollegeStudent c1 = new CollegeStudent(101, "Sahili", 34, 5000, "Java");

		/*
		 * c1.calFees(7000, 4); System.out.println(c1);
		 */

		c1.scholarship(7000, 4, 20);
		System.out.println(c1);

	}

}
