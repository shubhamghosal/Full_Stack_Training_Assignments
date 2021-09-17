package utils;

public class SortAndSearch {

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

	public static void quickSort(int[] elements, int start, int end) {
		int pivot = start;
		int left = start;
		int right = end - 1;
//		int tmp2 = elements[(left+right)/2];
//		elements[(left+right)/2] = elements[pivot];
//		elements[pivot] = tmp2;
		// while left and right donot cross over do
		while (left <= right) {

			// while left elements are lesser than pivot
			while (left < end && elements[left] < elements[pivot])
				left++;

			// while right elements are greater than the pivot
			while (elements[right] > elements[pivot] || (elements[right] == elements[pivot] && right != pivot))
				right--;
			// we have reached where both condtions are false
			// swapping will make it correct
			if (left == end)
				break;
			if (right == start)
				break;
			int tmp = elements[right];
			elements[right] = elements[left];
			elements[left] = tmp;
		}
		// change the pivot with right
		int tmp = elements[right];
		elements[right] = elements[pivot];
		elements[pivot] = tmp;

		// pivot on correct position

		// we have to sort the elements left of right
		// if the start less than right's previous
		if (start < right - 1)
			quickSort(elements, start, right);
		// we have to sort the right elements of the right
		// if right's next is less than the end
		if (right + 1 < end - 1)
			quickSort(elements, right + 1, end);

	}
	
	
	// efficient
	public static void quickSort2(int[] elements, int start, int end) {
		// 0 based indexing
		int pivotEle = elements[end - 1]; // consider pivot element as the last element
		
		// here end is exclusive that is end = arr.length
		int i = -1; // tracker for pivot

		// we go on till pivot as the last element would surely get swapped with the pivot tracker
		for (int j = 0; j < end; j++) {
			// if the current element is lesser than pivot then it needs to be before pivot
			if (elements[j] <= pivotEle) {
				i++;
				int tmp = elements[j];
				elements[j] = elements[i];
				elements[i] = tmp;
			}
		}
		// quicksort the elements before pivot and after pivot
		// if there are atleast two elements
		if(start+1< i) 
			quickSort2(elements, start, i);
		if(i+2<end)
			quickSort2(elements, i+1, end);
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
