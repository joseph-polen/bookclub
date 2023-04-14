 /* Krasso, R., (2021). CIS 530 Server Side Development. Bellevue University, all
rights reserved. 
 */

package com.bookclub.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.bookclub.model.WishlistItem;

public class MemWishlistDao implements com.bookclub.service.dao.WishlistDao {
	
	List<WishlistItem> wishlist;
	
    public MemWishlistDao() {
        this.wishlist = new ArrayList<WishlistItem>();
        this.wishlist.add(new WishlistItem("0345538986", "Jurassic Park"));
        this.wishlist.add(new WishlistItem("9780451457998", "2001 - A Space Odyssey"));
        this.wishlist.add(new WishlistItem("1501216783", "Congo"));
        this.wishlist.add(new WishlistItem("0553213512", "The Time Machine"));
        this.wishlist.add(new WishlistItem("9780451524935", "1984"));
    }
	
    @Override
    public List<WishlistItem> list(){
    	return this.wishlist;
    }


	@Override
	public WishlistItem find(String key) {
		for (WishlistItem item : wishlist) {
			if (item.getIsbn().equals(key)) {
				return item;
			}
		}
		
		return new WishlistItem();
	}

}
