package com.sye.bytes.search.binarysearch;

public class BinarySearch {

	public static void main(String[] args) {
		System.out.println(recursiveBinarySearch(new int[] { 1, 2, 3, 4, 7, 9, 12, 18 },0 ,7,7));
		System.out.println(binarySearch(new int[] { 1, 2, 3, 4, 7, 9, 12, 18 },7));
	}

	public static int binarySearch(int[] A, int key) {
		int low = 0;
	    int high = A.length -1;

	    while (low <= high) {

	      int mid = low + ((high - low) / 2);

	      if (A[mid] == key) {
	        return mid;
	      }

	      if (key < A[mid]) {
	        high = mid - 1;
	      }
	      else {
	        low = mid + 1;
	      }
	    }

	   
		return -1;
	}
	
	public static int recursiveBinarySearch(int [] arr, int p, int r, int x){
		
		int mid =(p+r)/2;
		
		if(x==arr[mid]) {
			return mid;
		}else if(x <arr[mid]) {
			return recursiveBinarySearch(arr, p, mid-1, x);
		}else {
			return recursiveBinarySearch(arr, mid+1, r, x);
		}
		
		//return -1;
		
	}
}
