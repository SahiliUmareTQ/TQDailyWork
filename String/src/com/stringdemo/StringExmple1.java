package com.stringdemo;

public class StringExmple1 {

	public static void main(String[] args) {

		String s1 = "Hello";
		// only one object is created in static pool area as such obj is not there

		String s2 = "Hello";
		// no obj is created bcoz such ojb is already there

		String str1 = new String("Good Morning");
		// one obj is created n Heap nd one in SCP
		// SCP obj "Good morning" is internal ref created

		String str2 = new String("Good Morinig");
		// Here obj is created in heap but not in scps

	}

}
