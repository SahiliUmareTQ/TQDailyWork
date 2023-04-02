package com.queue;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2.compareTo(o1);
	}

}

public class PriorityQueueDemo {

	public static void main(String[] args) {

		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		pq.add(10);
		pq.add(85);
		pq.add(68);
		pq.add(96);

		System.out.println(pq);

//		pq.add(null);
//		System.out.println(pq); // throws null pointer exception

		System.out.println(pq.poll());

		System.out.println(pq.peek());

		System.out.println(pq.offer(20));

		System.out.println(pq.remove(85));

	}

}
