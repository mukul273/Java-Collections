package com.collections.various;

public class BookCopy {

	private String authorName;
	private String title;
	private int noOfPages;

	public BookCopy() {
	}

	public BookCopy(String authorName, String title, int noOfPages) {
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
}