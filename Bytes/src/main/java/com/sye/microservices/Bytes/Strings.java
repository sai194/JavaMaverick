package com.sye.microservices.Bytes;

public class Strings {
	public static  boolean isStrEmpty( String val){

        boolean chk = false;
        if(!(val!=null && !val.trim().isEmpty())){
            chk= true;
        }

        return chk;

    }
	
	public static void main(String args[]) {
		
		System.out.println(isStrEmpty(""));
		System.out.println(isStrEmpty("  "));
		System.out.println(isStrEmpty("Sai"));
		System.out.println(isStrEmpty(null));
	}
}
