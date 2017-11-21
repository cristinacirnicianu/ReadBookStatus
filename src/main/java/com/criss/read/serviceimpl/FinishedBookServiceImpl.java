package com.criss.read.serviceimpl;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.criss.read.service.StatusReadingService;

public class FinishedBookServiceImpl implements StatusReadingService {
	
	Date finishedDate = new Date();
	Date startDate = new Date();
	SimpleDateFormat dateFormater = new SimpleDateFormat("dd.MM.yyyy");
	String finishD =dateFormater.format(finishedDate);
	String startD=dateFormater.format(startDate);
	
	
	public void setFinishD(String finishD) {
		this.finishD = finishD;
	}

	public void setStartD(String startD) {
		this.startD = startD;
	}


	public String readingBook(String bookName, String userName) {
	
		String service="\n" +userName +" start read the book "+ bookName + " at "+startD  +
				" and " + finishBook +				" at "+ finishD +".";
		return service;
	}

	

	

}
