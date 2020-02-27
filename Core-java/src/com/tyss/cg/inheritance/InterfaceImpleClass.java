package com.tyss.cg.inheritance;

public class InterfaceImpleClass implements MethodsInterface,AnotherMethodsInterface {

	@Override
	public void displayMessage() {
		
		System.out.println("Overridden displayMessage() of methodsInterface");
	}

	@Override
	public void printMessage() {
		System.out.println("Overridden printMessage() of MethodsInterface");		
	}

	
	public void messageDisplay() {
		System.out.println("Overridden messageDisplay() of AnotherMethodsInterface ");
		
	}
	public static void main(String[] args) {
		MethodsInterface ref=new InterfaceImpleClass();
		ref.printMessage();
		ref.displayMessage();
		AnotherMethodsInterface ref1= new InterfaceImpleClass();
		ref1.messageDisplay();
		
		System.out.println();
		InterfaceImpleClass ref2=new InterfaceImpleClass();
		ref2.printMessage();
		ref2.displayMessage();
		ref2.messageDisplay();
		
	}
	
}
