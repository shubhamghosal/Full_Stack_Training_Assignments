package com.app.bintree;

public class BinaryTree implements IBinaryTree {

	public BinaryTreeNode root;

	public BinaryTree() {
		root = null;
	}

	public BinaryTree(int elementCount) {
		root = new BinaryTreeNode(null);
		createTree(root, elementCount - 1);
	}

	private void createTree(BinaryTreeNode node, int elementCount) {

		if (elementCount > 0) {
			node.lChild = new BinaryTreeNode(null);
			elementCount--;
		}
		if (elementCount > 0) {
			node.rChild = new BinaryTreeNode(null);
			elementCount--;
		}
		if (elementCount > 0)
			createTree(node.lChild, (elementCount + 1) / 2);
		if (elementCount > 0)
			createTree(node.rChild, elementCount / 2);

	}

	public int[] buildTreeForPreOrder() {
		int[] elements = new int[4];
		elements[0] = 1;
		elements[1] = 2;
		elements[2] = 4;
		elements[3] = 3;
		root = new BinaryTreeNode(1);
		root.lChild = new BinaryTreeNode(2);
		root.lChild.lChild = new BinaryTreeNode(4);
		root.rChild = new BinaryTreeNode(3);
		return elements;
	}

	private int preOrder(BinaryTreeNode node, int[] array, Integer index) {
		// if root is empty then stop
		if (node == null) {
			return index;
		}
		// Process root node's data
		array[index++] = node.data;
		// if root node's left child exists
		// pre-order of root's left child
		index = preOrder(node.lChild, array, index);
		// pre-order of root's right child
		index = preOrder(node.rChild, array, index);

		return index;
	}

	@Override
	public int[] preOrder() {
		int[] array = new int[nodeCount()];
		preOrder(root, array, 0);
		return array;
	}

	@Override
	public int[] postOrder() {
		int[] array = new int[nodeCount()];

		postOrder(root, array, 0);

		return array;
	}

	private int postOrder(BinaryTreeNode node, int[] array, int i) {
		if (node == null)
			return i;
		i = postOrder(node.lChild, array, i);
		i = postOrder(node.rChild, array, i);

		array[i++] = node.data;
		return i;
	}

	@Override
	public int[] inOrder() {
		int[] array = new int[nodeCount()];
		inOrder(root, array, 0);
		return array;
	}

	private int inOrder(BinaryTreeNode node, int[] array, int i) {
		if (node == null)
			return i;
		i = inOrder(node.lChild, array, i);
		array[i++] = node.data;
		i = inOrder(node.rChild, array, i);
		return i;

	}

	public static int nodeCount(BinaryTreeNode node) {
		if (node == null)
			return 0;

		return 1 + nodeCount(node.lChild) + nodeCount(node.rChild);

	}

	@Override
	public int nodeCount() {
		return nodeCount(root);
	}

	@Override
	public int findFrequency(int e) {
		return findFrequency(root, e);
	}

	private int findFrequency(BinaryTreeNode node, int e) {
		if (node == null)
			return 0;
		if (node.data.equals(e))
			return 1 + findFrequency(node.lChild, e) + findFrequency(node.rChild, e);
		return 0 + findFrequency(node.lChild, e) + findFrequency(node.rChild, e);
	}

	@Override
	public int countLeaf() {
		return countLeaf(root);
	}

	private int countLeaf(BinaryTreeNode node) {
		int count = 0;
		if (node == null)
			return 0;
		if (node.lChild == null && node.rChild == null)
			return 1;
		if (node.lChild != null)
			count += countLeaf(node.lChild);
		if (node.rChild != null)
			count += countLeaf(node.rChild);
		return count;
	}

	@Override
	public void makeMirror() {
		makeMirror(root);

	}

	private void makeMirror(BinaryTreeNode node) {
		if (node == null)
			return;
		if (node.lChild != null)
			makeMirror(node.lChild);
		if (node.rChild != null)
			makeMirror(node.rChild);

		BinaryTreeNode tmp = node.lChild;
		node.lChild = node.rChild;
		node.rChild = tmp;

	}

}
