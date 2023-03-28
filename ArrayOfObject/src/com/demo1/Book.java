package com.demo1;

public class Book {

	private int bookid;
	private String bookname;
	private float bookprice;

	Book() {

	}

	Book(int bookid, String bookname, float bookprice) {

		this.bookid = bookid;
		this.bookname = bookname;
		this.bookprice = bookprice;

	}

	// getter setter
	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public float getBookprice() {
		return bookprice;
	}

	public void setBookprice(float bookprice) {
		this.bookprice = bookprice;
	}

	// toString
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", bookprice=" + bookprice + "]";
	}

}
