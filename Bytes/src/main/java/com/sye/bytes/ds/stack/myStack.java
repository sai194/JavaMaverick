package com.sye.bytes.ds.stack;

class myStack {

	private int size;
	private int[] stackArray;
	private int top;

	// Stack Constructor
	public myStack(int s) { // takes size as a parameter
		stackArray = new int[s]; // allocate memory for the array
		size = s;
		top = -1; // when the stack is empty initially
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == size - 1;
	}

	public int top() {
		if (!isEmpty())
			return stackArray[top];

		System.err.println("Stack is Empty");
		return -1;
	}

	public boolean push(int val) {
		if (!isFull()) {
			top++;
			stackArray[top] = val;
			return true;
		}
		return false;
	}

	public int pop() {
		if (!isEmpty()) {
			return stackArray[top--];
		}
		System.err.println("Your Stack is empty");
		return -1;
	}

	public static void main(String[] args) {

		myStack stack = new myStack(5);
		for (int i = 0; i < 5; i++) {
			stack.push(i); // pushes 5 elements (0-4 inclusive) to the stack
		}

		System.out.println("Is Stack full? \n" + stack.isFull());

		for (int i = 0; i < 5; i++) {
			System.out.print(stack.pop() + " "); // pops all 5 elements from the stack and prints them
		}

		System.out.println("\nIs Stack empty? \n" + stack.isEmpty());

	}// end of main

}