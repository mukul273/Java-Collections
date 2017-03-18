package com.collections.various;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCustomObjects {

	public static void main(String[] args) {
		
		List<Book> books = new ArrayList<>();
		
		books.add(new Book("Ms.", "Moron", 101 ));
		books.add(new Book("Mr.", "Cracking", 100 ));
		books.add(new Book("Mrs.", "Fuzzy", -100 ));
		
		Collections.sort(books);
		
		System.out.println(books);
	}
}