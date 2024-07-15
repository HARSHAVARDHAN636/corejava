package com.tns.threads;

public class SecondWay implements Runnable {
	public static void main(String args[]) {
		SecondWay t=new SecondWay();//new state 
		Thread th=new Thread(t);
		th.start();//runnable
	}
	public void run() {
		System.out.println("creation of thread using runnable interfaces");
			
		
	}

}
