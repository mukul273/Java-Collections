package com.collections.various;

/**
 * Queue as FIFO Structure
 * @author msamak
 */
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<String> q = new LinkedList<>();
		
		q.add("1");
		q.add("2");
		q.add("3");
		
		for (String s : q)
			System.out.println(s);
		
		q.remove();
		
		System.out.println("After Remove..");
		for (String s : q)
			System.out.println(s);
		System.out.println("Rest some of methods...");
		System.out.println(q.element());
		System.out.println(q.size());
		
		
	}
}