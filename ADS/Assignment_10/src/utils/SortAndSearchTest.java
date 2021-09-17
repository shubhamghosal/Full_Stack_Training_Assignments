package utils;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SortAndSearchTest {

	@Test
	void test() {
		int arr[] = { 56, 5, 4, 3, 8, 1, 5 };

		assertTrue(SortAndSearch.linearSearch(arr, 5, arr.length));
		assertTrue(SortAndSearch.linearSearch(arr, 56, arr.length));
		assertTrue(SortAndSearch.linearSearch(arr, 4, arr.length));
		assertTrue(SortAndSearch.linearSearch(arr, 3, arr.length));
		assertTrue(SortAndSearch.linearSearch(arr, 1, arr.length));
		assertFalse(SortAndSearch.linearSearch(arr, 10, arr.length));
	}

	@Test
	void testSort() {
		int[] arr = { 3, 512, 57, 86 };
		int[] sortedArr = { 3, 57, 86, 512 };
		SortAndSearch.bubble(arr, arr.length);

		assertArrayEquals(sortedArr, arr);

	}

	@Test
	void testSort2() {
		int[] arr = { 1, 2, 3, 4 };
		int[] sortedArr = { 1, 2, 3, 4 };
		;
		SortAndSearch.bubble(arr, arr.length);
		assertArrayEquals(sortedArr, arr);

	}

	@Test
	void testBinarySearch() {
		int arr[] = { 56, 5, 4, 3, 8, 1, 5 };
		SortAndSearch.bubble(arr, arr.length);
		assertTrue(SortAndSearch.binarySearch(arr, 5, arr.length));
		assertTrue(SortAndSearch.binarySearch(arr, 56, arr.length));
		assertTrue(SortAndSearch.binarySearch(arr, 4, arr.length));
		assertTrue(SortAndSearch.binarySearch(arr, 3, arr.length));
		assertTrue(SortAndSearch.binarySearch(arr, 1, arr.length));
		assertFalse(SortAndSearch.binarySearch(arr, 10, arr.length));
	}

}
