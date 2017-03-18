package com.collections.various;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * LinkedHashSet: Asynchronous, ordered storage, doesn't take duplicate like HashSet, Not Sorted
 * @author msamak
 */
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Set<String> linkedHashSet = new LinkedHashSet<>();

		linkedHashSet.add("1");
		linkedHashSet.add("100");
		linkedHashSet.add("200");
		linkedHashSet.add("300");
		linkedHashSet.add("300");
		linkedHashSet.add("300");

		System.out.println(linkedHashSet.contains("500"));

		for (String s : linkedHashSet)
			System.out.println(s);

		System.out.println(linkedHashSet.remove("300"));

		for (String s : linkedHashSet)
			System.out.println(s);
	}
}