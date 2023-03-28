package com.demo3;

public class Item {

	private int id;
	private String name;
	private double unitprice;
	private int qty;

	public Item() {

	}

	Item(int id, String name, double unitprice) {
		this.id = id;
		this.name = name;
		this.unitprice = unitprice;

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

	public void setUnitPrice(double unitprice) {
		this.unitprice = unitprice;
	}

	public double getUnitPrice() {
		return unitprice;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getQty() {
		return qty;
	}

	// toString

	public String toString() {
		return "Item :" + id + " " + name + " " + unitprice + " " + qty;
	}
}
