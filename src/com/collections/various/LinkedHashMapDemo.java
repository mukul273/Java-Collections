package com.collections.various;

/**
 * LinkedHashMap : Asynchronous, Order is guaranteed, Allows nulls
 * @author msamak
 */
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		
		linkedHashMap.put("1", 1);
		linkedHashMap.put("2", 2);
		linkedHashMap.put("3", 3);
		linkedHashMap.put("4", 4);
		linkedHashMap.put("5", 5);
		
		for(Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
			System.out.println(entry.getKey() + " : "+entry.getValue());
		}
	}
}