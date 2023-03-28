package com.stringbufferbuilder;

public class StringBufferBuilder {

	public static void main(String[] args) {

		StringBuffer str = new StringBuffer("Program");

		System.out.println(str.capacity());

		System.out.println(str.length());

		StringBuffer str1 = new StringBuffer(8);
		System.out.println(str1.capacity());

		str1.ensureCapacity(19);// oldcapacity*2+2

		System.out.println(str1.capacity());

		str.append(" of Java");
		System.out.println(str);

		str.replace(8, 11, "in ");
		System.out.println(str);

		str.insert(11, "Core ");
		System.out.println(str);

		str.reverse();
		System.out.println(str);

	}

}
