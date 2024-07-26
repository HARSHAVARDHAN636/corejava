//program to demonstrate  abstract class
package com.tns.abstractprograms;
//non concrete class
public abstract class TaxPayer {
	protected double salray;// instance variable
	
	public TaxPayer(double salray) {//parametrized constructor
		super();
		this.salray = salray;
	}
	public abstract double calTax();//abstract method 
	
	public void display() {//non abstract method
	System.out.println("the tax payed is"+calTax());
	
}
}