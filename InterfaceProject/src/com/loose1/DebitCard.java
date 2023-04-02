package com.loose1;

public class DebitCard implements Payment {

	private int cardnumber;
	private double balance;

	public DebitCard() {
		super();

	}

	public DebitCard(int cardNumber, double balance) {
		super();
		this.cardnumber = cardNumber;
		this.balance = balance;
	}

	public void doTransaction(double amount) {

		if ((this.balance - amount) >= 1000) {
			System.out.println("Debit Card is debited by:" + amount);
			this.balance = this.balance - amount;
		}

		else {
			System.out.println("Insuffient balance:" + this.balance);
		}

	}

}
