package com.demo3;

import java.util.Arrays;

public class Supplier {

	private int sid;
	private String sname;
	private String phonenumber;
	private Item items[];

	public Supplier() {

	}

	Supplier(int sid, String sname, String phonenumber, Item items[]) {
		this.sid = sid;
		this.sname = sname;
		this.phonenumber = phonenumber;
		this.items = items;

	}

	// getter setter

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getSid() {
		return sid;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSname() {
		return sname;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setItems(Item[] items) {
		this.items = items;
	}

	public Item[] getItems() {
		return items;
	}

	// toString

	public String toString() {
		return "Supplier :" + sid + " " + sname + " " + phonenumber + " " + Arrays.toString(items);
	}
}
