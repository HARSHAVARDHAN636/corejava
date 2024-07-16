package com.tns.collections;
import java.util.*;


public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList ob =new ArrayList();
		System.out.println("the size of the arraylist"+ob.size());
		ob.add(2);
		ob.add('a');
		ob.add(22.35);
		System.out.println("the elements of the array are "+ ob);
		System.out.println("check the elements  is ther are not "+ ob.contains(22.35));
		System.out.println("the remove the specifiedn  elements from the list "+ ob.remove(0));
			System.out.println("the elements of the array are"+ ob);
			System.out.println(ob.isEmpty());
			
		ArrayList<String> obj=new  ArrayList<String>();
		obj.add("Banglore");
		obj.add("Mysore");
		obj.add("Shivamogga");
		System.out.println("the elements of the array are"+obj);
		Collections.sort(obj);
		System.out.println("the elemnts in the array are"+obj);
		
		Iterator<String>i=obj.iterator();
		while(i.hasNext()) {
			String nm=i.next();
			System.out.println(nm);
			
		}
		
		
		
		
	}

}
