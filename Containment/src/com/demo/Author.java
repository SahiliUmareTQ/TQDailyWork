package com.demo;

public class Author {

	private int authorId;
	private String authorname;
	private int authorage;

	// default constructor
	Author() {

	}

	// para constructor
	Author(int id, String authorname, int authorage) {

	}

	// getter setter
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public int gerAuthorId() {
		return authorId;
	}

	public void setAuthorName(String authorname) {
		this.authorname = authorname;
	}

	public String gerAuthorName() {
		return authorname;
	}

	public void setAuthorAge(int authorage) {
		this.authorage = authorage;
	}

	public int gerAuthorAge() {
		return authorage;
	}

	// toString method
	public String toString() {
		return "Author:" + authorId + "  " + authorname + " " + authorage;
	}

}
