package tester;

import com.app.bintree.*;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BinaryTreeTest {
	@Test
	void testCreateTree() {
		BinaryTree bt = new BinaryTree(5);
		assertEquals(5, bt.nodeCount());
	}

	@Test
	void testPreOrder() {
		BinaryTree bt = new BinaryTree();
		int[] elements = bt.buildTreeForPreOrder();
		int[] traversal = bt.preOrder();
		assertArrayEquals(elements, traversal);
	}

	@Test
	void testInOrder() {
		BinaryTree bt = new BinaryTree();
		int[] els = { 5, 13, 12, 5, 6, 8 };
		bt.root = new BinaryTreeNode(els[3]);
		bt.root.lChild = new BinaryTreeNode(els[1]);
		bt.root.rChild = new BinaryTreeNode(els[5]);
		bt.root.lChild.lChild = new BinaryTreeNode(els[0]);
		bt.root.lChild.rChild = new BinaryTreeNode(els[2]);
		bt.root.rChild.lChild = new BinaryTreeNode(els[4]);
		assertArrayEquals(els, bt.inOrder());
	}

	@Test
	void testPostOrder() {
		int[] els = { 9, 6, 8, 4, 12, 54, 5, 2 };
		BinaryTree bt = new BinaryTree(els.length);
		bt.root.lChild.lChild.lChild.data = els[0];
		bt.root.lChild.lChild.data = els[1];
		bt.root.lChild.rChild.data = els[2];
		bt.root.lChild.data = els[3];
		bt.root.rChild.lChild.data = els[4];
		bt.root.rChild.rChild.data = els[5];
		bt.root.rChild.data = els[6];
		bt.root.data = els[7];
		assertArrayEquals(els, bt.postOrder());

	}

	@Test
	void testFrequencyCount() {
		int[] els = { 9, 6, 5, 4, 12, 5, 5, 2 };
		BinaryTree bt = new BinaryTree(els.length);
		bt.root.lChild.lChild.lChild.data = els[0];
		bt.root.lChild.lChild.data = els[1];
		bt.root.lChild.rChild.data = els[2];
		bt.root.lChild.data = els[3];
		bt.root.rChild.lChild.data = els[4];
		bt.root.rChild.rChild.data = els[5];
		bt.root.rChild.data = els[6];
		bt.root.data = els[7];
		assertEquals(3, bt.findFrequency(5));
	}

	@Test
	void testcountLeaf() {
		BinaryTree bt = new BinaryTree();
		assertEquals(0, bt.countLeaf());
	}

	@Test
	void testcountLeaf2() {
		BinaryTree bt = new BinaryTree(1);
		assertEquals(1, bt.countLeaf());
	}

	@Test
	void testcountLeaf3() {
		BinaryTree bt = new BinaryTree(2);
		assertEquals(1, bt.countLeaf());
	}

	@Test
	void testcountLeaf4() {
		BinaryTree bt = new BinaryTree(5);
		assertEquals(2, bt.countLeaf());
	}

	@Test
	void testcountLeaf5() {
		BinaryTree bt = new BinaryTree(12);
		assertEquals(5, bt.countLeaf());
	}

	void testCountLeaf6() {
		BinaryTree bt = new BinaryTree(15);
		assertEquals(8, bt.countLeaf());
	}

	@Test
	void testMakeMirror() {
		BinaryTree bt = new BinaryTree(3);
		bt.root.data = 1;
		bt.root.lChild.data = 2;
		bt.root.rChild.data = 3;
		bt.makeMirror();
		int[] arr = { 1, 3, 2 };
		assertArrayEquals(arr, bt.preOrder());
	}

	@Test
	void testMakeMirror2() {
		BinaryTree bt = new BinaryTree(8);
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

		bt.root.data = arr[0];
		bt.root.lChild.data = arr[1];
		bt.root.lChild.lChild.data = arr[2];
		bt.root.lChild.lChild.lChild.data = arr[3];
		bt.root.lChild.rChild.data = arr[4];
		bt.root.rChild.data = arr[5];
		bt.root.rChild.lChild.data = arr[6];
		bt.root.rChild.rChild.data = arr[7];
		bt.makeMirror();
		int[] arr2 = { 1, 6, 8, 7, 2, 5, 3, 4 };
		assertArrayEquals(arr2, bt.preOrder());

	}

}
