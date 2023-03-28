package com.cardemo;

public class Car {

	private int carno;
	private String carname;
	private double carprice;
	private int carengineno;

	// default constructor
	Car() {

	}

	// para constructor
	Car(int carno, String carname, double carprice, int carengineno) {
		this.carno = carno;
		this.carname = carname;
		this.carprice = carprice;
		this.carengineno = carengineno;
	}

	// getter setter

	public void setCarNo(int carno) {
		this.carno = carno;
	}

	public int getCarNo() {
		return carno;
	}

	public void setCarName(String carname) {
		this.carname = carname;
	}

	public String getCarName() {
		return carname;
	}

	public void setCarPrice(double carprice) {
		this.carprice = carprice;
	}

	public double getCarPrice() {
		return carprice;
	}

	public void setCarEngineNo(int carengineno) {
		this.carengineno = carengineno;
	}

	public int getCarEngineNo() {
		return carengineno;
	}

	// toString method

	public String toString() {
		return "Car:" +carno + " " + carname + " " + carprice + " " + carengineno;
	}
}
