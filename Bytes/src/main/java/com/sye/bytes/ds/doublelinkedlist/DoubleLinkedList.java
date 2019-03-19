package com.sye.bytes.ds.doublelinkedlist;

public class DoubleLinkedList {

	Node first;
	Node last;

	public DoubleLinkedList() {
		first = null;
		last = null;
	}

	private boolean isEmpty() {
		return first == null;
	}

	public void insertFirst(int data) {
		Node newNode = new Node(data);

		if (isEmpty()) {
			// first = newNode;
			last = newNode;
		} else {

			first.prev = newNode;
			newNode.next = first;
		}

		first = newNode;

	}

	public void insertLast(int data) {

		Node newNode = new Node(data);

		if (isEmpty()) {
			first = newNode;
			// last = newNode;
		} else {
			last.next = newNode;
			newNode.prev = last;
		}

		last = newNode;

	}

	public int deleteFirst() {

		if (isEmpty()) {

			return -1;
		}
		int val = first.val;
		first = first.next;
		first.prev = null;

		return val;
	}

	public int deleteLast() {

		if (isEmpty()) {

		}
		int val = last.val;
		last = last.prev;
		last.next = null;

		return val;
	}

	public void displayForward() {
		System.out.println("###############");
		Node display = first;

		while (display != null) {
			System.out.print(display.val + " ");
			display = display.next;
		}
		System.out.println();

	}

	public void displayBackward() {
		System.out.println("###############");
		Node display = last;

		while (display != null) {
			System.out.print(display.val + " ");
			display = display.prev;
		}
		System.out.println();
	}

	public void deleteVal(int val) {

		Node removeNode = first;

		while (removeNode != null) {
			if (removeNode.val == val && removeNode == first) {
				first = first.next;
				first.prev = null;
				return;
			} else if (removeNode.val == val && removeNode == last) {
				last =last.prev;
				last.next=null;
				return;
			} else if (removeNode.val == val) {
				removeNode.prev.next =removeNode.next;
				removeNode.next.prev=removeNode.prev;
				return;
			} else {

			}
			removeNode = removeNode.next;
		}

	}

}
