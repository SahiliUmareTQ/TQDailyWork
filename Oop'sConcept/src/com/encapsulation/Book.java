package com.encapsulation;

public class Book {

	private int bookid;
	private String bookname;
	private String Author;
	private float price;

	public void setBookId(int bookid) {
		this.bookid = bookid;
	}

	public int getBookId() {
		return bookid;
	}

	public void setBookName(String bookname) {
		this.bookname = bookname;
	}

	public String getBookName() {
		return bookname;
	}

	public void setAuthor(String Author) {
		this.Author = Author;
	}

	public String getAuthor() {
		return Author;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getPrice() {
		return price;
	}

	public String toString() {
		return "BookId:" + bookid + "  Name:" + bookname + " Author:" + Author + "  Price:" + price;
	}
}
