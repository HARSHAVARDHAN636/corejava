package com.tns.staticprog;

public class Student {
 private String name;// variables
 private int id;
 // static variable
 static String collegename="DBIT";
 // constructor
public Student(String name, int id) {
	super();
	this.name = name;
	this.id = id;
}
@Override
public String toString() {
	return "Student [name=" + name + ", id=" + id + "]";
}
 
 
}
