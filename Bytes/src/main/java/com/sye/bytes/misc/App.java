package com.sye.bytes.misc;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FuncionalTestInterface<String,Integer> test = (String s) ->{return s.length();};
		System.out.println(test.transform("Sai"));
		
			
	}

}
