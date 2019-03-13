package com.sye.bytes.singlylinkedlist;

public class SinglyLinkedListController {

	public static void main (String []args) {
		
		SinglyLinkedList myList = new SinglyLinkedList();
		myList.insertFirst(100);
		myList.insertFirst(50);
		myList.insertFirst(99);
		myList.insertFirst(88);
		myList.insertLast(108108108);
		myList.displayList();
	}
}
