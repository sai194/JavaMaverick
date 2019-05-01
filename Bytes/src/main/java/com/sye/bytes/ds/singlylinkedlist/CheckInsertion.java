package com.sye.bytes.ds.singlylinkedlist;

//Access HeadNode => list.headNode;
//Check if list is empty => list.isEmpty();  
//Node class  { int data ; Node nextElement;}
class CheckInsertion {
	// Inserts a value at the end of the list
	public static String insertAtEnd(linkedList list, int value) {
		String result = "";
		Node currentNode = list.headNode;
		Node newNode = new Node(value, null);
		if (currentNode.nextElement == null) {
			// Needs to Insert the new node At Head
			currentNode.nextElement = newNode;

			return elements(list);
		}

		while (currentNode.nextElement != null) {
			currentNode = currentNode.nextElement;
		}
		currentNode.nextElement = newNode;

		return elements(list);
	}

	public static String elements(linkedList list) {

		String elementsList = "";

		Node start = list.headNode.nextElement;

		while (start != null) {
			elementsList += start.data;
			elementsList += "->";
			start = start.nextElement;
		}

		elementsList += "null";

		return elementsList;
	}

	public static void main(String args[]) {

		linkedList list = new linkedList();

		for (int i = 1; i < 6; i++) {
			insertAtEnd(list, i); // inserting value at the tail of the list
			list.printList();
		}
	}
}