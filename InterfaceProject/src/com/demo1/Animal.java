package com.demo1;

class Cat implements Sayable {
	public void say() {
		System.out.println("Mewo");
	}
}

class Dog implements Sayable

{
	public void say() {
		System.out.println("Barking");
	}
}

class Horse implements Sayable

{
	public void say() {
		System.out.println("Neigh");
	}
}

public class Animal {

	public static void main(String[] args) {
		Cat c = new Cat();
		c.say();

		Sayable s = new Cat();
		s.say();

		s = new Dog();
		s.say();

		s = new Horse();
		s.say();

	}

}
