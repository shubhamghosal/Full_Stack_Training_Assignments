package utils;

public class SortAndSearch2 {

	public static void bubbleSort(int[] elements, int size) {
		int hi = size - 1;
		int lo = 0;
		for (int i = lo; i < size - 1; i++) {
			int swap = 0;
			for (int right = hi; right > lo; right--) {
				int left = right - 1;
				if (elements[left] > elements[right]) {
					int tmp = elements[right];
					elements[right] = elements[left];
					elements[left] = tmp;
					swap++;
				}
			}
			if (swap == 0)
				return;
		}
	}

	public static boolean linearSearch(int[] elements, int e, int size) {
		for (int i = 0; i < size; i++)
			if (elements[i] == e)
				return true;

		return false;
	}

	public static boolean binarySearch(int[] elements, int e, int size) {

		int lo = 0;
		int hi = size - 1;
		int i = (lo + hi) / 2;
		while (!(lo > hi)) {
			int data = elements[i];
			if (data == e)
				return true;
			if (data > e)
				hi = i - 1;
			else
				lo = i + 1;

			i = (lo + hi) / 2;

		}

		return false;
	}

	public static void selectionSort(int[] elements, int size) {
		// we select a position and place the smallest element int the sub array
		// we start at first index : 0 upto second last index
		for (int position = 0; position <= size - 2; position++) {
			int smallest = size - 1; // assume the last element is the smallest
			for (int cur = size - 2; cur >= position; cur--) {
				if (elements[smallest] > elements[cur])
					smallest = cur;
			}
			int tmp = elements[position];
			elements[position] = elements[smallest];
			elements[smallest] = tmp; // swap the smallest element in the selected sub array with the first element of
										// the sub array

		}

	}



	public static void insertionSort(int[] elements, int size) {
		// first sub array is sorted
		// start with first + 1 as end of first sub array
		// inserting first +1 th element in the array

		for (int insertFrom = 1; insertFrom < size; insertFrom++) {
			int insertElement = elements[insertFrom];
			int insertAt = insertFrom - 1;
			while (insertAt >= 0) {
				if (elements[insertAt] > insertElement)
					elements[insertAt + 1] = elements[insertAt];
				else
					break;
				insertAt--;
			}
			elements[insertAt + 1] = insertElement;

		}

	}

}
