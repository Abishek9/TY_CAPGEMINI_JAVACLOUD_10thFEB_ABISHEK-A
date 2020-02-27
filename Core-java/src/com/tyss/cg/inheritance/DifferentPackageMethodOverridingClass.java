package com.tyss.cg.inheritance;

import com.tyss.cg.methods.Methods;

public class DifferentPackageMethodOverridingClass extends Methods {
	
	@Override
	public String printMessage() {
		
		return "DIfferentPackageMethodOverridingClass.printMessage()";
	}
	@Override
	protected String welcomeMessage() {
		
		return "Hello world from DIfferentPackageMethodOverridingClass";
	}
	
	public static void main(String[] args) {
		DifferentPackageMethodOverridingClass ref1=new DifferentPackageMethodOverridingClass();
		System.out.println(ref1.printMessage());
		System.out.println(ref1.welcomeMessage());
	}
	
	

}
