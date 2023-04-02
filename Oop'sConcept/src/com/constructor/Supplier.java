package com.constructor;

public class Supplier {

	private int supplierid;
	private String name;
	private String location;
	private String category;

	public Supplier() {
		System.out.println("Default constructor");
	}

	public Supplier(int supplierid, String name, String location, String category) {
		System.out.println("Parameterised constructor");
		this.supplierid = supplierid;
		this.name = name;
		this.location = location;
		this.category = category;
	}

	public int getSupplierid() {
		return supplierid;
	}

	public void setSupplierid(int supplierid) {
		this.supplierid = supplierid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String toStirng() {

		return "Item Details: " + supplierid + " " + name + " " + "  Price:" + location + " Category:" + category;
	}

}
