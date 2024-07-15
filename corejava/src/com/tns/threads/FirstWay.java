package com.tns.threads;

public class FirstWay extends Thread {
	public void run() {//
		System.out.println("creation of thread by extending the thread class");
	}
	public static void main(String args[]) {
		FirstWay ob = new FirstWay();//thread is in born state
		ob.start();//runnable
		
	}

}
