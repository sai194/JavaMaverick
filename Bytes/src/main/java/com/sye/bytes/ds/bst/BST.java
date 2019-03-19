package com.sye.bytes.ds.bst;

import java.util.Stack;

public class BST {

	Node root;

	public void insert(int key, String value) {

		Node newNode = new Node(key, value);
		if (root == null) {
			root = newNode;
			return;
		}

		Node current = root;
		Node parent = root;
		while (current != null) {
			parent = current;
			if (key <= current.key) {
				current = current.leftChild;
			} else {
				current = current.rightChild;
			}
		}

		if (key <= parent.key) {
			parent.leftChild = newNode;
		} else {
			parent.rightChild = newNode;
		}

	}

	public Node findMin() {

		Node current = root;

		while (current.leftChild != null) {
			current = current.leftChild;
		}
		System.out.println(" Min is -> " + current.key + " - " + current.value);
		return current;
	}

	public Node findMax() {

		Node current = root;

		while (current.rightChild != null) {
			current = current.rightChild;
		}
		System.out.println(" Max is -> " + current.key + " - " + current.value);
		return current;
	}

	public boolean remove(int key) {
		System.out.println("Removing "+key);
		Node nodeToDelete = root;
		Node parent = root;
		boolean isLeft = false;
		while (nodeToDelete != null && key != nodeToDelete.key) {
			parent = nodeToDelete;
			if (key < nodeToDelete.key) {
				nodeToDelete = nodeToDelete.leftChild;
				isLeft = true;
			} else {
				nodeToDelete = nodeToDelete.rightChild;
				isLeft = false;
			}
		}

		if (null == nodeToDelete) {
			return false;
		}

		if (nodeToDelete.leftChild == null && nodeToDelete.rightChild == null) {
			if (nodeToDelete == root) {
				root = null;
			}
			if (isLeft) {
				parent.leftChild = null;
			} else {
				parent.rightChild = null;
			}

		} else if (nodeToDelete.leftChild != null && nodeToDelete.rightChild == null) {
			if (nodeToDelete == root) {
				root = nodeToDelete.leftChild;
			}
			if (isLeft) {
				parent.leftChild = nodeToDelete.leftChild;
			} else {
				parent.rightChild = nodeToDelete.leftChild;
			}

		} else if (nodeToDelete.leftChild == null && nodeToDelete.rightChild != null) {
			if (nodeToDelete == root) {
				root = nodeToDelete.rightChild;
			}
			if (isLeft) {
				parent.leftChild = nodeToDelete.rightChild;
			} else {
				parent.rightChild = nodeToDelete.rightChild;
			}

		} else {
			
			Node successor = this.getSuccessor(nodeToDelete);
			if (nodeToDelete == root) {
				root = successor;
			}
			if (isLeft) {
				parent.leftChild = successor;
			} else {
				parent.rightChild = successor;
			}
			
			successor.leftChild = nodeToDelete.leftChild;

		}
		
		

		return true;
	}

	private Node getSuccessor(Node nodeToDelete) {
		
		Node successor = nodeToDelete.rightChild;
		Node successorParent = nodeToDelete;
		
		
		
		while(successor.leftChild!=null) {
			successorParent = successor;
			successor = successor.leftChild;			
		}
		if(successor !=nodeToDelete.rightChild ) {
			successorParent.leftChild= successor.rightChild;
			successor.rightChild=nodeToDelete.rightChild;
		}

		return successor;
	}

	public void displayTree() {

		Stack globalStack = new Stack();
		globalStack.push(root);
		int nBlanks = 32;
		boolean isRowEmpty = false;
		System.out.println("......................................................");

		while (isRowEmpty == false) {
			Stack localStack = new Stack();
			isRowEmpty = true;
			for (int j = 0; j < nBlanks; j++) {
				System.out.print(" ");
			}

			while (globalStack.isEmpty() == false) {
				Node temp = (Node) globalStack.pop();
				if (temp != null) {
					System.out.print(temp.key);
					localStack.push(temp.leftChild);
					localStack.push(temp.rightChild);
					if (temp.leftChild != null || temp.rightChild != null) {
						isRowEmpty = false;
					}
				} else {
					System.out.print("--");
					localStack.push(null);
					localStack.push(null);
				}

				for (int j = 0; j < nBlanks * 2 - 2; j++) {
					System.out.print(" ");
				}
			}

			System.out.println();
			nBlanks = nBlanks / 2;

			while (localStack.isEmpty() == false)
				globalStack.push(localStack.pop());
		}
		System.out.println("......................................................");

	}

}
