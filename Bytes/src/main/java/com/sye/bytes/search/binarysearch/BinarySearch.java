package com.sye.bytes.search.binarysearch;

public class BinarySearch {

	public static void main(String[] args) {
		System.out.println(recursiveBinarySearch(new int[] { 1, 2, 3, 4, 7, 9, 12, 18 },0 ,7,7));
		System.out.println(binarySearch(new int[] { 1, 2, 3, 4, 7, 9, 12, 18 },7));
	}

	public static int binarySearch(int[] arr, int x) {
		int p=0;
		int r= arr.length;
		int mid ;
		
		while(p<r) {
			mid = (p+r)/2;
			if(x==arr[mid]) {
				return mid;
			}else if (x < arr[mid]) {
				r = mid-1;
			}else {
				p=mid+1;
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
