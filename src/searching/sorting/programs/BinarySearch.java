package searching.sorting.programs;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr = { 7, 8, 5, 3, 9, 0, };
		int key = 6;

		int li = 0;
		int hi = arr.length - 1;
		int mi = (li + hi) / 2;

		Arrays.sort(arr);

		while (li <= hi) {
			if (arr[mi] == key) {
				System.out.println("key found at " + mi + " index position");
				break;
			} else if (arr[mi] < key) {
				li = mi + 1;
			} else if (arr[mi] > key) {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
		}
		if (li > hi) {
			System.out.println("key not found in the list");
		}
	}

}
