package com.demo4;

import java.util.Scanner;

public class CarGetterSetter {

	static Scanner sc = new Scanner(System.in);

	public static void enterCar(Car c) {
		System.out.println("Enter car name");
		c.setName(sc.next());

		System.out.println("Enter car number");
		c.setCarno(sc.nextInt());

		System.out.println("Enter the no of driver you want");
		int n = sc.nextInt();

		Driver dr[] = new Driver[n];
		for (int i = 0; i < n; i++) {
			dr[i] = new Driver();

			System.out.println("Enter the driver name");
			dr[i].setName(sc.next());

			System.out.println("Enter the driver phone_no");
			dr[i].setNumber(sc.next());

		}
		c.setDriver(dr);
	}

	public static void enterCar1(Car c) {
		System.out.println("Enter car name");
		c.setName(sc.next());

		System.out.println("Enter car number");
		c.setCarno(sc.nextInt());

		System.out.println("Enter the no of driver you want");
		int n = sc.nextInt();

		c.setDriver(new Driver[n]);
		for (int i = 0; i < n; i++) {
			c.getDriver()[i] = new Driver();

			System.out.println("Enter the driver name");
			c.getDriver()[i].setName(sc.next());

			System.out.println("Enter the driver phone_no");
			c.getDriver()[i].setNumber(sc.next());

		}

	}

	public static void printCar(Car cr[]) {
		for (Car ca : cr) {
			System.out.println(ca.getCarno() + " " + ca.getName());
			for (Driver d : ca.getDriver()) {
				System.out.println(d);
			}
			System.out.println("=======================================");
		}
	}

	public static void getCarName(Car ca[]) {
		System.out.println("=============================");
		System.out.println("Enter the driver name to search");
		String iname = sc.next();
		for (Car cc : ca) {
			for (Driver d : cc.getDriver()) {
				if (d.getName().equals(iname)) {
					System.out.println(cc.getCarno() + " " + cc.getName());
				}
			}
		}

	}

	public static void main(String[] args) {

		Car cr[] = new Car[3];
		for (int i = 0; i < cr.length; i++) {
			cr[i] = new Car();
			enterCar(cr[i]);
		}
		getCarName(cr);
	}

}
