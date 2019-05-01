package com.sye.bytes.ds.doublelinkedlist;
class doublyLinkedList {
   
  //checks if the list is empty
  public boolean isEmpty(){
  if(headNode.nextElement==null) return true; //is empty  
    return false; //is not empty
  }
  
  //prints the list 
  public boolean printList(){  
    if(isEmpty()) {
      System.out.println("List is Empty");
      return false;
    }    
    Node temp=headNode.nextElement; //temp used to traverse the list
     
    while(temp.nextElement!=null){ //traverse the list till the end
       System.out.print(temp.data+"->");
       temp=temp.nextElement; //move to the next node
    }
    System.out.println(temp.data+"->null");
    return true;    
  } //end of print list
  
  public void insertAtHead(int dt){
    //create node and put in the data
    Node newNode = new Node(); 
    newNode.data = dt;
  
    // Make next of new node as head and previous as NULL
    newNode.nextElement = headNode; 
    newNode.previousElement = null; 
  
    //Change previous of head node to new node
    if (headNode != null) 
        headNode.previousElement = newNode; 
  
    //move the head to point to the new node
    headNode = newNode; 
  }
  
  //delete the head node
  public boolean deleteAtHead() {
    headNode = headNode.nextElement;
    headNode.previousElement = null;
    return true;
  }
  
  //search for a particular node and delete it
	public boolean delete(int dt) {
		boolean deleted = false;

		if (isEmpty()) { //node not found because list is empty
			System.out.println("List is Empty");
			return deleted; //deleted is false here
		}

		if (headNode.nextElement.data == dt) { //head node is the required node
      deleteAtHead(); 
      headNode.nextElement.previousElement = headNode;
    }

    //node not found at null, start traversing the list with head's next node
		Node currentNode = headNode.nextElement; 
    
		//Node previousNode=null; was used in singly linked list
		//Traversing/Searching for Node to Delete
		while (currentNode != null) {
			if (dt == currentNode.data) { //node found
        
        //delete the found node
				currentNode.previousElement.nextElement = currentNode.nextElement;
        currentNode.nextElement.previousElement = currentNode.previousElement;

				// previousNode.nextElement=tempNode.nextElement; was used in singly linked list    
				deleted = true;
				break;
			}
			//previousNode=tempNode; was used in singly linked list
			currentNode = currentNode.nextElement;
		} //end of while loop

		if (deleted == false) //node not found
      System.out.println(dt + " is not in the list !");
		else {
			System.out.println(dt + " Deleted!");
			printList();
		} //end of else
		return deleted;
	} //end of the delete method
  
  public static void main(String args[]) {
		doublyLinkedList list = new doublyLinkedList();
		//list.printList();
		for (int i = 1; i <= 10; i++) {
			list.insertAtHead(i);
		}
    System.out.println("List:");
    list.printList();
    list.delete(5);
    list.delete(6);
    list.delete(5);
	} //end of main method
  
	 Node headNode;
} //end of the linked-list class