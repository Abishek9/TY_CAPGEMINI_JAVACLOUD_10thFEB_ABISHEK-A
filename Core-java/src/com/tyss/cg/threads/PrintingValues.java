package com.tyss.cg.threads;

public class PrintingValues {
	
	
	public static void main(String[] args) {
		System.out.println("+++++++Application started+++++");
		
//		new PrintingClassMethodClass1().start();
		PrintingClassMethodClass1 printingClassMethodClass1=new PrintingClassMethodClass1();
//		try {
//			printingClassMethodClass1.join();
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		printingClassMethodClass1.start();
		
//		new Thread(new PrintingClassMethodClass2()).start();
		
		Thread thread= new Thread(new  PrintingClassMethodClass2());
//		try {
//			thread.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace(); 
//		}
		thread.start();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("+++++++Application ended+++++");
	}
}
 