package com.stringdemo;

public class StringBufferMethod {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("Java");

		// Append Method
		sb1.append("Code");
		// original string is changed
		System.out.println("After Append :" + sb1);

		// insert Method
		StringBuffer sbf = new StringBuffer("Hello");
		sbf.insert(1, "World");
		// original string is changed
		System.out.println("After insert :" + sbf);

		// replace method
		StringBuffer sb = new StringBuffer("Hello");
		sb.replace(1, 3, "World");
		System.out.println("After replace :" + sb);

		// delete
		StringBuffer sb2 = new StringBuffer("Hello");
		sb2.delete(1, 3);
		System.out.println("After delete :" + sb2);

		// reverse
		StringBuffer sb3 = new StringBuffer("Hello");
		sb3.reverse();
		System.out.println("After reverse :" + sb3);

		StringBuffer sb4 = new StringBuffer();

		System.out.println(sb4.capacity()); // by default 16
		sb4.append("Hello");
		System.out.println(sb4.capacity()); // now 16
		sb4.append("Java is my favourite language");
		System.out.println(sb4.capacity());

		System.out.println("-------------------------------------");

		StringBuffer sb5 = new StringBuffer();
		System.out.println(sb5.capacity()); // by default 16
		sb5.append("Hello");
		System.out.println(sb5.capacity()); // now 16
		sb5.append("Java is my favourite language");
		System.out.println(sb5.capacity());

		// ensureCapacity
		sb5.ensureCapacity(10); // no change
		System.out.println(sb5.capacity()); // now 34=(16*2)*2

		sb5.ensureCapacity(50); // no change
		System.out.println(sb5.capacity()); // now (34*2)+2
	}

}
