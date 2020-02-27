package com.tyss.cg.inheritance;

public class MethodsInterfaceJ8Impl implements MethodsInterface {

	@Override
	public void displayMessage() {
		System.out.println("Overridden display Message() of MethodsInterface ");

	}

	@Override //
	public void printMessage() {
		System.out.println("Overridden printMessage() of MethodsInterface");

	}

	public static void main(String[] args) {
		MethodsInterfaceJ8Impl ref = new MethodsInterfaceJ8Impl();
		ref.displayMessage();
		ref.displayMessage();
		ref.defaultMethodMessage();
		MethodsInterface.showMessage();

	}
}
