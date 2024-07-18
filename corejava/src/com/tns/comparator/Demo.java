package com.tns.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
	public static void main(String args[]) {
		ArrayList<Student> arr=new ArrayList<Student>();
		arr.add(new Student(222,"aaa","paris"));
		arr.add(new Student(242,"bbb","Mumbai"));
		arr.add(new Student(322,"ccc","New york"));
		
		System.out.println("------------");
		Collections.sort(arr,new SortRoll());
		for(int i=0;i<arr.size();i++)
			System.out.println(arr.get(i));
		
		Collections.sort(arr,new SortName());
		for(int i=0;i<arr.size();i++)
			System.out.println(arr.get(i));
		
	}

}
