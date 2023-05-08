 /* Krasso, R., (2021). CIS 530 Server Side Development. Bellevue University, all
rights reserved. 
 */



package com.bookclub.model;


public class Book {
	
	private String isbn;
	private String title;
	private String description;
	private String infoUrl;
	private int numOfPages;

	
	public Book() {
		super();
	}
	
    public Book(String isbn, String title, String description, String infoUrl, int numOfPages) {
        this.isbn = isbn;
        this.title = title;
        this.description = description;
        this.infoUrl = infoUrl;
        this.numOfPages = numOfPages;
    }
    
    public Book(String isbn, String title, String infoUrl) {
        this.isbn = isbn;
        this.title = title;
        this.infoUrl = infoUrl;
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
	
    public String getInfoUrl() {
        return infoUrl;
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
	
    public void setInfoUrl(String infoUrl) {
        this.infoUrl = infoUrl;
    }
	

    /**
     *Overridden toString() method. Gives book description when called.
     */
    @Override
    public String toString(){
    	//System.out.printf("Book{isbn=" + this.isbn + ", title=" + this.title + ", description=" + this.description + ", numOfPages=" + this.numOfPages + ", authors=" + this.authors);
    	String book = "Book{isbn=" + this.isbn + ", title=" + this.title + ", description=" + this.description + ", numOfPages=" + this.numOfPages + ", infoUrl=" + this.infoUrl;
    	return book;
    }

}
