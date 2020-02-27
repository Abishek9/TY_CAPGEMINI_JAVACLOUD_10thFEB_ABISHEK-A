package com.tyss.cg.assignment;

public class Thread1 extends Thread {
	public void run() {
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<10;i++) {
			System.err.println(i);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread1 ref= new Thread1();
		Thread2 ref1= new Thread2();
		ref.start();
		ref.join();
		ref1.start();
		ref1.join();
		
		
		
	}

}
