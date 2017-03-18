package com.collections.various;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortingCollections {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(0);
		list.add(-1);
		list.add(10);
		list.add(100);
		
		Collections.sort(list);
		
		System.out.println(list); // Another way of printing the list
		
		for(Integer i : list)
			System.out.println(i);
		
		System.out.println("Sorting of Strings based on LinkedList");
		
		List<String> slist = new LinkedList<>();
		
		slist.add("n");
		slist.add("m");
		slist.add("o");
		slist.add("o");
		slist.add("r");
		
		Collections.sort(slist);
		
		System.out.println(slist);
	}
}