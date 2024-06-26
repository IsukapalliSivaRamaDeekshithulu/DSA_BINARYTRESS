package binaryTreeNode;

public class BinaryTreeNode {

	// variables
	public int data;
	public BinaryTreeNode left, right;

	// Constructer
	 BinaryTreeNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	// getter and setter methods
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public BinaryTreeNode getLeft() {
		return left;
	}

	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}

	public BinaryTreeNode getRight() {
		return right;
	}

	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}

}
