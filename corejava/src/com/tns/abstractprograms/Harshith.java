package com.tns.abstractprograms;

public class Harshith extends TaxPayer {

	public Harshith(double salray) {
		super(salray);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calTax() {
		// TODO Auto-generated method stub
		if(salray<=50000) {
			return salray*0.10;
		}
		else {
			return salray*0.20;
		}
		
	}

}
