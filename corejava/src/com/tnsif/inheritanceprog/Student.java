package com.tnsif.inheritanceprog;

public class Student extends Customer{
	private String collegename;
	private int rollno; 
	public Student() {
		super();
	}
	public Student(String name, int id, long adhaar, long phone) {
		super(name, id, adhaar, phone);
		// TODO Auto-generated constructor stub
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Student [collegename=" + collegename + ", rollno=" + rollno + ", getCollegename()=" + getCollegename()
				+ ", getRollno()=" + getRollno() + ", getName()=" + getName() + ", getId()=" + getId()
				+ ", getAdhaar()=" + getAdhaar() + ", getPhone()=" + getPhone() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}
