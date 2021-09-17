package utils;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;
import java.time.Instant;

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
	void testBubbleSort() {
		int[] arr = new int[10000];
		for(int i = 10000; i>0; i--)
			arr[10000-i] = i;
		
		int[] sortedArr = new int[10000];
		for(int i = 1; i<=10000 ; i++)
			sortedArr[i-1] = i;

		Instant start = Instant.now();
		SortAndSearch.bubbleSort(arr, arr.length);
		Instant end = Instant.now();
		System.out.println("Bubble sort : " + Duration.between(start, end));

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
	void testSelectionSort() {
		int[] arr = new int[10000];
		for(int i = 10000; i>0; i--)
			arr[10000-i] = i;
		
		int[] sortedArr = new int[10000];
		for(int i = 1; i<=10000 ; i++)
			sortedArr[i-1] = i;
		Instant start = Instant.now();

		SortAndSearch.selectionSort(arr, arr.length);
		Instant end = Instant.now();

		System.out.println("Selection sort : " + Duration.between(start, end));


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
	void testQuickSort() {
		int[] arr = new int[10000];
		for(int i = 10000; i>0; i--)
			arr[10000-i] = i;
		
		int[] sortedArr = new int[10000];
		for(int i = 1; i<=10000 ; i++)
			sortedArr[i-1] = i;
		Instant start = Instant.now();
		SortAndSearch.quickSort(arr, 0, arr.length);
		Instant end = Instant.now();

		System.out.println("Quick sort : " + Duration.between(start, end));


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
	void test2ndQuickSort() {
		int[] arr = new int[10000];
		for(int i = 10000; i>0; i--)
			arr[10000-i] = i;
		
		int[] sortedArr = new int[10000];
		for(int i = 1; i<=10000 ; i++)
			sortedArr[i-1] = i;
		Instant start = Instant.now();
		SortAndSearch.quickSort2(arr, 0, arr.length);
		Instant end = Instant.now();

		System.out.println("Quick2 sort : " + Duration.between(start, end));


	} 
	
	@Test
	void test2ndQuickSort1() {
		int[] arr = { 3, 512, 57, 86 };
		int[] sortedArr = { 3, 57, 86, 512 };
		SortAndSearch.quickSort2(arr, 0, arr.length);

		assertArrayEquals(sortedArr, arr);

	}

	@Test
	void test2ndQuickSort2() {
		int[] arr = { 1, 2, 3, 4 };
		int[] sortedArr = { 1, 2, 3, 4 };
		SortAndSearch.quickSort2(arr, 0, arr.length);
		assertArrayEquals(sortedArr, arr);

	}

	@Test
	void test2ndQuickSort3() {
		int[] arr = { 100, 2, 3, 4 };
		int[] sortedArr = { 2, 3, 4, 100 };
		SortAndSearch.quickSort2(arr, 0, arr.length);
		assertArrayEquals(sortedArr, arr);

	}

	@Test
	void test2ndQuickSort4() {
		int[] arr = { 2, 3 };
		int[] sortedArr = { 2, 3 };
		SortAndSearch.quickSort2(arr, 0, arr.length);
		assertArrayEquals(sortedArr, arr);

	}

	@Test
	void test2ndQuickSort5() {
		int[] arr = { 3, 2 };
		int[] sortedArr = { 2, 3 };
		SortAndSearch.quickSort2(arr, 0, arr.length);
		assertArrayEquals(sortedArr, arr);

	}

	@Test
	void test2ndQuickSort6() {
		int[] arr = { 3, 2, 1, 0 };
		int[] sortedArr = { 0, 1, 2, 3 };
		SortAndSearch.quickSort2(arr, 0, arr.length);
		assertArrayEquals(sortedArr, arr);

	}

	
	
	@Test
	void testInsertionSort() {
		int[] arr = new int[10000];
		for(int i = 10000; i>0; i--)
			arr[10000-i] = i;
		
		int[] sortedArr = new int[10000];
		for(int i = 1; i<=10000 ; i++)
			sortedArr[i-1] = i;
		Instant start = Instant.now();
		SortAndSearch.insertionSort(arr, arr.length);

		Instant end = Instant.now();
		System.out.println("Insertion sort : " + Duration.between(start, end));


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

}
