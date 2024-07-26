package com.tns.abstractprograms;

public class Harsha extends TaxPayer {

	public Harsha(double salray) {
		super(salray);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calTax() {
		// TODO Auto-generated method stub
		
		return salray*0.15;
	}

}
