package com.sye.bytes.ds.stack;

public class Stack {
	
	int []arr;
	int maxSize;
	int top;
	
	public Stack (int maxSize) {
		this.arr= new int[maxSize];
		this.maxSize= maxSize;
		this.top=-1;
	}
	
	public void push(int val) {
		
		if(!this.isFull()) {
			top++;
			arr[top] =val;
			
		}else {
			System.out.println("Stack is full");
		}
		
		
		
	}
	
	public int pop() {
		int val=0;
		if(!this.isEmpty()) {
			val=arr[top];
			top--;
		}else {
			System.out.println("Stack is empty");
		}
		
		return val;
	}
	
	public int peek() {
		return arr[top];
	}
	
	public boolean isEmpty() {
		
		return top==-1;
	}
	
	public boolean isFull() {
		
		return top==maxSize-1;
	}

}
