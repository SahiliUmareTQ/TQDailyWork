package com.demo4;

import java.util.Arrays;

public class Car {

	private int carno;
	private String name;
	private Driver driver[];

	public Car() {

	}

	Car(int carno, String name, Driver driver[]) {
		this.carno = carno;
		this.name = name;
		this.driver = driver;

	}

	// getter setter
	public void setCarno(int carno) {
		this.carno = carno;
	}

	public int getCarno() {
		return carno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setDriver(Driver driver[]) {
		this.driver = driver;
	}

	public Driver[] getDriver() {
		return driver;
	}

	// toString
	public String toString() {
		return "Car :" + carno + " " + name + " " + Arrays.toString(driver);
	}
}
