package tester;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.app.collections.BinarySearchTree;

class BinarySearchTreeTest {

	@Test
	void testInsert() {

		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(5);
		bst.insert(1);
		bst.insert(2);
		int[] arr = { 1, 2, 5 };
		assertArrayEquals(arr, bst.inOrder());

	}

	@Test
	void testInsert2() {

		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(5);
		bst.insert(1);
		bst.insert(3);
		bst.insert(87);
		bst.insert(9);
		int[] arr = { 1, 3, 5, 9, 87 };
		assertArrayEquals(arr, bst.inOrder());

	}

	@Test
	void testSearch() {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(5);
		bst.insert(1);
		bst.insert(3);
		bst.insert(87);
		bst.insert(6);
		assertTrue(bst.search(6));
	}

	@Test
	void testSearch2() {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(5);
		bst.insert(1);
		bst.insert(3);
		bst.insert(87);
		bst.insert(6);
		assertFalse(bst.search(10));
	}

	@Test
	void testDelete() {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(5);
		bst.insert(1);
		bst.insert(3);
		bst.insert(87);
		bst.insert(6);
		bst.delete(1);
		assertFalse(bst.search(1));
	}

	@Test
	void testDelete2() {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(5);
		bst.insert(1);
		bst.insert(3);
		bst.insert(87);
		bst.insert(6);
		bst.delete(6);
		int[] arr = { 1, 3, 5, 87 };
		assertArrayEquals(arr, bst.inOrder());
	}
	
	@Test
	void testDelete3() {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(5);
		bst.insert(1);
		bst.insert(3);
		bst.insert(87);
		bst.insert(6);
		bst.delete(87);
		int[] arr = { 1,3, 5,6};
		assertArrayEquals(arr, bst.inOrder());
	}
}
