package com.bank;

public class Account {

	private int accNumber;
	private String accName;
	private float balance;
	private String bankname;
	private int bankId;
	private int pancard;

	// default constructor
	Account() {

	}

	// para constructor
	Account(int accNumber, String accName, float balance) {
		this.accNumber = accNumber;
		this.accName = accName;
		this.balance = balance;

	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	public int getAccNumber() {
		return accNumber;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getAccName() {
		return accName;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public float getBalance() {
		return balance;
	}

	public void setBankName(String bankName) {
		this.bankname = bankName;
	}

	public String getBankName() {
		return bankname;
	}

	public void setBankId(int id) {
		this.bankId = id;
	}

	public int getBankId() {
		return bankId;
	}

	public void setPanCard(int pancard) {
		this.pancard = pancard;
	}

	public int getPanCard() {
		return pancard;
	}

	public String toString() {
		return "bankId:+" + bankId + "  BankName:" + bankname + "balance:" + balance;
	}
}
//return "BookId:" + bookid + "  Name:" + bookname + " Author:" + Author + "  Price:" + price;
