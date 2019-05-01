package com.sye.bytes.ds.doublelinkedlist;

//Access HeadNode => list.headNode;
//Check if list is empty => list.isEmpty();  
//Node class  { int data ; Node nextElement;}
class checkReverse {

	public static String reverse(doublyLinkedList list) {

		Node prev = null; // To keep track of the previous element, will be used in swapping links
		Node current = list.headNode.nextElement; // firstElement
		Node next = null;

		// While Traversing the list, swap links
		while (current != null) {
			next = current.nextElement;
			current.nextElement = prev;
			prev = current;
			current = next;
		}
		// Linking Head Node with the new First Element
		list.headNode.nextElement = prev;
		return elements(list);
	}

	// Helper Function to convert List elements in a single string
	public static String elements(doublyLinkedList list) {

		String elementsList = "";

		Node start = list.headNode;

		while (start != null) {
			elementsList += start.data;
			elementsList += "->";
			start = start.nextElement;
		}

		elementsList += "null";
		return elementsList;
	}

	public static void main(String args[]) {
		doublyLinkedList list = new doublyLinkedList(); // created linked list

		for (int i = 1; i <= 5; i++) {
			list.insertAtHead(i); // inserting data in list
		}

		System.out.println("Before: " + elements(list));

		System.out.println("After: " + reverse(list));
	}
}