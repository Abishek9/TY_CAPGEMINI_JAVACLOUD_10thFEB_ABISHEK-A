package com.tyss.cg.methods;

public class MethodOverloadingExample {
	public static void displayMessage()
	{
		System.out.println("pulic static void displayMessage...");
	}
	
	//Overloaded Method
	public static void displayMessage(String string)
	{
		System.out.println("public static void displayMessage(String string)...");
	}
	public void displayMessage(String string,int i)
	{
		System.out.println("public void displayMessage(String string,int i)...");
	}
	public void displayMessage(int i,String string)
	{
		System.out.println("public void displayMessage(int i,String string)...");
	}


	public static void main(String[] args) {
		//Calling static members using classname.methodname
		MethodOverloadingExample.displayMessage();
		MethodOverloadingExample.displayMessage("Abi");
		
		//Calling static members using method name
		displayMessage();
		displayMessage("Abi");
		
		//Calling non-static members by creating object
		//By creating object we can call both static and non-static
		MethodOverloadingExample ref= new MethodOverloadingExample();
		ref.displayMessage();
		ref.displayMessage("Abi");
		ref.displayMessage("Abi",18);
		ref.displayMessage(18,"Abi");
		
		ref.getClass();
		ref.hashCode();
		
	}

}
