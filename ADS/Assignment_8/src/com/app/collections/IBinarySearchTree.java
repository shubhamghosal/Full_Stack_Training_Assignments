package com.app.collections;

public interface IBinarySearchTree {

	void insert(int e);
	
	void delete(int e);
	
	boolean search(int e);
	
	public int[] inOrder();
	
}
