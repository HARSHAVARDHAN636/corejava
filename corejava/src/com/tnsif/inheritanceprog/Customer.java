package com.tnsif.inheritanceprog;

public class Customer {
	private String name;
	private int id;
	private long adhaar;
	private long phone;
	
	public Customer() {
	super();
}
// default constructor
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getAdhaar() {
		return adhaar;
	}

	public void setAdhaar(long adhaar) {
		this.adhaar = adhaar;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
	

	public Customer(String name, int id, long adhaar, long phone) {
		super();
		this.name = name;
		this.id = id;
		this.adhaar = adhaar;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + ", adhaar=" + adhaar + ", phone=" + phone + "]";
	}
}
	


