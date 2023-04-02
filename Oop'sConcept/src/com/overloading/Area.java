package com.overloading;

public class Area {

	void Square(int side) {
		System.out.println("Area of square is" + (side * side));
	}

	void Rectangle(int lenght, int breadth) {
		System.out.println("Area of rectangle is" + (lenght * breadth));
	}

	void Triangle(int lenght, int breadth) {
		System.out.println("Area of triangle is" + (1 / 2 * (lenght * breadth)));
	}

	void Circle(float rad) {
		System.out.println("Area of circle is" + (0.137 * (rad * rad)));
	}

	public static void main(String[] args) {

		Area a = new Area();
		a.Circle(25f);
		a.Rectangle(12, 12);
		a.Square(2);
		a.Triangle(10, 10);
	}

}
