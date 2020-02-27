package com.tyss.cg.threads;

public class PrintingClassMethodClass2 extends Thread {
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			for(int i=1;i<10;i++) {
				System.err.println("Printing Value: " + i);
			}
			
		
	}
} 
