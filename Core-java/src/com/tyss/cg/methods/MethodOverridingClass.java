package com.tyss.cg.methods;

public class MethodOverridingClass extends Methods { 
	@Override
	public String printMessage() {
		return "non-static MethodOverrideClass.printMessage()";
	}
	
//	@Override // cannot override static methods
	public static String displayMessage()
	{
		return "Static MethodOverridingClass.displayMessage()";
	}
	
	@Override
	protected String welcomeMessage()
	{
		return super.welcomeMessage();
	}
	
	@Override
	int addingTwoIntegers(int i,int j)
	{
		return super.addingTwoIntegers(5,2);
	}
	
	
	public static void main(String[] args) {
		MethodOverridingClass methodoverloadingclass=new MethodOverridingClass();
		System.out.println(methodoverloadingclass.printMessage());
		System.out.println(methodoverloadingclass.welcomeMessage());
		System.out.println(methodoverloadingclass.addingTwoIntegers(2, 3));
		System.out.println(Methods.displayMessage());
		System.out.println(displayMessage());
	}

}
