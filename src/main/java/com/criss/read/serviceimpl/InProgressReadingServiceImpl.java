package com.criss.read.serviceimpl;

import com.criss.read.service.StatusReadingService;

public class InProgressReadingServiceImpl implements StatusReadingService {

	public String readingBook(String bookName, String userName) {
		String service="\n "+userName +" is still reading "+ bookName +  ".";
		return service;
	}

}
