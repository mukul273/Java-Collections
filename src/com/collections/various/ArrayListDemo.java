package com.collections.various;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList Demo
 * ArrayList is asynchronous means multiple threads can manipulate the contents of ArrayList which will 
 * lead inconsistency as opposed to Vector.
 * @author msamak
 *
 */
public class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("1");
		list.add("2");
		list.add("3");
		
		System.out.println(list.size()); // to get the size of list
		
		// to iterate
		for(String s : list)
			System.out.println(s);
		
		System.out.println(list.get(1)); // to get the specific location value
		
		System.out.println(list.isEmpty()); // to check if list of empty
		
		System.out.println(list.toArray()); // just to demo the toArray method
		
		list.remove(0); // to reove the item from ArrayList
		
		// to use to Array method
		Object[] objArr = list.toArray();
		for(Object o : objArr)
			System.out.println(o);
			
		
		
		
		
	}
}