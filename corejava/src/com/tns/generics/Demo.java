package com.tns.generics;

public class Demo {
	public static void main(String args[]) {
	Generics <String>stringobj=new Generics();
	stringobj.setData("harsha");
	System.out.println("string value="+stringobj.getData());
	
	
	Generics<Integer>intobj =new Generics();
	intobj.setData(21);
	System.out.println("Integer value="+intobj.getData());
	
	Generics<Double>doubleobj =new Generics();
	doubleobj.setData(22.67);
	System.out.println("double value="+doubleobj.getData());

}
}