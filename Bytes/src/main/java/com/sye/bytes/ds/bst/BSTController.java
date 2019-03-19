package com.sye.bytes.ds.bst;

public class BSTController {

	public  static void main (String []args) {
		BST tree = new BST();
		tree.insert(10, "Ten");
		tree.insert(20, "twenty");
		tree.insert(22, "fifteen");
		tree.insert(18, "fifteen");
		tree.insert(19, "fifteen");
		tree.insert(17, "fifteen");
		tree.insert(24, "Twenty four");
		tree.insert(21, "Twenty four");
		tree.insert(4, "Four");
		tree.insert(2, "Four");
		tree.insert(5, "Four");
		tree.insert(8, "Four");
		tree.insert(9, "Four");
		tree.insert(33, "Thirty three");
		tree.findMin();
		tree.findMax();
		tree.displayTree();
		
		System.out.println(tree.remove(20));
		
		tree.findMin();
		tree.findMax();
		tree.displayTree();
		
		System.out.println(tree.remove(10));
		tree.findMin();
		tree.findMax();
		tree.displayTree();
	}
}
