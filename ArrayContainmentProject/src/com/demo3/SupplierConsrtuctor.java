package com.demo3;

public class SupplierConsrtuctor {

	public static void main(String[] args) {

		Supplier s[] = new Supplier[3];

		Item i1[] = new Item[3];
		i1[0] = new Item(1, "Apple", 87);
		i1[1] = new Item(2, "Guvava", 75);
		i1[2] = new Item(3, "oranges", 50);

		s[0] = new Supplier(101, "Mr.Ram", "7896541230", i1);

		Item i2[] = new Item[2];
		i2[0] = new Item(1, "Pineapple", 90);
		i2[1] = new Item(2, "kiwi", 82);

		s[1] = new Supplier(102, "Mr.Rahul", "852147963", i2);

		Item i3[] = new Item[2];
		i3[0] = new Item(1, "orange", 68);
		i3[1] = new Item(2, "kiwi", 95);

		s[2] = new Supplier(103, "Mr.Sham", "952078965", i3);

		for (Supplier st : s) {
			System.out.println(st.getSid() + " " + st.getSname() + " " + st.getPhonenumber());
			for (Item i : st.getItems()) {
				System.out.println(i);
			}
			System.out.println("=======================================");
		}

	}

}
