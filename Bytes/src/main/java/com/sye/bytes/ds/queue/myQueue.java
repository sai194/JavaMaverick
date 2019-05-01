package com.sye.bytes.ds.queue;

class myQueue {

	private int size;
	 int queueArray[];
	private int front;
	private int back;
	private int numofItems;

	public myQueue(int s) {
		size = s;
		queueArray = new int[size];
		front = 0;
		back = -1;
		numofItems = 0;
	}

	public boolean isEmpty() {
		return numofItems == 0;
	}

	public boolean isFull() {
		return numofItems == size;
	}

	public int top() {
		if (!isEmpty()) {
			return queueArray[front];
		}
		return -1;
	}

	public void enqueue(int value) {
		if (isFull()) {
			return;
		}
		if (back == size - 1) {
			back = -1;
		}
		queueArray[++back] = value;
		numofItems++;
	}

	public int dequeue() {
		if (isEmpty()) {
			return -1;
		}
		if (front == size) {
			front = 0;
		}
		int val = queueArray[front++];
		numofItems--;
		return val;
	}

	public static void main(String[] args) {
		myQueue queue = new myQueue(5);
		queue.enqueue(2);
		queue.enqueue(4);
		queue.enqueue(6);
		queue.enqueue(8);
		queue.enqueue(10);

		queue.dequeue();
		queue.dequeue();

		queue.enqueue(12);
		queue.enqueue(14);

		System.out.println("Queue:");
		while (!queue.isEmpty()) {
			System.out.print(queue.dequeue() + " ");
		}

	}

	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}
}