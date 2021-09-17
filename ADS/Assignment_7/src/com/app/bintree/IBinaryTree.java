package com.app.bintree;

public interface IBinaryTree {
	int[] preOrder();

	int[] postOrder();

	int[] inOrder();

	int nodeCount();

	int findFrequency(int e);

	int countLeaf();

	void makeMirror();
}
