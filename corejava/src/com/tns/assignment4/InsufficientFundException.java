package com.tns.assignment4;



public class InsufficientFundException extends Exception{
	String deposit;

	public InsufficientFundException(String deposit) {
		super();
		this.deposit=deposit;
	}
	
	

}