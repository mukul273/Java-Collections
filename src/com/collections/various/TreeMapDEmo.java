package com.collections.various;

import java.util.Map;
import java.util.TreeMap;

/**
 * TreeMap : Asynchronous, Natural sorting based on keys, 
 * Use comparable for custom object ordering 
 * @author msamak
 *
 */
public class TreeMapDEmo {

	public static void main(String[] args) {
		
		Map<String, Integer> treeMap = new TreeMap<>();
		
		treeMap.put("1", 100);
		treeMap.put("3", 99);
		treeMap.put("2", 98);
		
		for(String s :treeMap.keySet())
			System.out.println(s +"-"+treeMap.get(s));
		
		System.out.println("After Remove demo");
		
		System.out.println(treeMap.remove("1"));
		
		System.out.println("After really removing");
		for(String s :treeMap.keySet())
			System.out.println(s +"-"+treeMap.get(s));
		
	}
}