package com.cardemo;

public class Driver {

	private int driverage;
	private String drivername;
	private int driverid;
	private Car car;

	// default constructor
	Driver() {

	}

	// para constructor
	Driver(int dage, String dname, int id) {
		this.driverage = dage;
		this.drivername = dname;
		this.driverid = id;

	}

	// para constructor
	Driver(int dage, String dname, int id, Car car) {
		this(dage, dname, id);
		this.car = car;
	}

	// getter setter

	public void setDriverAge(int dage) {
		this.driverage = dage;
	}

	public int getDriverAge() {
		return driverage;
	}

	public void setDriverName(String dname) {
		this.drivername = dname;
	}

	public String getDriverName() {
		return drivername;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Car getCar() {
		return car;
	}

	public void setDriverId(int did) {
		this.driverid = did;
	}

	public int getDriverId() {
		return driverid;
	}

	// toString Method

	public String toString() {
		return driverage + " " + drivername + " " + driverid;
	}

}
