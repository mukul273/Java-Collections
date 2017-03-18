package com.collections.various;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Deque: Doubly Ended Queue
 * @author msamak
 *
 */
public class DequeDemo {

	public static void main(String[] args) {
		Deque<Integer> dq = new ArrayDeque<>();
		
		dq.offerFirst(10);
		dq.offerLast(20);
		dq.offerFirst(30);
		dq.offerLast(40);
		
		for(Integer i : dq)
			System.out.println(i);
		
		System.out.println("After offering aka inserting");
		dq.removeFirst();
		
		for(Integer i : dq)
			System.out.println(i);
		
		System.out.println("After removing first");
		dq.removeLast();
		
		for(Integer i : dq)
			System.out.println(i);
	}
}