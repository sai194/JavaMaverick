package com.sye.microservices.Bytes.interfaces;

public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle vehicle = new Audi();
		
		vehicle.run();
		//Add cast to invoke test
		((Audi) vehicle).test();

	}

}
