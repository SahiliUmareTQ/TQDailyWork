package com.pkg;

class Car implements Movable {

	@Override
	public void move() {
		System.out.println("car moving");

	}

}

class Bus implements Movable {

	@Override
	public void move() {
		System.out.println("bus moving");

	}
}

public class Test {

	public static void main(String[] args) {

		Movable m1; // create ref of interface
		m1 = new Car();
		m1.move();

		m1 = new Bus();
		m1.move();
	}

}
