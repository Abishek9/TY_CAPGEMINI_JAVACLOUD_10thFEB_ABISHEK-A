package com.tyss.cg.threads;

public class CustomThreadTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object object1=new Object();
		Object object2=new Object();
		
		new CustomThread1(object1, object2).start();
		new CustomThread2(object1, object2).start();
		
//		System.out.println("Object1 address: "+object1);
//		System.out.println("Object2 address: "+object2);
		

	}

}
