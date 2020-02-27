package com.tyss.cg.inheritance;

public interface MethodsInterface {
	public void displayMessage();
	public void printMessage();
	
	public static void showMessage()
	{
		System.out.println("public static showMessage");
	}
	
	default void defaultMethodMessage() {
		System.out.println("default void defaultMethodMessage");
	}
}
