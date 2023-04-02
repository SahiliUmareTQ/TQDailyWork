package com.loose1;

public class CreditCard implements Payment {

	private int cardNumber;
	private int cvv;
	private double limit;

	public CreditCard() {

	}

	public CreditCard(int cardNumber, int cvv, double limit) {

		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.limit = limit;
	}

	public void doTransaction(double amount) {

		if ((this.limit - amount) >= 0) {
			System.out.println("Credit Card is debited by:" + amount);
			this.limit = this.limit - amount;
		}

		else {
			System.out.println("Insuffient balance:" + this.limit);
		}

	}

}
