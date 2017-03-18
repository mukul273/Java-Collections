package com.collections.various;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookComparatorDemo implements Comparator<BookCopy>{

	public static void main(String[] args) {
		List<BookCopy> books = new ArrayList<>();
		
		books.add(new BookCopy("Ms.", "Moron", 101 ));
		books.add(new BookCopy("Mr.", "Cracking", 100 ));
		books.add(new BookCopy("Mrs.", "Fuzzy", -100 ));
		
		Collections.sort(books, new BookComparatorDemo()); // for ordering
		//Collections.sort(books, new BookComparatorDemo().reversed()); // for reversed ordering, very elegant
		
		System.out.println(books);
		
	}

	@Override
	public int compare(BookCopy book, BookCopy otherBook) {
		return Integer.compare(book.getNoOfPages(), otherBook.getNoOfPages());
	}
}