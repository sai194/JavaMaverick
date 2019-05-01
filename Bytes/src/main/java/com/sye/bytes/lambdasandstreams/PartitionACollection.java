package com.sye.bytes.lambdasandstreams;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartitionACollection {
	
	public static void main (String []args) {
		
		Set<Integer> ids = Stream.of(1,2,3,4,5,6,7,8,9,10).collect(Collectors.toSet());
		
		System.out.println(partitionMap(ids,3));
		System.out.println(partition(ids,3));
		
	}
	
	private static  Map<Object, List<Integer>> partitionMap(Set<Integer> list, int size) {
        final AtomicInteger counter = new AtomicInteger(0);

        return list.stream()        		
                .collect(Collectors.groupingBy(it -> counter.getAndIncrement() / size))   
                ;
            
    }
	
	private static  Collection<List<Integer>> partition(Set<Integer> list, int size) {
        final AtomicInteger counter = new AtomicInteger(0);

        return list.stream()        		
                .collect(Collectors.groupingBy(it -> counter.getAndIncrement() / size))   
                .values();
                
    }

}
