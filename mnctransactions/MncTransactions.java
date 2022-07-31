package com.gl.mnctransactions;


public class MncTransactions {

	public static node node;
	static node prevNode = null;
	static node headNode = null;

	static void BinaryTreeToSkewed(node root, int order) {

		if (root == null) {
			return;
		}

		if (order > 0) {
			BinaryTreeToSkewed(root.right, order);
		} else {
			BinaryTreeToSkewed(root.left, order);
		}
		node rightNode = root.right;
		node leftNode = root.left;

		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		if (order > 0) {
			BinaryTreeToSkewed(leftNode, order);
		} else {
			BinaryTreeToSkewed(rightNode, order);
		}
	}

	static void traverseRightSkewedtree(node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.value + " ");
		traverseRightSkewedtree(root.right);
	}


	public static void main(String[] args) {

		MncTransactions.node = new node(50);
		MncTransactions.node.left = new node(30);
		MncTransactions.node.right = new node(60);
		MncTransactions.node.left.left = new node(10);
		MncTransactions.node.right.left = new node(55);
		System.out.print("Updated Binary Tree  -> ");
		int order = 0;
		BinaryTreeToSkewed(node, order);
		traverseRightSkewedtree(headNode);
	}

}




