package com.loose1;

public class OnlineShopping {

	int cid;
	String name;

	OnlineShopping() {

	}

	OnlineShopping(int cid, String name) {
		this.cid = cid;
		this.name = name;

	}

	public void PayBill(Payment pay, double amount) {
		pay.doTransaction(amount);
	}

	public void PayBill(DebitCard d, double amount) {
		d.doTransaction(amount);
	}

	public void PayBill(DebitCard d, double amount, double discount) {
		amount = amount - ((discount / 100) * amount);
		d.doTransaction(amount);

	}

	public static void main(String[] args) {

		OnlineShopping obj1 = new OnlineShopping(100, "sahili");

		CreditCard card = new CreditCard(12345, 222, 60000);

		obj1.PayBill(card, 6000);

		Payment pay;

		pay = new CreditCard(87757, 123, 90000);

		obj1.PayBill(pay, 78000);

		obj1.PayBill(pay, 20000);

		pay = new DebitCard(765765, 50000);

	}
}
