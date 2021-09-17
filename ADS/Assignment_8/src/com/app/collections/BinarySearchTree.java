package com.app.collections;

public class BinarySearchTree implements IBinarySearchTree {

	BinaryTreeNode root;

	public BinarySearchTree() {
		root = null;
	}

	@Override
	public void insert(int e) {
		if (!insert(root, e))
			root = new BinaryTreeNode(e);

	}

	public static boolean insert(BinaryTreeNode node, int e) {
		if (node == null)
			return false;
		if (node.data.compareTo(e) > 0) {
			if (node.lChild == null) {
				node.lChild = new BinaryTreeNode(e);
				return true;
			}
			return insert(node.lChild, e);

		} else {
			if (node.rChild == null) {
				node.rChild = new BinaryTreeNode(e);
				return true;
			}
			return insert(node.rChild, e);
		}
	}

	@Override
	public void delete(int e) {
		if (root == null)
			return;
		BinaryTreeNode found = null;
		BinaryTreeNode cur = root;
		BinaryTreeNode prev = null;

		while (cur != null) {
			if (cur.data.equals(e)) {
				found = cur;
				break;
			}
			prev = cur;
			if (cur.data.compareTo(e) > 0) {
				cur = cur.lChild;
			} else {
				cur = cur.rChild;
			}

		}

		if (found == null) {
			return;
		}

		if (cur.lChild == null) {
			if (prev == null) {
				root = cur.rChild;
				return;
			}

			if (cur == prev.lChild) {
				prev.lChild = cur.rChild;
			} else {
				prev.rChild = cur.rChild;
			}
			return;
		}

		prev = cur;
		cur = cur.lChild;

		while (cur.rChild != null) {
			prev = cur;
			cur = cur.rChild;
		}

		found.data = cur.data;

		if (cur == prev.lChild)
			prev.lChild = cur.lChild;
		else
			prev.rChild = cur.lChild;

	}

	@Override
	public boolean search(int e) {

		return search(root, e);
	}

	public static boolean search(BinaryTreeNode node, int e) {
		if (node == null)
			return false;
		int chk = node.data.compareTo(e);
		if (chk == 0)
			return true;
		if (chk < 0)
			return search(node.rChild, e);
		else
			return search(node.lChild, e);
	}

	@Override
	public int[] inOrder() {
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

	public static int nodeCount(BinaryTreeNode node) {
		if (node == null)
			return 0;
		return 1 + nodeCount(node.lChild) + nodeCount(node.rChild);

	}

	public int nodeCount() {
		return nodeCount(root);
	}

}
