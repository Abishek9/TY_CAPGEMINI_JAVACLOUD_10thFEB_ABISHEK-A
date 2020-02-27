package com.tyss.cg.threads;

public class ComputerSystem2 extends Thread{
	PrintingApplication printingApplication;

	public ComputerSystem2(PrintingApplication localPrintermachine) {
		this.printingApplication = localPrintermachine;
	}
		@Override
		public void run() {
			System.err.println(">>> Printing from ComputerSystem2...");
			printingApplication.printingDocuments("SomeOtherDocument.pdf", 10);
		}
}
