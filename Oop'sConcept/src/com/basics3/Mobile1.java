package com.basics3;

public class Mobile1 {

	float prize;
	float version; // 6.0
	float RAM; // 3.00GB
	String Name;
	String colour;

	void enterDetails(float p, float v, float r, String n, String clr) {
		prize = p;
		version = v;
		RAM = r;
		Name = n;
		colour = clr;

	}

	void showDetails() {
		System.out.println("prize is :" + prize);

		System.out.println("version is :" + version);

		System.out.println("RAM is :" + RAM);

		System.out.println("name is :" + Name);

		System.out.println("colour is :" + colour);
	}

	public static void main(String[] args) {

		Mobile1 m = new Mobile1();

		m.enterDetails(150000f, 6.0f, 3.00f, "Lenovo Note_k5", "Black");
		m.showDetails();

	}

}
