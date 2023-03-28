package com.cardemo;

public class Information {

	public static void main(String[] args) {

		Car c1 = new Car(8134, "S-cross", 1200000f, 162);
		Car c2 = new Car(1234, "Swift", 800000f, 456);

		Driver d1 = new Driver(30, "Raju", 101, c1);
		Driver d2 = new Driver(25, "Shankar", 100, c2);

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(d1);
		System.out.println(d2);

		d2.setCar(c2);
		System.out.println(d2);
	}

}
