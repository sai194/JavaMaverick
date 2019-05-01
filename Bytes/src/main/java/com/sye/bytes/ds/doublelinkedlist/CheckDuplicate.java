package com.sye.bytes.ds.doublelinkedlist;

import java.util.HashSet;

//Access HeadNode => list.headNode;
//Check if list is empty => list.isEmpty();  
//Node class  { int data ; Node nextElement;}
class CheckDuplicate {

  public static String removeDuplicates(doublyLinkedList list) {

    Node currentNode = list.headNode.nextElement;
    Node prevNode = list.headNode;

    String check = "";

    //To store values of nodes which we already visited  
    HashSet < Integer > visitedNodes = new HashSet < Integer > ();

    //If List is not empty and there is more than 1 element in List  
    if (!list.isEmpty() && currentNode.nextElement != null) {

      while (currentNode != null) {

        Integer value = new Integer(currentNode.data);

        if (visitedNodes.contains(value)) {
          //currentNode is a duplicate as its value is already in the HashSet
          //so connect prevNode with currentNode's next element to remove it
          prevNode.nextElement = currentNode.nextElement;
          currentNode = currentNode.nextElement;
          continue;
        }      
        visitedNodes.add(currentNode.data); //Visiting currentNode for first time
        prevNode = currentNode;
        currentNode = currentNode.nextElement;
      }//end of while

    }//end of if
    return elements(list);
  }

  //Helper Function to convert List elements in a single string
  public static String elements(doublyLinkedList list) {

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
	  doublyLinkedList list = new doublyLinkedList();      // created linked list

    for(int i = 1; i <= 8; i++) {
      list.insertAtHead(i);      // inserting data in list
    }
    
    list.insertAtHead(2);
    list.insertAtHead(4);
    list.insertAtHead(1);
    
    String beforeRemoveDuplicate = elements(list);
    String afterRemoveDuplicate = removeDuplicates(list); // calling removeDuplicates function
    System.out.println("List before deleting duplicates from list :" + beforeRemoveDuplicate);
    System.out.println("List after deleting duplicates from list :" + afterRemoveDuplicate);
  }
  

}