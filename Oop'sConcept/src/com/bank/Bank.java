package com.bank;

import java.util.Scanner;

public class Bank {

	static Scanner sc = new Scanner(System.in);

	static void deposit(Account a) {
		System.out.println("Enter the amount to be deposited");
		float amount = sc.nextFloat();
		if (a.getBalance() + amount >= 500000) {
			System.out.println("Balance exceeding 50000 enter pan card details:");
			String pan = sc.next();
			a.getPanCard();

		}
		a.setBalance(a.getBalance() + amount);
		System.out.println("Current balance:" + a.getBalance());

	}

	static void withdrawl(Account a) {
		System.out.println("Enter the amount to be withdrawl:");
		float amount = sc.nextFloat();

	}

	public static void main(String[] args) {

		/*
		 * Account ac = new Account();
		 * 
		 * ac.setAccName("sahili"); ac.setAccNumber(1234); ac.setBalance(10005f);
		 * ac.setBankName("SBI");
		 * 
		 * Account ac1 = new Account(1234, "SBI", 12305f); System.out.println(ac1);
		 */

		Account ac1 = new Account(1234, "SBI", 12000f);
		System.out.println(ac1);

	}
}