package com.demo;

class Car implements Movable

{
	public void move() {
		System.out.println("car is moving :" + speed);
	}
}

class Ball implements Movable

{
	public void move() {
		System.out.println("Ball is rooling :" + speed);
	}
}

class Person implements Movable

{
	public void move() {
		System.out.println("Person is moving :" + speed);
	}

}

public class MoveTest {

	public static void main(String[] args) {

		Movable m;
		m = new Car();
		m.move();

		m = new Ball();

		m.move();

		m = new Person();
		m.move();
	}

}
