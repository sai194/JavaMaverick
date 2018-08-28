package com.sye.microservices.Bytes;

public class ContiguousSubArraySum {
	
	public static void main( String[] args )
    {
     
        Integer []arr = {1,-2,3,4,-4,6,-14,8,2};    
        System.out.println("max sub array sum ->"+maxSubArray(arr));
        
    }
	
	public static int maxSubArray(Integer []arr) {
		
		int maxSoFar=0;
		int maxEndingHere =0;
		
		for(int i=0 ; i<arr.length;i++) {
			
			maxEndingHere = maxEndingHere+arr[i];
			
			if(maxEndingHere < 0) {
				maxEndingHere=0;
			}
			if(maxSoFar < maxEndingHere) {
				maxSoFar=maxEndingHere;				
			}
		}
		
		
		return maxSoFar;
	}
    

}
