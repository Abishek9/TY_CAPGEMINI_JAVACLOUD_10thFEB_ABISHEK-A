package com.tyss.cg.threads;

public class PrintingApplication {
	public void printingDocuments(String document, int numOfCopies) {
		
		for (int i = 1; i <= numOfCopies; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(">> Printing " + document + " # " + i);
		}
	}
}
