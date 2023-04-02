package com.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();

		// System.out.println(list.getFirst()); throws exception

		// System.out.println(list.peekFirst()); ---> return null if String list is
		// empty

		// System.out.println(list.remove()); ----> throws NoSuchElementException

		list.add("Sahili");
		list.add("Swapnil");
		list.add("Badal");
		list.add("Neha");

		System.out.println(list);

		System.out.println("------------------------");

		list.addFirst("Rani");
		list.addLast("Sarika");

		System.out.println(list);

		System.out.println("------------------------");

		list.offer("Asmita");
		list.offerFirst("Abhi");
		System.out.println(list);

		// get and peek

		System.out.println("------------------");

		System.out.println(list.get(1)); // get first index from string

		System.out.println(list.getFirst()); // get first String

		System.out.println(list.getLast()); // gives last from String

		System.out.println(list.peekFirst()); // get first String

		System.out.println("------------------------");

		// remove and poll

		System.out.println(list.remove());

		System.out.println("Removed:" + list.remove(3));

		System.out.println("Remover poll:" + list.poll()); // remove first

		System.out.println(list.removeFirstOccurrence(list));

		System.out.println(list.removeLastOccurrence(list));

	}

}
