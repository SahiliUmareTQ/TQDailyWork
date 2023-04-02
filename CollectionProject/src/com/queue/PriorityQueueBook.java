package com.queue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueBook {

	class PriceComparator implements Comparator<Book> {
		@Override
		public int compare(Book b1, Book b2) {

			if (b1.getPrice() == b2.getPrice())
				return 0;
			else if (b1.getPrice() < b2.getPrice())
				return 1;
			else
				return -1;

		}
	}

	public static void main(String[] args) {

		PriorityQueue<Book> pqb = new PriorityQueue<>();

		pqb.add(new Book(101, "Harry Potter", 764f));
		pqb.add(new Book(100, "Ramayan", 764f));
		pqb.add(new Book(105, "Hamlet", 764f));
		pqb.add(new Book(104, "The Secret", 900f));
		pqb.add(new Book(103, "Life", 890f));

		Iterator<Book> itr = pqb.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
