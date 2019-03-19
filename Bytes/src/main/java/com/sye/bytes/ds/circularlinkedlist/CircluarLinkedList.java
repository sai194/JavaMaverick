package com.sye.bytes.ds.circularlinkedlist;

public class CircluarLinkedList {

	Node first;
	Node last;

	public CircluarLinkedList() {
		first = null;
		last = null;
	}

	private boolean isEmpty() {
		return first == null;
	}

	public void insertFirst(int data) {
		Node newNode = new Node(data);

		if (isEmpty()) {
			last = newNode;
		}
		newNode.next = first; // newNode --> old first
		first = newNode; // first place

	}

	public void insertLast(int data) {
		Node newNode = new Node(data);

		if (isEmpty()) {
			first = newNode;
		} else {
			last.next = newNode;
			last = newNode;
		}
	}

	public int deleteFirst() {
		
		if(isEmpty()) return -1;

		int val = first.val;
		
		if(first.next ==null) {
			last=null;
		}
		first = first.next;

		return val;

	}

	public void displayList() {
		Node display =first;
		
		while(display!=null) {
			System.out.println(display.val);
			display=display.next;
		}

	}

}
