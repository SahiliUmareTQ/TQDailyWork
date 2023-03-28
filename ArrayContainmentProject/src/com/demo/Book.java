package com.demo;

import java.util.Arrays;

public class Book {
	private int id;
	private String bname;
	private float bprice;
	private Author author[];

	Book() {

	}

	Book(int id, String bname, float bprice, Author author[]) {
		this.id = id;
		this.bname = bname;
		this.bprice = bprice;
		this.author = author;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.bname = name;
	}

	public String getName() {
		return bname;
	}

	public void setBPrice(float price) {
		this.bprice = price;
	}

	public float getBPrice() {
		return bprice;
	}

	public void setAuthor(Author author[]) {
		this.author = author;
	}

	public Author[] getAuthor() {
		return author;
	}

	public String toString() {
		return "Book :" + id + " " + bname + " " + bprice + " " + Arrays.toString(author);

	}
}
