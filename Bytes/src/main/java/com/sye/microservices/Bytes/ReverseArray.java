package com.sye.microservices.Bytes;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		Integer[] arr = { 1,2,3,4,5,6,7};
		System.out.println("max sub array sum ->" + Arrays.toString(reverseArray(arr)));

	}

	private static Integer[] reverseArray(Integer[] arr) {
		// TODO Auto-generated method stub

		int mid = arr.length / 2;
		int size = arr.length - 1;

		for (int i = 0; mid > 0; i++, mid--) {

			int temp =arr[i];
			arr[i] = arr[size - i];
			arr[size-i]=temp;
		}

		System.out.println(mid);
		return arr;
	}

}
