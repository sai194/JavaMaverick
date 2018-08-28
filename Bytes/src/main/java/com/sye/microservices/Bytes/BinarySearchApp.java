package com.sye.microservices.Bytes;

/**
 * Hello world!
 *
 */
public class BinarySearchApp 
{
    public static void main( String[] args )
    {
       
        Integer []arr = {1,2,3,4,5,6};
        System.out.println("index -> "+binarySearch(arr,3));
        
    }
    
    
    public static int binarySearch(Integer []arr , int value) {
    	
    	int low =0;
    	int high = arr.length-1;
    	int mid ;
    	
    	while(low<=high) {
    		mid = low+ (high-low)/2;
    		if(value==arr[mid]) {
    			return mid;
    		}else if(arr[mid] <value) {
    			low=mid+1;
    		}else {
    			high =mid-1;
    		}
    	}
    	
    	
    	
    	return -1;
    }
    
}
