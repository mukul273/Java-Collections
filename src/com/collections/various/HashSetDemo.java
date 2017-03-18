package com.collections.various;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet: hashmap in the background, ordering is not guaranteed,NULLs allowed, asynchronous, doesn't allow same item multiple times
 * HashSet may become slower when it has High capacity and no. of items because its always no. of items + capacity, Not Sorted
 * @author msama
 *
 */
public class HashSetDemo {

	public static void main(String[] args) {
		
		Set<String> hashSet = new HashSet<>();
		
		hashSet.add("1");
		hashSet.add("100");
		hashSet.add("200");
		hashSet.add("300");
		hashSet.add("300");
		hashSet.add("300");
		
		System.out.println(hashSet.contains("500"));
		
		for(String s : hashSet)
			System.out.println(s);
		
		System.out.println(hashSet.remove("300"));
		
		for(String s : hashSet)
			System.out.println(s);
		
	}
}