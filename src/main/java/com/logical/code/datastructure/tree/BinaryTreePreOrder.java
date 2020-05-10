package com.logical.code.datastructure.tree;

import java.util.Stack;

public class BinaryTreePreOrder {

	public static class Node {

		Integer data;
		Node left;
		Node right;

		public Node(Integer data) {
			this.data = data;
		}
	}

	// Recursive traversal
	public void preorder(Node node) {

		if (node != null) {
			System.out.print(node.data + ", ");
			preorder(node.left);
			preorder(node.right);
		}
	}

	// Iterative call
	public void preorderIter(Node node) {

		if (node == null)
			return;

		Stack<Node> stack = new Stack<>();
		stack.push(node);

		while (!stack.empty()) {

			Node tree = stack.pop();
			System.out.print(tree.data + ", ");

			if (tree.right != null)
				stack.push(tree.right);

			if (tree.left != null)
				stack.push(tree.left);
		}

	}

	public Node createTree() {

		Node rootNode = new Node(40);
		Node node20 = new Node(20);
		Node node10 = new Node(10);
		Node node30 = new Node(30);
		Node node60 = new Node(60);
		Node node50 = new Node(50);
		Node node70 = new Node(70);

		rootNode.left = node20;
		rootNode.right = node60;

		node20.left = node10;
		node20.right = node30;

		node60.left = node50;
		node60.right = node70;

		return rootNode;
	}

	public static void main(String[] args) {
		BinaryTreePreOrder tree = new BinaryTreePreOrder();
		Node node = tree.createTree();
		System.out.println("Recursive traversal");
		tree.preorder(node);
		System.out.println("\n\nIterative traversal");
		tree.preorderIter(node);
	}
}
