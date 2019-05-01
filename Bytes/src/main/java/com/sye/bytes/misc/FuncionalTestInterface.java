package com.sye.bytes.misc;

@FunctionalInterface
public interface FuncionalTestInterface<V,R> {
	
	public R transform(V v); 
	//public R transform2(V v); 

}
