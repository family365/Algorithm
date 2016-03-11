package cn.boxian.algorithm.tree;

import java.util.Stack;

public class BiTree {
	public void preOrder(BiTreeNode root) {
		if (root == null) {
			return;
		}
		
		Stack<BiTreeNode> nodeList = new Stack<BiTreeNode>();
		nodeList.push(root);
		while(!nodeList.isEmpty()) {
			BiTreeNode currentNode = nodeList.pop();
			System.out.println(currentNode.getData());
			
			if(currentNode.getLeftNode() != null) {
				nodeList.push(currentNode.getLeftNode());
			}
			
			if (currentNode.getRightNode() != null) {
				nodeList.push(currentNode.getRightNode());
			}
		}
	}
	
	public void preOrderRecurrence(BiTreeNode root) {
		if (root == null) {
			return;
		}
		
		System.out.println(root.getData());
		
		if (root.getLeftNode() != null) {
			preOrderRecurrence(root.getLeftNode());
		}
		
		if (root.getRightNode() != null) {
			preOrderRecurrence(root.getRightNode());
		}
	}
	
	
	public void inOrder(BiTreeNode root) {
		if (root != null) {
			return;
		} 
		
		Stack<BiTreeNode> nodeStack = new Stack<BiTreeNode>();
		BiTreeNode currentNode = root;
		while(currentNode != null || !nodeStack.isEmpty()) {
			while(currentNode != null) {
				nodeStack.push(currentNode);
				currentNode = currentNode.getLeftNode();
			}
			
			if (!nodeStack.isEmpty()) {
				currentNode = nodeStack.pop();
				System.out.println(currentNode.getData());
				currentNode = currentNode.getRightNode();
			}
		}
	}
	
	public void inOrderRecurrence(BiTreeNode root) {
		if (root == null) {
			return;
		}
		
		if (root.getLeftNode() != null) {
			inOrderRecurrence(root.getLeftNode());
		}
		
		System.out.println(root.getData());
		
		if (root.getRightNode() != null) {
			inOrderRecurrence(root.getRightNode());
		}
	}
	
	
}
