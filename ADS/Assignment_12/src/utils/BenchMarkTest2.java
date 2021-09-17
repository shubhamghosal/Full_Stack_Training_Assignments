package utils;

import static org.junit.Assert.assertArrayEquals;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BenchMarkTest2 {
	
	// the arr which we will sort
	static int[] arr ;
	
	// create a sorted array using generic java sort
	// we will compare our sorted array with this to check if sorted correctly
	static int sortedArr[];
	
	// we will always sort this array and before each test we will copy original unsorted array
	static int testArr[];
	static {
		// static init block
		
		sortedArr = new int[15000];
		arr = new int[15000];
		
		
		// created array of random elements (15000 here many might not be unique)
		for (int i = 0; i < 15000; i++)
			sortedArr[i] = arr[i] = (int) (100000 * Math.random());
		
		// start the timer
		Instant start = Instant.now();
		// the inbuilt sort by java
		Arrays.sort(sortedArr);
		// stop the timer
		Instant end = Instant.now();
		
		// log the difference of start and stop : the result will be in seconds
		System.out.println("Java sort : " + Duration.between(start, end));

	}

	@BeforeEach
	void arrayinit() {
		// each method will sort the testArr so re enter the original unsorted values
		testArr = Arrays.copyOf(arr, arr.length);
	}

	// common norm for all the test cases
	// start and end timer before and after sort and check if the array sorted correctly
	
	@Test
	void testBubbleSort() {

		Instant start = Instant.now();
		SortAndSearch.bubbleSort(testArr, testArr.length);
		Instant end = Instant.now();
		System.out.println("Bubble sort : " + Duration.between(start, end));
		assertArrayEquals(testArr, sortedArr);

	}

	@Test
	void testSelectionSort() {

		Instant start = Instant.now();

		SortAndSearch.selectionSort(testArr, testArr.length);
		Instant end = Instant.now();

		System.out.println("Selection sort : " + Duration.between(start, end));
		assertArrayEquals(testArr, sortedArr);

	}

	@Test
	void testQuickSort() {

		Instant start = Instant.now();
		SortAndSearch.quickSort(testArr, 0, testArr.length);
		Instant end = Instant.now();

		System.out.println("Quick sort : " + Duration.between(start, end));
		assertArrayEquals(testArr, sortedArr);

	}
	
	@Test
	void testQuickSort2() {

		Instant start = Instant.now();
		SortAndSearch.quickSort2(testArr, 0, testArr.length);
		Instant end = Instant.now();

		System.out.println("Quick sort2 : " + Duration.between(start, end));
		assertArrayEquals(testArr, sortedArr);

	}

	@Test
	void testInsertionSort() {

		Instant start = Instant.now();
		SortAndSearch.insertionSort(testArr, testArr.length);

		Instant end = Instant.now();
		System.out.println("Insertion sort : " + Duration.between(start, end));
		assertArrayEquals(testArr, sortedArr);

	}

	@Test
	void testMergeSort() {

		Instant start = Instant.now();
		SortAndSearch.mergeSort(testArr, 0, testArr.length);

		Instant end = Instant.now();
		System.out.println("Merge sort : " + Duration.between(start, end));
		assertArrayEquals(testArr, sortedArr);

	}

	@Test
	void testHeapSort() {

		Instant start = Instant.now();
		SortAndSearch.heapSort(testArr, testArr.length);

		Instant end = Instant.now();
		System.out.println("Heap sort : " + Duration.between(start, end));
		assertArrayEquals(testArr, sortedArr);

	}

}
