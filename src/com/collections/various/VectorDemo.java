package com.collections.various;

import java.util.List;
import java.util.Vector;

/**
 * Vector is synchronized means multiple threads can manipulate the contents of vector without any 
 * consistency as opposed to ArrayList. Vector size can be incremented dynamically by specifying
 * the increment size.
 * @author msamak
 *
 */
public class VectorDemo {

	public static void main(String[] args) {
		
		List<Integer> vector = new Vector<>(10, 5);
		
		vector.add(1);
		vector.add(3);
		vector.add(5);
		vector.add(7);
		
		for(Integer i : vector)
			System.out.println(i);
		
		System.out.println(vector.size());
		System.out.println(vector.isEmpty());
		System.out.println(vector.remove(3));
		
		for(Integer i : vector)
			System.out.println(i);
		
	}
}