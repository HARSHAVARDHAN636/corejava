package com.tns.lambdaexp;

import java.util.ArrayList;

public class LambdaCollections {
	public static void main(String [] args) {
		ArrayList<Integer>li=new ArrayList<>();
		li.add(22);
		li.add(36);
		li.add(44);
		
		li.forEach(e->System.out.println(e));
	}

}
