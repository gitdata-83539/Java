package com.sunbeam.entity;

public class ExceptionLineTooLong extends Exception {
	
	private String message;
	private int len;
	
	
	public ExceptionLineTooLong(String message, int len) {
		super();
		this.message = message;
		this.len = len;
	}
	
	public void printStackTrace()
	{
		System.out.println("Exception Occured: ");
		System.out.println("ExceptionLineTooLong: "+message);
		System.out.println("String has more than 80 characters");
		
	}
}
