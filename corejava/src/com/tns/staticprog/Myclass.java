package com.tns.staticprog;

public class Myclass {
private int section;// instance
static int srNo;//static variable
static {
	System.out.println("=====static block");
	srNo=1000;
//	section++;
}
public Myclass() {
	super();
	System.out.println("----default constructor");
} 
static void display() {
	System.out.println("-----static method");
	System.out.println("the serial no:"+srNo++);
	
}
@Override
public String toString() {
	return "Myclass [section=" + section + "]";
}

}
