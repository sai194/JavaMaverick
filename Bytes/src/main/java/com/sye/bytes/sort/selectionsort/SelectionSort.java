package com.sye.bytes.sort.selectionsort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] myArray = selectionSort(new int[] {9,8,3,13,87,12,99});
		System.out.print(Arrays.toString(myArray));

	}

	public static int[] selectionSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			int min = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			
			int temp =arr[min];
			arr[min]=arr[i];
			arr[i]=temp;

		}

		return arr;
	}
	

}
