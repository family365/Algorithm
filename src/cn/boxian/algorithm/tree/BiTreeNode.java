package cn.boxian.algorithm.tree;

public class BiTreeNode {
	private int data;
	private BiTreeNode leftNode;
	private BiTreeNode rightNode;
	
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public BiTreeNode getLeftNode() {
		return leftNode;
	}
	
	public void setLeftNode(BiTreeNode leftNode) {
		this.leftNode = leftNode;
	}
	
	public BiTreeNode getRightNode() {
		return rightNode;
	}
	
	public void setRightNode(BiTreeNode rightNode) {
		this.rightNode = rightNode;
	}
}
