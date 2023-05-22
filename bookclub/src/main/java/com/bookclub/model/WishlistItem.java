 /* Krasso, R., (2021). CIS 530 Server Side Development. Bellevue University, all
rights reserved. 
 */

package com.bookclub.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

public class WishlistItem {
	
	private String username;
	
	@NotNull
	@NotEmpty(message = "ISBN is a required field")
	private String isbn;
	
	@NotNull
	@NotEmpty(message = "Title is a required field")
	private String title;
	
    @Id
    private String id;

	public WishlistItem() {
		super();
	}
	
    public WishlistItem(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }
    
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }
    
   public String getId() {
	   return id;
   }
   
   public String getUsername() {
       return username;
   }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *Overridden toString() method. Gives wishlist item when called.
     */
    @Override
    public String toString(){
    	String item = "WishlistItem isbn=" + this.isbn + ", title=" + this.title + ", id=" + this.id + ", username=" + this.username;
    	return item;
    }
}
