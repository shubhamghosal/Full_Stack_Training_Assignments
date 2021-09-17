package com.app.collections;

public class BinaryTree implements IBinaryTree {

	public BinaryTreeNode root;

	public BinaryTree() {
		root = null;
	}

	public BinaryTree(int elementCount) {
		this();
		if(elementCount>0) {
		root = new BinaryTreeNode(null);
		createTree(root, elementCount - 1);
		}
	}

	private static void createTree(BinaryTreeNode node, int elementCount) {

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

	public static int preOrder(BinaryTreeNode node, int[] array, int i) {
		// if root is empty then return the index unincreased
		if (node == null)
			return i;

		// Process root node's data
		array[i++] = node.data;
		// pre-order of root's left child
		i = preOrder(node.lChild, array, i);
		// pre-order of root's right child
		i = preOrder(node.rChild, array, i);

		return i;
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

	public static int postOrder(BinaryTreeNode node, int[] array, int i) {
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

	public int[] inOrderItr() {
		int[] array = new int[nodeCount()];
		int i = 0;
		InfiniteStack<BinaryTreeNode> s = new InfiniteStack<>();
		BinaryTreeNode cur = root;
		while (!(s.isEmpty() && cur == null)) {
			while (cur != null) {
				s.push(cur);
				cur = cur.lChild;
			}
			if (!s.isEmpty()) {
				cur = s.pop();
				array[i++] = cur.data;
				cur = cur.rChild;
			}
		}

		return array;
	}

	public static int inOrder(BinaryTreeNode node, int[] array, int i) {
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

	public static int findFrequency(BinaryTreeNode node, int e) {
		if (node == null)
			return 0;
		if (node.data.equals(e))
			return 1 + findFrequency(node.lChild, e) + findFrequency(node.rChild, e);
		else
			return 0 + findFrequency(node.lChild, e) + findFrequency(node.rChild, e);
	}

	@Override
	public int countLeaf() {
		return countLeaf(root);
	}

	public static int countLeaf(BinaryTreeNode node) {
		if (node == null)
			return 0;
		if (node.lChild == null && node.rChild == null)
			return 1;
		return countLeaf(node.lChild) + countLeaf(node.rChild);
	}

	@Override
	public void makeMirror() {
		makeMirror(root);

	}

	public static void makeMirror(BinaryTreeNode node) {
		if (node == null)
			return;

		makeMirror(node.lChild);
		makeMirror(node.rChild);

		BinaryTreeNode tmp = node.lChild;
		node.lChild = node.rChild;
		node.rChild = tmp;

	}

	@Override
	public int[] levelOrder() {
		int[] result = new int[nodeCount()];
		if (root == null)
			return result;
		CircularLinkedList<BinaryTreeNode> q = new CircularLinkedList<>();

		// add root node to the q
		q.addAtFront(root);
		int count = 0;
		// while queue is not empty
		while (!q.isEmpty()) {
			// get a node from queue
			BinaryTreeNode node = q.removeAtRear();
			// process the node
			result[count++] = node.data;

			if (node.lChild != null)
				q.addAtFront(node.lChild);

			if (node.rChild != null)
				q.addAtFront(node.rChild);
		}

		return result;
	}

	public static int height(BinaryTreeNode node) {
		if (node == null || (node.lChild == null && node.rChild == null))
			return 0;
		
		return 1 + Integer.max(height(node.lChild), height(node.rChild));

	}

	@Override
	public int height() {
		return height(root);
	}

}
