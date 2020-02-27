package com.tyss.cg.methods;

public class MethodExample1 {

	public static void displayMessage() { // called method
		System.out.println("Execution comes to displaying method");
		System.out.println("Hello World");
		System.out.println("End of display Method");

	}

	public static void main(String[] args) {
		System.out.println("Display Method is called");
		displayMessage(); // calling method
		System.out.println("End of main method");
	}

//	public static void displayMessage1() {
//		public static void displayMessage()	//Method inside a method is not possible
//		
//		System.out.println("Hello World");
//		
//	}

}
