package com.collections.various;

/**
 * Java uses QuickSort for primitive types
 * Java uses mergeSort for sorting reference types
 * @author msamak
 */
import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		
		int[] nums = {1,5,3,8,10,-2,0};
		String[] str = {"z","x","c","v","f","g"};
		
		Arrays.sort(nums);
		
		for(Integer i : nums)
			System.out.print(i+"-"); // One dimensional array sorting
		
		System.out.println();
		
		Arrays.sort(str);
		for(String s : str)
			System.out.print(s+"-"); // One dimensional array sorting
	}
}