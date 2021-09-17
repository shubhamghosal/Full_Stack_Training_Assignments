package com.app.collections;

public interface IBinaryTree {
	
	int[] levelOrder();
	
	int[] preOrder();

	int[] postOrder();

	int[] inOrder();

	int nodeCount();

	int findFrequency(int e);

	int countLeaf();

	void makeMirror();
	
	int height();
}
