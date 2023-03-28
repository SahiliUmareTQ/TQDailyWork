package com.demo3;

import java.util.Scanner;

public class SupplierGetterSetter {

	static Scanner sc = new Scanner(System.in);

	public static void enterSupplier(Supplier s) {

		System.out.println("Enter supplier id");
		s.setSid(sc.nextInt());

		System.out.println("Enter supplier name");
		s.setSname(sc.next());

		System.out.println("Enter supplier phone no");
		s.setPhonenumber(sc.next());

		System.out.println("Enter the no of items you supply");
		int n = sc.nextInt();

		Item itm[] = new Item[n];

		for (int i = 0; i < n; i++) {
			itm[i] = new Item();

			System.out.println("Enter item id");
			itm[i].setId(sc.nextInt());

			System.out.println("Enter item name");
			itm[i].setName(sc.next());

			System.out.println("Enter item price");
			itm[i].setUnitPrice(sc.nextDouble());

		}
		s.setItems(itm);

	}

	public static void enterSupplier1(Supplier s) {

		System.out.println("Enter supplier id");
		s.setSid(sc.nextInt());

		System.out.println("Enter supplier name");
		s.setSname(sc.next());

		System.out.println("Enter supplier phone no");
		s.setPhonenumber(sc.next());

		System.out.println("Enter the no of items you supply");
		int n = sc.nextInt();

		s.setItems(new Item[n]);

		for (int i = 0; i < n; i++) {
			s.getItems()[i] = new Item();

			System.out.println("Enter item id");
			s.getItems()[i].setId(sc.nextInt());

			System.out.println("Enter item name");
			s.getItems()[i].setName(sc.next());

			System.out.println("Enter item price");
			s.getItems()[i].setUnitPrice(sc.nextDouble());

		}

	}

	public static void printSupplier(Supplier sup[]) {
		for (Supplier st : sup) {
			System.out.println(st.getSid() + " " + st.getSname() + " " + st.getPhonenumber());
			for (Item i : st.getItems()) {
				System.out.println(i);
			}
			System.out.println("============================================");
		}

	}

	public static void getSupplierName(Supplier st[]) {
		System.out.println("========================================");

		System.out.println("Enter the item name to search");

		String iname = sc.next();
		for (Supplier s : st) {
			for (Item i : s.getItems()) {
				if (i.getName().equals(iname)) {
					System.out.println(s.getSname() + " " + s.getPhonenumber());
				}
			}
		}
	}

	public static void main(String[] args) {

		Supplier sup[] = new Supplier[3];
		for (int i = 0; i < sup.length; i++) {
			sup[i] = new Supplier();
			enterSupplier(sup[i]);
		}
		getSupplierName(sup);

	}

}
