package com.queue;

class MyQueue {
	int front;
	int size;
	int rear;
	int[] arr;

	public MyQueue() {

	}

	MyQueue(int size) {

		front = 0;
		rear = 0;
		this.size = size;
		arr = new int[this.size];
	}

	public void insert(int data) {
		if (rear < size) {
			arr[rear] = data;
			rear++;
			System.out.println("Element Inserted");
		} else {
			System.out.println("Overflow");
		}

	}

	public void delete(int i) {
		int temp;
		if (rear > front) {
			System.out.println("Element Deleted:" + arr[front]);
			for (temp = front; temp < rear - 1; temp++) {
				arr[temp] = arr[temp + 1];
			}
			arr[--rear] = 0;
		} else {
			System.out.println("Underflow");
		}
	}

	public void dispaly() {

		if (rear > front) {
			for (int i = front; i < rear; i++) {
				System.out.println(arr[i]);
			}
		} else {
			System.out.println("Queue is empty");
		}
	}

}

public class QueueAsArray {

	public static void main(String[] args) {

		MyQueue q = new MyQueue(4);
		q.insert(78);
		q.insert(98);
		q.dispaly();

		q.insert(62);
		q.insert(75);
		q.insert(32); // overflow

		q.dispaly();

		q.delete(78);
		q.delete(98);
		q.delete(62);
		q.delete(75);

		q.dispaly();
	}

}
