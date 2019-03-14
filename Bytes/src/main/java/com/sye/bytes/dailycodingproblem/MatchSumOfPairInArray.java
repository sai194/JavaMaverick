package com.sye.bytes.dailycodingproblem;

/*
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

Bonus: Can you do this in one pass?
 */

public class MatchSumOfPairInArray {
	
	public static  boolean matchSum(int []arr,int sum) {
		
		for (int i =0 ;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
		
				if(arr[i]+arr[j]==sum)
					return true;
			}
			
		}
		return false;
	}
	 
	
	public static void main(String []args) {
		int arr[] = {10, 15, 3, 7,5} ;
		int sum = 10;
		System.out.println(matchSum(arr,sum));
		
	}
	
	
}
