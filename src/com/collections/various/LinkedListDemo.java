package com.collections.various;

import java.util.List;
import java.util.LinkedList;

/**
 * Linked List demo
 * LinkedList implements Deque and queue interfaces
 * @author msamak
 *
 */
public class LinkedListDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println(list.size());
		System.out.println(list.remove(1)); // very fast removal operation as compared to ArrayList
		System.out.println(list.isEmpty());
		
		for(Integer i : list)
			System.out.println(i);
	}
}