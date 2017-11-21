package com.criss.read.service;

public interface StatusReadingService {
	public String readingBook(String bookName, String userName);
	public String notRead="not read";
	public String startRead="start read";
	public String inProgress="in progress";
	public String finishBook="finished";

}
