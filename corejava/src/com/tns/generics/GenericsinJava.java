package com.tns.generics;

import java.util.ArrayList;

public class GenericsinJava {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		//ArrayList list =new ArrayList();//raw type
		list.add("Java");
		list.add(123);//integer
		for (Object object : list)
		{
			//below statement throws Classexception at run time
			String str=(String) object;
			System.out.println(str);
		}
	}

}
