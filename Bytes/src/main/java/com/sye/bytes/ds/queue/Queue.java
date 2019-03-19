package com.sye.bytes.ds.queue;

public class Queue {

	private int maxSize;
	private long[] queArray;
	private int front;
	private int rear;
	private int nItems;

	public Queue(int size) {
		this.maxSize = size;
		this.queArray = new long[size];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	public void insert(long val) {

		if(rear == maxSize -1){
			rear = -1;
		}
		nItems++;
		queArray[++rear] = val;
		//System.out.print(val);
	}

	public long remove() { 

		long temp = queArray[front];
		front++;
		if(front == maxSize){
			front = 0; 
		}
		nItems--;
		return temp;
	}

	public long peekFront() {

		return queArray[front];

	}

	public boolean isEmpty() {

		return nItems == 0;
	}

	public boolean isFull() {

		return nItems == maxSize;
	}

	public void view() {
		
		int start =front;
		System.out.print("[ ");
		while(start <= rear) {
			System.out.print(queArray[start]+" ");
			start++;
		}
		System.out.print(" ]");

	}

}
