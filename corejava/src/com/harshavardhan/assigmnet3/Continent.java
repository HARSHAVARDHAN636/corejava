package com.harshavardhan.assigmnet3;

public class Continent {
	private String continentName;
	private double size;
	private int nofcountry;
	
	 public Continent(){
	super();
	}
	
	public Continent(String continentName, double size, int nofcountry) {
		super();
		this.continentName = continentName;
		this.size = size;
		this.nofcountry = nofcountry;
	}

	}
	public String getContinentName() {
		return continentName;
	}
	public void setContinentName(String continentName) {
		this.continentName = continentName;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public int getNofcountry() {
		return nofcountry;
	}
	public void setNofcountry(int nofcountry) {
		this.nofcountry = nofcountry;
	}

	@Override
	public String toString() {
		return "Continent [continentName=" + continentName + ", size=" + size + ", nofcountry=" + nofcountry + "]";
	}

