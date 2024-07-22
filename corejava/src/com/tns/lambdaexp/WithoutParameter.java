package com.tns.lambdaexp;

public class WithoutParameter {
	public static void main(String args[]) {
		Message m=()-> {return "hi harsha";};
		System.out.println(m.greet());
		Cube c=(a)->{return a*a*a;};
		System.out.println("")
	}

}
