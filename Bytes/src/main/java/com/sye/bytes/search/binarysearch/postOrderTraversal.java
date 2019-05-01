package com.sye.bytes.search.binarysearch;
class postOrderTraversal {

	public static void postTraverse(Node root) {

		if (root == null) return;

		postTraverse(root.getLeftChild());
		postTraverse(root.getRightChild());
		System.out.print(root.getData() + ",");

	}

	public static void main(String[] args) {

		binarySearchTree BST = new binarySearchTree();

		BST.add(6);
		BST.add(4);
		BST.add(2);
		BST.add(5);
		BST.add(9);
		BST.add(8);
		BST.add(12);

		postOrderTraversal.postTraverse(BST.root);

	}

}