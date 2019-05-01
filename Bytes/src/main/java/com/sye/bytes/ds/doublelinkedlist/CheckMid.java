package com.sye.bytes.ds.doublelinkedlist;
 //Access HeadNode => list.headNode;
//Check if list is empty => list.isEmpty();  
//Node class  { int data ; Node nextElement;}
class CheckMid {

  public static int findMid(doublyLinkedList list) {

    //list is empty
    if (list.isEmpty()) return 0;

    //currentNode starts at the head
    Node currentNode = list.headNode.nextElement;

    if (currentNode.nextElement == null) { //linked list = headPointer->currentNode->null
      //Only 1 element exist in array so return its value.
      return currentNode.data;
    }

    Node midNode = currentNode; //midNode starts at headNode
    currentNode = currentNode.nextElement.nextElement; //currentNode moves two steps forward

    //Move midNode (Slower) one step at a time
    //Move currentNode (Faster) two steps at a time
    //When currentNode reaches at end, midNode will be at the middle of List 
    while (currentNode != null) {

      midNode = midNode.nextElement;

      currentNode = currentNode.nextElement;
      if (currentNode != null) currentNode = currentNode.nextElement;

    }
    if (midNode != null) return midNode.data;
    return 0;
  }

  public static void main(String args[]) {
	  doublyLinkedList list = new doublyLinkedList();      // created linked list

    list.insertAtHead(7);      // inserting data in list
    list.insertAtHead(14);      // inserting data in list
    list.insertAtHead(10);      // inserting data in list
    list.insertAtHead(20);      // inserting data in list
    list.insertAtHead(21);      // inserting data in list
    list.insertAtHead(32);      // inserting data in list
    list.insertAtHead(43);      // inserting data in list


    int mid = findMid(list);    // calling CheckMid function
    System.out.println("Middle element of the list : " + mid);
  }
}