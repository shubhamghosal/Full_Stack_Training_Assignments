package utils;

import java.time.Duration;
import java.time.Instant;

import org.junit.jupiter.api.Test;

class BenchMarkTest {

	@Test
	void testBubbleSort() {
		int[] arr = new int[10000];
		for (int i = 10000; i > 0; i--)
			arr[10000 - i] = i;

		int[] sortedArr = new int[10000];
		for (int i = 1; i <= 10000; i++)
			sortedArr[i - 1] = i;

		Instant start = Instant.now();
		SortAndSearch.bubbleSort(arr, arr.length);
		Instant end = Instant.now();
		System.out.println("Bubble sort : " + Duration.between(start, end));

	}

	@Test
	void testSelectionSort() {
		int[] arr = new int[10000];
		for (int i = 10000; i > 0; i--)
			arr[10000 - i] = i;

		int[] sortedArr = new int[10000];
		for (int i = 1; i <= 10000; i++)
			sortedArr[i - 1] = i;
		Instant start = Instant.now();

		SortAndSearch.selectionSort(arr, arr.length);
		Instant end = Instant.now();

		System.out.println("Selection sort : " + Duration.between(start, end));

	}

	@Test
	void testQuickSort() {
		int[] arr = new int[10000];
		for (int i = 10000; i > 0; i--)
			arr[10000 - i] = i;

		int[] sortedArr = new int[10000];
		for (int i = 1; i <= 10000; i++)
			sortedArr[i - 1] = i;
		Instant start = Instant.now();
		SortAndSearch.quickSort(arr, 0, arr.length);
		Instant end = Instant.now();

		System.out.println("Quick sort : " + Duration.between(start, end));

	}

	@Test
	void testInsertionSort() {
		int[] arr = new int[10000];
		for (int i = 10000; i > 0; i--)
			arr[10000 - i] = i;

		int[] sortedArr = new int[10000];
		for (int i = 1; i <= 10000; i++)
			sortedArr[i - 1] = i;
		Instant start = Instant.now();
		SortAndSearch.insertionSort(arr, arr.length);

		Instant end = Instant.now();
		System.out.println("Insertion sort : " + Duration.between(start, end));

	}

}
