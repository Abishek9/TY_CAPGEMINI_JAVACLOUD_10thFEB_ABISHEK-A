package com.tyss.cg.assignment;

public class Runnable1 implements Runnable {
	public void run(){  
		System.out.println("thread is running...");  
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable1 ref=new Runnable1();
		Thread t1 =new Thread(ref);  
		t1 .start();
	} 
  
}
