package com.tns.assignment4;


public class InsufficentAmountException extends Exception{
	private String withdraw;
	
	public InsufficentAmountException(String withdraw) {
		super();
		this.withdraw=withdraw;
	}
	

}
