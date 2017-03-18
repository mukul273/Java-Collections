package com.collections.various;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(0);
		stack.push(2);
		stack.push(4);
		
		System.out.println(stack.peek());
		
		System.out.println(stack.size());
		
		System.out.println(stack.pop());
		
		for(Integer i :stack)
			System.out.println(i);
	}
}