package com.tyss.cg.threads;

public class ComputerSystem1 extends Thread {
	PrintingApplication printingApplication;

	public ComputerSystem1(PrintingApplication localPrintermachine) {
		this.printingApplication = localPrintermachine;
	}

	@Override
	public void run() {
		System.err.println(">>> Printing from ComputerSystem1...");
		printingApplication.printingDocuments("AnyDocument.pdf", 10);
	}
}
