package com.pozo;

public class Person {

	private int personage;
	private String personname;
	private int personid;
	private float personsalary;

	// getter setter

	public void setPersonAge(int personage) {
		this.personage = personage;

	}

	public int getPersonAge() {
		return personage;
	}

	public void setPersonName(String personname) {
		this.personname = personname;
	}

	public String getPersonNmae() {
		return personname;
	}

	public void setPersonId(int personid) {
		this.personid = personid;
	}

	public int getPersonId() {
		return personid;
	}

	public void setPersonSalry(float personsalary) {
		this.personsalary = personsalary;
	}

	public float getPersonSalary() {
		return personsalary;
	}

	// default constructor
	public Person() {
		System.out.println("This is the Default constructor");

	}

	// para constructortor

	public Person(int personage, String personname, int personid, float personsalary) {

		System.out.println("This is the param constructor");
		this.personage = personage;
		this.personname = personname;
		this.personid = personid;
		this.personsalary = personsalary;
	}

	// tostring method

	public String toString() {
		return "PersonAge:" + "25" + "PersonName:" + "Harry" + "PersonId:" + "2000" + "PersonSalary:" + "800000";

	}
}
