package com.demo;

public class Author {

	private int id;
	private String name;

	public Author() {

	}

	Author(int id, String name) {
		this.id = id;
		this.name = name;

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

	// toString
	public String toString() {
		return "Author id:" + id + ", name:" + name + "";
	}

}
