package com.collections.various;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		Queue<Person> pQ = new PriorityQueue<>();
		
		pQ.add(new Person("1",1));
		pQ.add(new Person("2",2));
		pQ.add(new Person("3",3));
		pQ.add(new Person("10",10));
		
		System.out.println("Peek:");
		System.out.println(pQ.peek());
		System.out.println("Iterate..args.");
		while(pQ.peek() !=null)
			System.out.println(pQ.poll());
		
	}
}