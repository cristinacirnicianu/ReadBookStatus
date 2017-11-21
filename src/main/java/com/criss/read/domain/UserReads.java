package com.criss.read.domain;

import com.criss.read.service.ReadService;
import com.criss.read.service.StatusReadingService;

public class UserReads implements ReadService{
	private User user;
	private Book book;
	private StatusReadingService statusReadingService;
	public UserReads() {}
	public UserReads(Book book, User user, StatusReadingService statusReadingService) {
		this.book = book;
		this.user = user;
		this.statusReadingService = statusReadingService;
	}

	public void setUser(User user) {
		this.user = user;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public void setStatusReadingService(StatusReadingService statusReadingService) {
		this.statusReadingService = statusReadingService;
	}
	public String readBook() {
	String userReadStat=statusReadingService.readingBook(book.getBookName(), user.getUserName());
	return userReadStat;
	}
	
	
	

}
