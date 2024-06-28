package com.harshavardhan.assigmnet3;

public class Country extends Continent
{
	private String capital;
	private int noofstates;
	private String nationalang;
	public Country () {
		super();
	}
	public Country(String continentName, double size, int nofcountry,String capital ,int noofstates,String nationalang) {
		super(continentName, size, nofcountry);
		// TODO Auto-generated constructor stub
		this.capital=capital;
		this.noofstates=noofstates;
		this.nationalang=nationalang;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public int getNoofstates() {
		return noofstates;
	}
	public void setNoofstates(int noofstates) {
		this.noofstates = noofstates;
	}
	public String getNationalang() {
		return nationalang;
	}
	public void setNationalang(String nationalang) {
		this.nationalang = nationalang;
	}
	
	}
	
