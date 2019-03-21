package com.sye.bytes.sort.mergesort;

public class MergeSort {

	public void mergeSort(int[] arr, int start, int end) {

		if (end <= start) {
			return; 
		}

		int mid = (start + end) / 2;
		mergeSort(arr, start, mid);
		mergeSort(arr, mid + 1, end);
		merge(arr, start, mid, end);

	}

	public void merge(int[] arr, int start, int mid, int end) {

		int[] tempArr = new int[end - start + 1];
		int leftCounter = start;
		int rightCounter = mid + 1;
		int tempCounter = 0;
		while (leftCounter <= mid && rightCounter <= end) {
			if (arr[leftCounter] < arr[rightCounter]) {
				tempArr[tempCounter] = arr[leftCounter];
				leftCounter++;
			} else {
				tempArr[tempCounter] = arr[rightCounter];
				rightCounter++;
			}
			tempCounter++;
		}

		if (leftCounter <= mid) {

			while (leftCounter <= mid) {
				tempArr[tempCounter] = arr[leftCounter];
				leftCounter++;
				tempCounter++;
			}

		} else if (rightCounter <= end) {
			while (rightCounter <= end) {
				tempArr[tempCounter] = arr[rightCounter];
				rightCounter++;
				tempCounter++;
			}
		}

		for (int i = 0; i < tempArr.length; i++) {
			arr[start + i] = tempArr[i];
		}
	}
}
