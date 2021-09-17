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
	void testBubbleSort1() {
		int[] arr = { 3, 512, 57, 86 };
		int[] sortedArr = { 3, 57, 86, 512 };

		SortAndSearch.bubbleSort(arr, arr.length);
		assertArrayEquals(sortedArr, arr);

	}

	@Test
	void testBubbleSort2() {
		int[] arr = { 1, 2, 3, 4 };
		int[] sortedArr = { 1, 2, 3, 4 };
		SortAndSearch.bubbleSort(arr, arr.length);
		assertArrayEquals(sortedArr, arr);

	}

	@Test
	void testBinarySearch() {
		int arr[] = { 56, 5, 4, 3, 8, 1, 5 };
		SortAndSearch.bubbleSort(arr, arr.length);
		assertTrue(SortAndSearch.binarySearch(arr, 5, arr.length));
		assertTrue(SortAndSearch.binarySearch(arr, 56, arr.length));
		assertTrue(SortAndSearch.binarySearch(arr, 4, arr.length));
		assertTrue(SortAndSearch.binarySearch(arr, 3, arr.length));
		assertTrue(SortAndSearch.binarySearch(arr, 1, arr.length));
		assertFalse(SortAndSearch.binarySearch(arr, 10, arr.length));
	}



	@Test
	void testSelectionSort1() {
		int[] arr = { 3, 512, 57, 86 };
		int[] sortedArr = { 3, 57, 86, 512 };

		SortAndSearch.selectionSort(arr, arr.length);

		assertArrayEquals(sortedArr, arr);

	}

	@Test
	void testSelectionSort2() {
		int[] arr = { 1, 2, 3, 4 };
		int[] sortedArr = { 1, 2, 3, 4 };
		SortAndSearch.selectionSort(arr, arr.length);
		assertArrayEquals(sortedArr, arr);
	}

 

	@Test
	void testQuickSort1() {
		int[] arr = { 3, 512, 57, 86 };
		int[] sortedArr = { 3, 57, 86, 512 };
		SortAndSearch.quickSort(arr, 0, arr.length);

		assertArrayEquals(sortedArr, arr);

	}

	@Test
	void testQuickSort2() {
		int[] arr = { 1, 2, 3, 4 };
		int[] sortedArr = { 1, 2, 3, 4 };
		SortAndSearch.quickSort(arr, 0, arr.length);
		assertArrayEquals(sortedArr, arr);

	}

	@Test
	void testQuickSort3() {
		int[] arr = { 100, 2, 3, 4 };
		int[] sortedArr = { 2, 3, 4, 100 };
		SortAndSearch.quickSort(arr, 0, arr.length);
		assertArrayEquals(sortedArr, arr);

	}

	@Test
	void testQuickSort4() {
		int[] arr = { 2, 3 };
		int[] sortedArr = { 2, 3 };
		SortAndSearch.quickSort(arr, 0, arr.length);
		assertArrayEquals(sortedArr, arr);

	}

	@Test
	void testQuickSort5() {
		int[] arr = { 3, 2 };
		int[] sortedArr = { 2, 3 };
		SortAndSearch.quickSort(arr, 0, arr.length);
		assertArrayEquals(sortedArr, arr);

	}

	@Test
	void testQuickSort6() {
		int[] arr = { 3, 2, 1, 0 };
		int[] sortedArr = { 0, 1, 2, 3 };
		SortAndSearch.quickSort(arr, 0, arr.length);
		assertArrayEquals(sortedArr, arr);

	}

	
	@Test
	void testQuickSort21() {
		int[] arr = { 3, 512, 57, 86 };
		int[] sortedArr = { 3, 57, 86, 512 };
		SortAndSearch.quickSort2(arr, 0, arr.length);

		assertArrayEquals(sortedArr, arr);

	}

	@Test
	void testQuickSort22() {
		int[] arr = { 1, 2, 3, 4 };
		int[] sortedArr = { 1, 2, 3, 4 };
		SortAndSearch.quickSort2(arr, 0, arr.length);
		assertArrayEquals(sortedArr, arr);

	}

	@Test
	void testQuickSort23() {
		int[] arr = { 100, 2, 3, 4 };
		int[] sortedArr = { 2, 3, 4, 100 };
		SortAndSearch.quickSort2(arr, 0, arr.length);
		assertArrayEquals(sortedArr, arr);

	}

	@Test
	void testQuickSort24() {
		int[] arr = { 2, 3 };
		int[] sortedArr = { 2, 3 };
		SortAndSearch.quickSort2(arr, 0, arr.length);
		assertArrayEquals(sortedArr, arr);

	}

	@Test
	void testQuickSort25() {
		int[] arr = { 3, 2 };
		int[] sortedArr = { 2, 3 };
		SortAndSearch.quickSort2(arr, 0, arr.length);
		assertArrayEquals(sortedArr, arr);

	}

	@Test
	void testQuickSort26() {
		int[] arr = { 3, 2, 1, 0 };
		int[] sortedArr = { 0, 1, 2, 3 };
		SortAndSearch.quickSort2(arr, 0, arr.length);
		assertArrayEquals(sortedArr, arr);

	}



	@Test
	void testInsertionSort1() {
		int[] arr = { 3, 512, 57, 86 };
		int[] sortedArr = { 3, 57, 86, 512 };
		SortAndSearch.insertionSort(arr, arr.length);

		assertArrayEquals(sortedArr, arr);

	}

	@Test
	void testInsertionSort2() {
		int[] arr = { 1, 2, 3, 4 };
		int[] sortedArr = { 1, 2, 3, 4 };
		SortAndSearch.insertionSort(arr, arr.length);
		assertArrayEquals(sortedArr, arr);

	}

	@Test
	void testInsertionSort3() {
		int[] arr = { 100, 2, 3, 4 };
		int[] sortedArr = { 2, 3, 4, 100 };
		SortAndSearch.insertionSort(arr, arr.length);
		assertArrayEquals(sortedArr, arr);

	}

	@Test
	void testInsertionSort4() {
		int[] arr = { 2, 3 };
		int[] sortedArr = { 2, 3 };
		SortAndSearch.insertionSort(arr, arr.length);
		assertArrayEquals(sortedArr, arr);

	}

	@Test
	void testInsertionSort5() {
		int[] arr = { 3, 2 };
		int[] sortedArr = { 2, 3 };
		SortAndSearch.insertionSort(arr, arr.length);
		assertArrayEquals(sortedArr, arr);

	}

	@Test
	void testInsertionSort6() {
		int[] arr = { 3, 2, 1, 0 };
		int[] sortedArr = { 0, 1, 2, 3 };
		SortAndSearch.insertionSort(arr, arr.length);
		assertArrayEquals(sortedArr, arr);
	}

	
	@Test
	void testmergeSort1() {
		int[] arr = { 3, 512, 57, 86 };
		int[] sortedArr = { 3, 57, 86, 512 };
		SortAndSearch.mergeSort(arr, 0, arr.length);

		assertArrayEquals(sortedArr, arr);

	}

	@Test
	void testmergeSort2() {
		int[] arr = { 1, 2, 3, 4 };
		int[] sortedArr = { 1, 2, 3, 4 };
		SortAndSearch.mergeSort(arr, 0, arr.length);
		assertArrayEquals(sortedArr, arr);

	}

	@Test
	void testmergeSort3() {
		int[] arr = { 100, 2, 3, 4 };
		int[] sortedArr = { 2, 3, 4, 100 };
		SortAndSearch.mergeSort(arr, 0, arr.length);
		assertArrayEquals(sortedArr, arr);

	}

	@Test
	void testmergeSort4() {
		int[] arr = { 2, 3 };
		int[] sortedArr = { 2, 3 };
		SortAndSearch.mergeSort(arr, 0, arr.length);
		assertArrayEquals(sortedArr, arr);

	}

	@Test
	void testmergeSort5() {
		int[] arr = { 3, 2 };
		int[] sortedArr = { 2, 3 };
		SortAndSearch.mergeSort(arr, 0, arr.length);
		assertArrayEquals(sortedArr, arr);

	}

	@Test
	void testmergeSort6() {
		int[] arr = { 3, 2, 1, 0 };
		int[] sortedArr = { 0, 1, 2, 3 };
		SortAndSearch.mergeSort(arr, 0, arr.length);
		assertArrayEquals(sortedArr, arr);
	}

	
	
	
	@Test
	void testheapSort1() {
		int[] arr = { 3, 512, 57, 86 };
		int[] sortedArr = { 3, 57, 86, 512 };
		SortAndSearch.heapSort(arr, arr.length);

		assertArrayEquals(sortedArr, arr);

	}

	@Test
	void testheapSort2() {
		int[] arr = { 1, 2, 3, 4 };
		int[] sortedArr = { 1, 2, 3, 4 };
		SortAndSearch.heapSort(arr, arr.length);
		assertArrayEquals(sortedArr, arr);

	}

	@Test
	void testheapSort3() {
		int[] arr = { 100, 2, 3, 4 };
		int[] sortedArr = { 2, 3, 4, 100 };
		SortAndSearch.heapSort(arr, arr.length);
		assertArrayEquals(sortedArr, arr);

	}

	@Test
	void testheapSort4() {
		int[] arr = { 2, 3 };
		int[] sortedArr = { 2, 3 };
		SortAndSearch.heapSort(arr, arr.length);
		assertArrayEquals(sortedArr, arr);

	}

	@Test
	void testheapSort5() {
		int[] arr = { 3, 2 };
		int[] sortedArr = { 2, 3 };
		SortAndSearch.heapSort(arr, arr.length);
		assertArrayEquals(sortedArr, arr);

	}

	@Test
	void testheapSort6() {
		int[] arr = { 3, 2, 1, 0, 56,8,4,8,2,8,2,846 };
		int[] sortedArr = { 0, 1, 2,2, 2, 3,4, 8,8,8,56,846 };
		SortAndSearch.heapSort(arr, arr.length);
		assertArrayEquals(sortedArr, arr);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
