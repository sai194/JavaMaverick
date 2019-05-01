package com.sye.bytes.algos;
class largestSum{
  static int find_max_sum_sub_array(int[] A) {
	  
	  int globalMax =A[0];
	  int currentMax =A[0];
	  
	  for(int i=0;i<A.length;i++) {
		  
		  
		  if(currentMax <0) {
			  currentMax=A[i];
		  }else {
			  currentMax = currentMax+A[i]; 
		  }
		  if(currentMax>globalMax) {
			  globalMax =currentMax;
		  }
	  }
	  
   
    return globalMax;
  }
  public static void main(String[] args) {
    int[] v = new int[]{1, 10, -1, 11, 5, -30, -7, 20, 25, -35};
    System.out.println("Sum of largest subarray: " + find_max_sum_sub_array(v));


    int[] v1 = new int[]{-15, -14, -10, -19, -5, -21, -10};
    System.out.println("Sum of largest subarray: " + find_max_sum_sub_array(v1));
  }
}  