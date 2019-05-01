package com.sye.bytes.ds.doublelinkedlist;
//Access HeadNode => list.headNode;
//Check if list is empty => list.isEmpty();  
//Node class  { int data ; Node nextElement;}
class CheckLength {
  public static int length(doublyLinkedList list) {

    //start from the first element    
    Node current = list.headNode.nextElement;
    int count = 0;

    //Traverse the list and count the number of nodes
    while (current != null) {
      count++;
      current = current.nextElement;
    }

    return count;
  }

  public static void main(String args[]) {
	  doublyLinkedList list = new doublyLinkedList();      // created linked list

    for(int i = 1; i <= 8; i++) {
      list.insertAtHead(i);      // inserting data in list
    }
    
    int listLength = length(list);    // calling length function
    System.out.println("Length of the list: " + listLength);
   
  }
}