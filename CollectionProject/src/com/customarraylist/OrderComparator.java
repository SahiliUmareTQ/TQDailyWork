package com.customarraylist;

import java.util.Comparator;

public class OrderComparator implements Comparator<Order> {

	@Override
	public int compare(Order r1, Order r2) {
		return 0;

		// return r1.getPrice().compareTo(r2.getPrice());
	}

}
