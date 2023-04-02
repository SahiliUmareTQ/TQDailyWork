package com.customarraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class OrderTest {

	public static void main(String[] args) {

		ArrayList<Order> or = new ArrayList<>();
		or.add(new Order(101, "Apple", 60.0f));
		or.add(new Order(102, "Orange", 80.0f));
		or.add(new Order(103, "Kiwi", 100f));
		or.add(new Order(104, "Banana", 40.0f));
		or.add(new Order(105, "Papaya", 80.0f));

		Iterator<Order> itr = or.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		// Collections.sort(or);

	}

}
