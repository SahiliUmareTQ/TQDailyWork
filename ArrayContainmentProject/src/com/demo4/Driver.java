package com.demo4;

public class Driver {

	private String name;
	private String number;

	public Driver() {

	}

	Driver(String name, String number) {
		this.name = name;
		this.number = number;

	}

	// getter setter
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	// toString
	public String toString() {
		return "Driver :" + name + " " + number;
	}
}
