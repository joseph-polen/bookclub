 /* Krasso, R., (2021). CIS 530 Server Side Development. Bellevue University, all
rights reserved. 
 */


package com.bookclub.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.bookclub.model.Book;


public class MemBookDao implements com.bookclub.service.dao.BookDao{
	
	private List<Book> books;

	
    /**
     * MemBookDao class adapted from Krasso, R., (2021). CIS 530 Server Side Development. Bellevue University
     */
    public MemBookDao() {
        this.books = new ArrayList<Book>();
        this.books.add(new Book("0345538986", "Jurrasic Park", "Dinousaur cloning gone wrong.", 464, new ArrayList<>(List.of("Michael Chrichton"))));
        this.books.add(new Book("9780451457998", "2001 - A Space Odyssey", "A mysterious monolith is found on the moon.", 296, new ArrayList<>(List.of("Arthur C. Clark"))));
        this.books.add(new Book("1501216783", "Congo", "A search for diamonds protected by dangerous gorrillas.", 336, new ArrayList<>(List.of("Michael Chrichton"))));
        this.books.add(new Book("0553213512", "The Time Machine", "Time travel doesn't go as expected.", 128, new ArrayList<>(List.of("H.G. Wells"))));
        this.books.add(new Book("9780451524935", "1984", "A look into a distopian future.", 328, new ArrayList<>(List.of("George Orwell"))));
    }

	@Override
	public List<Book> list() {
		return this.books;
	}


	@Override
	public Book find(String key) {
		for (Book book : this.books) {
			if (book.getIsbn().equals(key)) {
				return book;
			}
		}
		
		return new Book();
	}

}
