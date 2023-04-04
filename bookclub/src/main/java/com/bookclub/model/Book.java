 /* Krasso, R., (2021). CIS 530 Server Side Development. Bellevue University, all
rights reserved. 
 */



package com.bookclub.model;

import java.util.List;

public class Book {
	
	private String isbn;
	private String title;
	private String description;
	private int numOfPages;
	private List<String> authors;
	
	public Book() {
		super();
	}
	
	public Book(String isbn, String title, String description, int numOfPages, List<String> authors) {	
		this.isbn = isbn;
		this.title = title;
		this.description = description;
		this.numOfPages = numOfPages;
		this.authors = authors;	
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getDescription() {
		return description;
	}
	public int getNumOfPages() {
		return numOfPages;
	}
	
	public List<String> getAuthors() {
		return authors;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}
	
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
    /**
     *Overridden toString() method. Gives book description when called.
     */
    @Override
    public String toString(){
    	//System.out.printf("Book{isbn=" + this.isbn + ", title=" + this.title + ", description=" + this.description + ", numOfPages=" + this.numOfPages + ", authors=" + this.authors);
    	String book = "Book{isbn=" + this.isbn + ", title=" + this.title + ", description=" + this.description + ", numOfPages=" + this.numOfPages + ", authors=" + this.authors + "}";
    	return book;
    }

}
