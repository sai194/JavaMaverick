package com.sye.bytes.search.binarysearch;

class binarySearchTree {

	Node root;

	public boolean add(int value) {
		Node newNode = new Node(value);
		if (isEmpty()) {
			root = newNode;
			return true;
		}

		// Starting from root
		Node currentNode = root;
		Node parentNode = root;

		while (currentNode != null) {
			parentNode = currentNode;
			if (value <= currentNode.getData()) {
				currentNode = currentNode.getLeftChild();
			} else {
				currentNode = currentNode.getRightChild();
			}

		}
		if (value <= parentNode.getData()) {
			parentNode.setLeftChild(newNode);
		} else {
			parentNode.setRightChild(newNode);
		}
		return true;
	}

	public boolean isEmpty() {
		return root == null; // if root is null then it means Tree is empty
	}

	// Just for Testing purpose
	public void printTree(Node current) {
		if (current == null)
			return;

		System.out.print(current.getData() + ",");
		printTree(current.getLeftChild());
		printTree(current.getRightChild());

	}

	public Node search(int value) {
		if (isEmpty())
			return null;

		Node currentNode = this.root;
		
		while (currentNode != null) {

			if (currentNode.getData() == value) return currentNode;

			if (currentNode.getData() > value) currentNode = currentNode.getLeftChild();
			else currentNode = currentNode.getRightChild();
		}

		System.err.println(value + " Not found in the Tree!");
		return null;
		
	}
	
	public Node getExtremeLeft(Node node) {
		
		while (node.getLeftChild()!=null) {
			node= node.getLeftChild();
		}
		
		return node;
	}
	
	public boolean delete(int value, Node currentNode) {
		if (root == null) {
            return false;
        } 

        Node parent = null;
        
		return true;
	}

	public static void main(String args[]) {
		binarySearchTree bsT = new binarySearchTree();

		bsT.add(6);
		bsT.add(4);
		bsT.add(9);
		bsT.add(5);
		bsT.add(2);
		bsT.add(8);
		bsT.add(12);
		bsT.add(10);
		bsT.add(14);

		System.out.println(">> Tree <<");
		bsT.printTree(bsT.root);

		Node temp = bsT.search(5);
		if (temp != null) {
			System.out.println("\n" + temp.getData() + " found in Tree !");
		}
		temp = bsT.search(51);
		if (temp != null) {
			System.out.println("\n" + temp.getData() + " found in Tree !");
		}
	}

}