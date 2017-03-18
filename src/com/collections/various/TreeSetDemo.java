package com.collections.various;

import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet: Sorted, slower, implemented using TreeMap instance, doesn't take duplicate
 * @author msamak
 *
 */
public class TreeSetDemo {

	public static void main(String[] args) {
		
		Set<Integer> set = new TreeSet<>();
		
		set.add(-1);
		set.add(0);
		set.add(10);
		set.add(2);
		set.add(200);
		set.add(-1); // won't take 
		
		for(Integer i: set)
			System.out.println(i);
		
	}
}