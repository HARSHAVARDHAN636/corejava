package com.tns.abstractprograms;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the value for harshith");
		double Harshithsalray=sc.nextDouble();
		TaxPayer ob=new Harshith(Harshithsalray);
		
		System.out.println("enetr the value for harsha");
		double Harshasalray=sc.nextDouble();
		TaxPayer ob1=new Harshith(Harshasalray);
System.out.println("Tax harshith");
ob.display();
System.out.println("Tax harsha");
ob.display();
sc.close();
	}

}
