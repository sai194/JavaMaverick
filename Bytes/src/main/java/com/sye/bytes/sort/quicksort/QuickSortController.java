package com.sye.bytes.sort.quicksort;

import java.util.Arrays;

public class QuickSortController {

	public static void main(String[] args) {
		int[] inputArray = { 12, 81, 74, 43, 1098, 0, 8, 92, 17, 754, 912, 0, 6, 4 };
		QuickSort quickSort = new QuickSort();
		quickSort.quickSort(inputArray, 0, inputArray.length - 1);

		System.out.print(Arrays.toString(inputArray));
	}
}
