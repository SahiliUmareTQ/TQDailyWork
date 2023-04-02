package com.encapsulation;

public class ObjectPassing {

	static void incmarks() {

	}

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setAge(25);
		s1.setId(101);
		s1.setName("Sahili");

		System.out.println(s1.getAge() + " " + s1.getId());
	}

}
