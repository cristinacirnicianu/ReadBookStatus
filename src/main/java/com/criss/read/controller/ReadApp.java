package com.criss.read.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.criss.read.domain.UserReads;

public class ReadApp {
	public static void main(String[] args) {
		
			
	ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-read.xml");
	
	UserReads userRead=(UserReads)ctx.getBean("userread");
	
	
	String userBook =userRead.readBook();
	System.out.println(userBook);
	
	
	
	((ClassPathXmlApplicationContext)ctx).close();
	
	

}
}
