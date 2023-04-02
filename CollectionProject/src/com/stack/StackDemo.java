package com.stack;

import java.util.Enumeration;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack<String> stk = new Stack<>();
		stk.push("Apple");
		stk.push("Mango");
		stk.push("Cherries");
		System.out.println(stk);

		System.out.println(stk.peek()); // retrive last elemnt without removing it

		System.out.println(stk);

		System.out.println(stk.pop()); // remove last element

		System.out.println(stk);

		System.out.println(stk.search("Mango")); // gives index

		Enumeration<String> en = stk.elements();
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}

}
