package com.stack;

class MyStack {
	int top;
	int size;
	int[] stk;

	public MyStack() {

	}

	MyStack(int size) {
		top = -1;
		this.size = size;
		stk = new int[this.size];

	}

	void push(int data) {
		if (top < size - 1) {
			top++;
			stk[top] = data;
			System.out.println("Element Inserted");

		} else {
			System.out.println("Overflow");
		}
	}

	void pop1() {
		if (top != -1) {
			System.out.println("Element deleted:" + stk[top]);
			top--;
		}

		else {
			System.out.println("Underflow situation");
		}
	}

	void show1() {
		if (top != -1) {
			for (int i = 0; i <= top; i++) {
				System.out.println(stk[i]);
			}
		} else {
			System.out.println("Stack is empty");
		}

	}

	public class StackAsArray {

		public static void main(String[] args) {

			MyStack s1 = new MyStack(4);

			s1.pop1();
			s1.push(45);
			s1.push(89);

			s1.show1();

			s1.pop1();

			s1.push(78);
			s1.push(23);
			s1.push(14);

			s1.push(67);

			s1.pop1();
			s1.pop1();
			s1.pop1();

			s1.show1();

			s1.pop1();

			s1.show1();

		}

	}

}
