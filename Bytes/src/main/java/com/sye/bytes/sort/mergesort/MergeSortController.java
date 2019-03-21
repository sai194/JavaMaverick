package com.sye.bytes.sort.mergesort;

import java.util.Arrays;

public class MergeSortController {

	public static void main(String[] args) {

		int[] inputArray = { 9, 7, 3, 1, 6, 3, 2, 6, 8, 9, 2, 3, 0,1234 };
		MergeSort sorter = new MergeSort();

		sorter.mergeSort(inputArray,0,inputArray.length-1);

		System.out.print(Arrays.toString(inputArray));

	}

}
