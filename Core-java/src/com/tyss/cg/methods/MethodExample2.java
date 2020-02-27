package com.tyss.cg.methods;

public class MethodExample2 {
	public void displayMessage() {	// Method declaration
		System.out.println("Start of displayMessage()");
		System.out.println("Hello World");
		System.out.println("End of diplayMessage");
		System.out.println("Returning to calling method");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodExample2 a=new MethodExample2();
		System.out.println("Called displayMessage() via oject()...");
		a.displayMessage();
		System.out.println("End of the main method");
   
	}

}
