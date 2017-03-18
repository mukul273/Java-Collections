package com.collections.various;

public class Book implements Comparable<Book>{

	private String authorName;
	private String title;
	private int noOfPages;

	public Book() {
	}

	public Book(String authorName, String title, int noOfPages) {
		this.authorName = authorName;
		this.title = title;
		this.noOfPages = noOfPages;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	@Override
	public String toString() {
		return "Book [authorName=" + authorName + ", title=" + title + ", noOfPages=" + noOfPages + "]";
	}
	
	@Override
	public int compareTo(Book otherbook) {
		return -this.title.compareTo(otherbook.getTitle()); // For descending order
		//return this.title.compareTo(otherbook.getTitle()); // For Ascending order
		
		// Another way of ascending and descending is (Just in case above "-" doesn't work
		/*if(this.noOfPages > otherbook.getNoOfPages()) return +1;
		if(this.noOfPages == otherbook.getNoOfPages()) return 0;
		return -1;*/
	}
}