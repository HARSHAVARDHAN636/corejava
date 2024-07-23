package com.tns.generics;



public class Genericmethod {
	public<T> void displayArrayElements(T elements[]) {
		for(T ele:elements) {
			System.out.println("elements is:"+ele);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Genericmethod obj=new Genericmethod();
		Integer[] intarray= {10,20,30};
		String [] strarray= {"Hii", "Harsha"};
		obj.displayArrayElements(intarray);
		obj.displayArrayElements(strarray);
		Function
	}

}