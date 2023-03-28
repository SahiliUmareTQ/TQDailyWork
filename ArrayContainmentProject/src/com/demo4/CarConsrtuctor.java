package com.demo4;

public class CarConsrtuctor {

	public static void main(String[] args) {

		Car c1[] = new Car[3];

		Driver d1[] = new Driver[3];
		d1[0] = new Driver("Rajesh", "1234667890");
		d1[1] = new Driver("Ram", "8521479630");
		d1[2] = new Driver("Suraj", "8522222630");

		c1[0] = new Car(1234, "S-cross", d1);

		Driver d2[] = new Driver[2];
		d2[0] = new Driver("Shyam", "1456666660");
		d2[1] = new Driver("Ajay", "8533333333");

		c1[1] = new Car(6666, "Swift", d2);

		Driver d3[] = new Driver[2];
		d3[0] = new Driver("Raju", "9999999999");
		d3[1] = new Driver("Vicky", "231456987");

		c1[2] = new Car(8134, "Thar", d3);

		for (Car c : c1) {
			System.out.println(c.getCarno() + " " + c.getName());
			for (Driver d : c.getDriver()) {
				System.out.println(d);
			}
			System.out.println("===================================");
		}
	}

}
