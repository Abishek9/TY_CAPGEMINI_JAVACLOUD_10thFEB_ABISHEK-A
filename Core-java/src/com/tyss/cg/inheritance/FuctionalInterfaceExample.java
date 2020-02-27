package com.tyss.cg.inheritance;

@FunctionalInterface // allows to write only one abstract method
public interface FuctionalInterfaceExample {
	public void showMessage();
//	public void display() ;
//	public void printMessage() ;

	public static void printMessage() {
		System.out.println("public static printMessage() of FunctionalInterfaceExample");
	}

	default void displayMessage() {
		System.out.println("default displayMessage() of FunctionalInterfaceExample");
	}

	public static void printMessage1() {
		System.out.println("Hello World");
	}

	default void displayMessage2() {
		System.out.println("default displayMessage() of FunctionalInterfaceExample");
	}

}
