package com.tns.staticprog;

public class Demo {
	public static void main(String[] args) {
		System.out.println("the collegename is:"+Student.collegename);//accessed the static variable
		Student ob=new Student("harsha",21);
		System.out.println(ob);
	}

}
