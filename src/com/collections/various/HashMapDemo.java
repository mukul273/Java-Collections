package com.collections.various;

/**
 * HashMap - Asynchronous, order is not guaranteed, allows NULL values
 * @author msamak
 */
		
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> hashMap = new HashMap<>();
		
		hashMap.put("John", 30);
		hashMap.put("Adam", 40);
		hashMap.put("Kevin", 50);
		
		System.out.println(hashMap.get("Kevin"));
		
		for(Map.Entry<String, Integer> entry : hashMap.entrySet())
			System.out.println(entry.getKey() +"-"+entry.getValue());
	}
}