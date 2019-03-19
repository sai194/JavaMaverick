package com.sye.bytes.ds.circularlinkedlist;

public class CircularLinkedListController {

	public static void main(String[] args) {
		CircluarLinkedList mylist = new CircluarLinkedList();
		mylist.insertFirst(100);
		mylist.insertFirst(50);
		mylist.insertFirst(99);
		mylist.insertFirst(88);
		mylist.insertLast(9999999);
		
		mylist.displayList();

	}

}
