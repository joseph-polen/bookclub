/*
 * References
 * 
 * https://www.youtube.com/watch?v=kXhYu939_5s
 * 
 * Getting started: Testing the web layer. 
 * Getting Started | Testing the Web Layer. (n.d.). https://spring.io/guides/gs/testing-web/ 
 */


package com.bookclub;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.bookclub.model.WishlistItem;
import com.bookclub.service.dao.WishlistDao;
import com.bookclub.service.impl.MongoWishlistDao;
import com.bookclub.web.HomeController;

@SpringBootTest
class BookclubApplicationTests {
	
	//@Autowired
	//When I tried to autowire this like in the video it said it
	//was not a candidate for autowired and all tests failed
	//couldn't figure this out
	MongoWishlistDao wishlistService;
	
	@MockBean
	WishlistDao wishlistRepo;
	
	@Autowired
	private HomeController controller;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void controllerCreated() throws Exception {
		assertThat(controller).isNotNull();
	}
	
	@Test
	public void testWishlistList() {
		when(wishlistRepo.list("user")).thenReturn(Stream.of(new WishlistItem("3412351","Dune")).collect(Collectors.toList()));
		assertEquals(1, wishlistService.list("user"));
	}

}
