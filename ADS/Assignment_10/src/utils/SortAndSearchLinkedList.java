package utils;

public class SortAndSearchLinkedList {

	public static void bubble(int[] elements, int size) {
		int hi = size-1;
		int lo = 0;
		for(int i =lo; i < size-2; i++) {
			int swap = 0;
			for(int right = hi ; right > lo ; right--) {
				int left = right-1;
				if(elements[left] > elements[right]) {
					int tmp = elements[right];
					elements[right] = elements[left];
					elements[left] = tmp;
					swap++;
				}
			}
			if(swap==0)
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
		int hi = size-1;
		int i = (lo+hi)/2;
		while(! (lo>hi)) {
			int data = elements[i];
			if(data==e)
				return true;
			if(data > e) 
				hi = i-1;
			else
				lo = i+1;
			
			i = (lo+hi) / 2;
			
		}
		
		
		return false;
	}
	

}
