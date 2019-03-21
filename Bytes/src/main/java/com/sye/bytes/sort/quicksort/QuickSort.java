package com.sye.bytes.sort.quicksort;

public class QuickSort {

	public void quickSort(int[] arr, int start, int end) {

		if (start < end) {
			int sortedIndex = partition(arr, start, end);
			quickSort(arr, start, sortedIndex - 1);
			quickSort(arr, sortedIndex + 1, end);
		}

	}

	private int partition(int[] arr, int start, int end) {
		// TODO Auto-generated method stub

		int i = start - 1;

		int sortedValue = arr[end];

		for (int j = start; j <= end - 1; j++) {

			if (arr[j] <= sortedValue) {
				i++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;

			}

		}

		int temp = arr[i + 1];
		arr[i+1] = arr[end];
		arr[end] = temp;

		return i + 1;
	}

}
